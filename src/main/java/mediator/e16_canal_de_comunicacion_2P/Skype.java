package mediator.e16_canal_de_comunicacion_2P;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Skype implements ICanalDeComunicacion{
    private Map<Integer,Colleague> people_chat =  new HashMap<>();
    private List<Integer> list_of_people = new ArrayList<>();
    Integer ppl_id;

    public void addPeopleToList (Colleague peopleToAdd){
        if(peopleToAdd instanceof QA){
            QA qa_to_add = ((QA) peopleToAdd);
            ppl_id = qa_to_add.getQAID();
            list_of_people.add(ppl_id);
            addPeopleToMap(ppl_id, peopleToAdd);
        } else if (peopleToAdd instanceof DEV){
            DEV dev_to_add = ((DEV) peopleToAdd);
            ppl_id = dev_to_add.getDevId();
            list_of_people.add(ppl_id);
            addPeopleToMap(ppl_id, peopleToAdd);
        } else if (peopleToAdd instanceof SM){
            SM sm_to_add = ((SM) peopleToAdd);
            ppl_id = sm_to_add.getSmId();
            list_of_people.add(ppl_id);
            addPeopleToMap(ppl_id, peopleToAdd);
        }
    }

    public void addPeopleToMap (Integer id_people, Colleague people){
        people_chat.put(id_people, people);
    }

    @Override
    public void send(String message, Colleague colleague) {
        Colleague personaParseOrigen = colleague;
        for(int iterator : list_of_people){
            if(personaParseOrigen instanceof SM) {
                SM smParseOrigen = ((SM)personaParseOrigen);
                if(iterator != smParseOrigen.getSmId()){
                    people_chat.get(iterator).messageReceived(message);
                }
            }else if(personaParseOrigen instanceof QA && people_chat.get(iterator) instanceof QA){
                QA qaParseOrigen = ((QA)personaParseOrigen);
                if(iterator != qaParseOrigen.getQAID()){
                    people_chat.get(iterator).messageReceived(message);
                }
            } else if(personaParseOrigen instanceof  DEV && people_chat.get(iterator) instanceof DEV){
                DEV devParseOrigen = ((DEV)personaParseOrigen);
                if(iterator != devParseOrigen.getDevId()){
                    people_chat.get(iterator).messageReceived(message);
                }
            }
        }
    }
}
