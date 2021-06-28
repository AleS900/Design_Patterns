package patternCombinations.e44_empresa_de_reparacion_de_computadoras_PF;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicioDeMensajes  implements IServicioDeMensajes {
    private Map<Integer, Colleague> people_chat = new HashMap<>();
    private List<Integer> list_of_people = new ArrayList<>();
    Integer ppl_id;

    public void addPeopleToList(Colleague peopleToAdd) {
        if (peopleToAdd instanceof Presidente) {
            Presidente qa_to_add = ((Presidente) peopleToAdd);
            ppl_id = qa_to_add.getId();
            list_of_people.add(ppl_id);
            addPeopleToMap(ppl_id, peopleToAdd);
        } else if (peopleToAdd instanceof Vicepresidente) {
            Vicepresidente dev_to_add = ((Vicepresidente) peopleToAdd);
            ppl_id = dev_to_add.getId();
            list_of_people.add(ppl_id);
            addPeopleToMap(ppl_id, peopleToAdd);
        } else if (peopleToAdd instanceof Contabilidad) {
            Contabilidad sm_to_add = ((Contabilidad) peopleToAdd);
            ppl_id = sm_to_add.getId();
            list_of_people.add(ppl_id);
            addPeopleToMap(ppl_id, peopleToAdd);
        } else if (peopleToAdd instanceof Bot) {
            Bot bot_to_add = ((Bot) peopleToAdd);
            ppl_id = bot_to_add.getId();
            list_of_people.add(ppl_id);
            addPeopleToMap(ppl_id, peopleToAdd);
        }
    }

    public void addPeopleToMap(Integer id_people, Colleague people) {
        people_chat.put(id_people, people);
    }

    @Override
    public void send(String message, Colleague colleague) {
        for (int iterator : list_of_people) {
            if (colleague instanceof Bot) {
                Bot smParseOrigen = ((Bot) colleague);
                if (iterator != smParseOrigen.getId()) {
                    people_chat.get(iterator).messageReceived(message);
                }
            /*}else if(colleague instanceof Vicepresidente){
                Vicepresidente qaParseOrigen = ((Vicepresidente) colleague);
                if(iterator != qaParseOrigen.getId()){
                    people_chat.get(iterator).messageReceived(message);
                }
            } else if(colleague instanceof  Contabilidad && people_chat.get(iterator) instanceof Contabilidad){
                Contabilidad devParseOrigen = ((Contabilidad) colleague);
                if(iterator != devParseOrigen.getId()){
                    people_chat.get(iterator).messageReceived(message);
                }
            }*/
            }
        }
    }
}