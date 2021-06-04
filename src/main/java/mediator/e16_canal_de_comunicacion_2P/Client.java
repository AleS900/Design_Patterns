package mediator.e16_canal_de_comunicacion_2P;

public class Client {
    public static void main(String[] args) {
        Skype skype = new Skype();
        //QA
        //1.
        QA qa1 = new QA(skype,"QA","Céspedes Alejandro",9890202, "Licenciado");
        //2.
        QA qa2 = new QA(skype, "QA", "Mejía Ismael", 9150331, "Master");
        //3.
        QA qa3 = new QA(skype,"QA","Claure Gabriel", 10962455, "Doctor");

        //DEV
        //1.
        DEV dev1 = new DEV(skype,"DEV","Zamora Isabel",9173817, "Python");
        //2.
        DEV dev2 = new DEV(skype,"DEV","Mendieta Brayan",11040510, "Javascript");
        //3.
        DEV dev3 = new DEV(skype,"DEV","Montecarlo Mireya",11054116, "Ruby");

        //SM
        //1.
        SM sm1 = new SM(skype,"SM","Rosales Gabriela",6168810, "CertiProf, CeoLevel");
        //2.
        SM sm2 = new SM(skype,"SM","Pereira Mauricio",5109830, "SAFe");
        //3.
        SM sm3 = new SM(skype,"SM","Alí Alexandra",6461112, "CeoLevel");

        //Adicionándolos al Chat
        //QA
        skype.addPeopleToList(qa1);
        skype.addPeopleToList(qa2);
        skype.addPeopleToList(qa3);
        //DEV
        skype.addPeopleToList(dev1);
        skype.addPeopleToList(dev2);
        skype.addPeopleToList(dev3);
        //SM
        skype.addPeopleToList(sm1);
        skype.addPeopleToList(sm2);
        skype.addPeopleToList(sm3);

        dev1.send("Hola, como estan todos los DEVs");
        System.out.println();
        dev2.send("Todo bien DEVs");
        System.out.println();
        qa2.send("Hola a todos los QAs");
        System.out.println();
        sm1.send("Hola a todos!! Hoy acaba el sprint.");
    }
}
