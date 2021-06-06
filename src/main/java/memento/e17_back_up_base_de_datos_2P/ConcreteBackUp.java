package memento.e17_back_up_base_de_datos_2P;

import java.util.List;

public class ConcreteBackUp {
    private String db_nickname;
    private List<Persona> db_data;
    private Integer number = 0;

    public ConcreteBackUp() {
    }

    public ConcreteBackUp(String db_nickname, List<Persona> db_data) {
        this.db_nickname = db_nickname;
        this.db_data = db_data;
    }

    public String getDBNickname() {
        return db_nickname;
    }

    public void setDBNickname(String db_nickname) {
        this.db_nickname = db_nickname;
    }

    public List<Persona> getDBData() {
        return db_data;
    }

    public void setDBData(List<Persona> db_data) {
        this.db_data = db_data;
    }

    public void showInfo(){
        System.out.println("INFO >> Versión de Respaldo : " + db_nickname);
        System.out.println("INFO >> Personas Registradas: ");
        iteratorDB();
        System.out.println("***********------------***********\n");
    }

    public void iteratorDB(){
        number = 0;
        for(Persona it : db_data){
            it.showPeople(++number);
        }
        System.out.println("Total de Personas Registradas: " + number);
    }
}
