package memento.e17_back_up_base_de_datos_2P;

import java.util.LinkedList;

public class Client {
    public static void main (String []args){
        DBCareTaker data_base = new DBCareTaker();
        BKOriginator back_up_originator = new BKOriginator();
        LinkedList<Persona> ppl_list = new LinkedList<>();
        ConcreteBackUp back_up;

        // Primer Backup: Se Aregan 4 personas, Total: 4
        Persona person_1 = new Persona("Luis Alarcón", "9054400", "18");
        Persona person_2 = new Persona("Viviana Machado", "6399209", "20");
        Persona person_3 = new Persona("Patrick Gutierrez", "9173233", "21");
        Persona person_4 = new Persona("Rodolfo Condarco", "7755556", "23");
        ppl_list.add(person_1);
        ppl_list.add(person_2);
        ppl_list.add(person_3);
        ppl_list.add(person_4);
        LinkedList bk1_ppl_list = (LinkedList) ppl_list.clone();
        back_up = new ConcreteBackUp("BackUpMarzo", bk1_ppl_list);
        back_up_originator.setState(back_up);
        data_base.createBackUp("BackUpMarzo", back_up_originator.createMemento());

        // Segundo Backup: Se Aregan 3 personas, Total: 7
        Persona person_5 = new Persona("Alejandro Céspedes", "6625074", "19");
        Persona person_6 = new Persona("Isabel Zamora", "8646457", "20");
        Persona person_7 = new Persona("Gabriel Claure", "7605185", "20");
        ppl_list.add(person_5);
        ppl_list.add(person_6);
        ppl_list.add(person_7);
        LinkedList bk2_ppl_list = (LinkedList) ppl_list.clone();
        back_up = new ConcreteBackUp("BackUpAbril", bk2_ppl_list);
        back_up_originator.setState(back_up);
        data_base.createBackUp("BackUpAbril", back_up_originator.createMemento());

        // Primer Backup: Se Aregan 2 personas, Total: 9
        Persona person_8 = new Persona("Rodrigo Entrambasaguas", "7544898", "18");
        Persona person_9 = new Persona("Erick Miranda", "9290226", "22");
        ppl_list.add(person_8);
        ppl_list.add(person_9);
        LinkedList bk3_ppl_list = (LinkedList) ppl_list.clone();
        back_up = new ConcreteBackUp("BackUpMayo", bk3_ppl_list);
        back_up_originator.setState(back_up);
        data_base.createBackUp("BackUpMayo", back_up_originator.createMemento());

        // Primer Backup: Se Aregan 4 personas, Total: 13
        Persona person_10 = new Persona("Alejandro Condarco", "9537053", "23");
        Persona person_11 = new Persona("Hilary Soto", "6754399", "20");
        Persona person_12 = new Persona("Susan Paravicini", "9845711", "18");
        Persona person_13 = new Persona("Mellissa Guzmán", "7442042", "21");
        ppl_list.add(person_10);
        ppl_list.add(person_11);
        ppl_list.add(person_12);
        ppl_list.add(person_13);
        LinkedList bk4_ppl_list = (LinkedList) ppl_list.clone();
        back_up = new ConcreteBackUp("BackUpJunio", bk4_ppl_list);
        back_up_originator.setState(back_up);
        data_base.createBackUp("BackUpJunio", back_up_originator.createMemento());

        // Primer Backup: Se Aregan 2 personas, Total: 15
        Persona person_14 = new Persona("Pamela Canchari", "9608075", "20");
        Persona person_15 = new Persona("Camila Aranibar", "8515358", "19");
        ppl_list.add(person_14);
        ppl_list.add(person_15);
        LinkedList bk5_ppl_list = (LinkedList) ppl_list.clone();
        back_up = new ConcreteBackUp("BackUpJulio", bk5_ppl_list);
        back_up_originator.setState(back_up);
        data_base.createBackUp("BackUpJulio", back_up_originator.createMemento());

        //Recuperando o restaurando algun estado (Memento)
        back_up_originator.restoreFromMemento(data_base.getMemento("BackUpAbril"));
    }
}
