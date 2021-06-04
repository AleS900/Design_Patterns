package mediator.e16_canal_de_comunicacion_2P;

public class DEV extends Colleague{
    private String dev_position;
    private String dev_name;
    private Integer dev_id;
    private String dev_language;

    public DEV(ICanalDeComunicacion mediator, String dev_position, String dev_name, Integer dev_id, String dev_language) {
        super(mediator);
        this.dev_position = dev_position;
        this.dev_name = dev_name;
        this.dev_id = dev_id;
        this.dev_language = dev_language;
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("--INFO - *****Message Received**** -- " + dev_position + ", "+ dev_name + " (" + dev_language +")\n  >> " + message);
    }

    public String getDevPosition() {
        return dev_position;
    }

    public void setDevPosition(String dev_position) {
        this.dev_position = dev_position;
    }

    public String getDevName() {
        return dev_name;
    }

    public void setDevName(String dev_name) {
        this.dev_name = dev_name;
    }

    public Integer getDevId() {
        return dev_id;
    }

    public void setDevId(Integer dev_id) {
        this.dev_id = dev_id;
    }

    public String getDevLanguage() {
        return dev_language;
    }

    public void setDevLanguage(String dev_language) {
        this.dev_language = dev_language;
    }
}
