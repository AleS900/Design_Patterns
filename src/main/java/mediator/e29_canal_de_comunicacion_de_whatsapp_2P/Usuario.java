package mediator.e29_canal_de_comunicacion_de_whatsapp_2P;

import java.util.List;

public class Usuario extends Colleague {
    private String user_name;
    private String user_number;
    private List<String> user_group_list;

    public Usuario(ICanalDeComunicacion mediator, String user_name, String user_number,  List<String> user_group_list) {
        super(mediator);
        this.user_name = user_name;
        this.user_number = user_number;
        this.user_group_list = user_group_list;
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - MESSAGED RECEIVED; Número: "+ user_number + ", Usuario: " + user_name + " > " +message);
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public String getUserNumber() {
        return user_number;
    }

    public void setUserNumber(String user_number) {
        this.user_number = user_number;
    }

    public List<String> getUserGroupList() {
        return user_group_list;
    }

    public void setUserGroupList(List<String> user_group_list) {
        this.user_group_list = user_group_list;
    }
}
