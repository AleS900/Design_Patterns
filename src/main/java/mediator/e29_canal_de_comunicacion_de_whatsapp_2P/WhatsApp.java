package mediator.e29_canal_de_comunicacion_de_whatsapp_2P;

import java.util.ArrayList;
import java.util.List;

public class WhatsApp implements ICanalDeComunicacion{
    private List<String> list_of_groups =  new ArrayList<>();
    private List<Usuario> list_of_people = new ArrayList<>();
    Integer ppl_id;

    public void addPersonasAlChat(Usuario usuario){
        list_of_people.add(usuario);
    }

    public void addGruposAlChat(String group){
        list_of_groups.add(group);
    }

    @Override
    public void send(String message, Colleague colleague) {
        Usuario personaParseOrigen = (Usuario)colleague;
        for (Usuario user : list_of_people) {
             for (String group : list_of_groups) {
                if (!personaParseOrigen.getUserNumber().equals(user.getUserNumber())) {
                    if (personaParseOrigen.getUserName().equals("Rocio")) {
                        user.messageReceived(message);
                        System.out.println();
                        break;
                    }
                    if (personaParseOrigen.getUserGroupList().contains(group) && user.getUserGroupList().contains(group)) {
                        user.messageReceived(message);
                    }
                }
            }
        }
    }
}
