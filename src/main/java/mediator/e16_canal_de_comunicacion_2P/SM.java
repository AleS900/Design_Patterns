package mediator.e16_canal_de_comunicacion_2P;

public class SM extends Colleague {
    private String sm_position;
    private String sm_name;
    private Integer sm_id;
    private String sm_certification;

    public SM(ICanalDeComunicacion mediator, String sm_position, String sm_name, Integer sm_id, String sm_certification) {
        super(mediator);
        this.sm_position = sm_position;
        this.sm_name = sm_name;
        this.sm_id = sm_id;
        this.sm_certification = sm_certification;
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("--INFO - *****Message Received**** -- "+ sm_position + " , "+ sm_name + " -- CERT: " + sm_certification +"\n  >> " + message);
    }

    public String getSmPosition() {
        return sm_position;
    }

    public void setSmPosition(String sm_position) {
        this.sm_position = sm_position;
    }

    public String getSmName() {
        return sm_name;
    }

    public void setSmName(String sm_name) {
        this.sm_name = sm_name;
    }

    public Integer getSmId() {
        return sm_id;
    }

    public void setSmId(Integer sm_id) {
        this.sm_id = sm_id;
    }

    public String getSmCertification() {
        return sm_certification;
    }

    public void setSmCertification(String sm_certification) {
        this.sm_certification = sm_certification;
    }
}
