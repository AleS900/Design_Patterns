package mediator.e29_canal_de_comunicacion_de_whatsapp_2P;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        WhatsApp whatsApp = new WhatsApp();
        //Lista de Grupos
        String g1 = "Promo 2018";
        String g2 = "Roar";
        String g3 = "Seguridad Informática";
        String g4 = "Proyectito";
        String g5 = "EveryOne";
        whatsApp.addGruposAlChat(g1);
        whatsApp.addGruposAlChat(g2);
        whatsApp.addGruposAlChat(g3);
        whatsApp.addGruposAlChat(g4);
        whatsApp.addGruposAlChat(g5);

        //1.
        List<String> groupList1 = new ArrayList<>();
        groupList1.add(g2);
        //2.
        List<String> groupList2 = new ArrayList<>();
        groupList2.add(g1);
        groupList2.add(g3);
        //3.
        List<String> groupList3 = new ArrayList<>();
        groupList3.add(g1);
        //4.
        List<String> groupList4 = new ArrayList<>();
        groupList4.add(g1);
        groupList4.add(g4);
        groupList4.add(g3);
        //5.
        List<String> groupList5 = new ArrayList<>();
        groupList5.add(g1);
        groupList5.add(g3);
        groupList5.add(g4);
        groupList5.add(g5);

        //Lista de Usuarios
        //1.
        Usuario user_1 = new Usuario(whatsApp, "Carlos", "+591 75339035", groupList1);
        //2.
        Usuario user_2 = new Usuario(whatsApp, "Rodrigo", "+591 70290806", groupList1);
        //3.
        Usuario user_3 = new Usuario(whatsApp, "Juan Pablo", "+591 69472607", groupList3);
        //4.
        Usuario user_4 = new Usuario(whatsApp, "Daniela", "+591 77352812", groupList5);
        //5.
        Usuario user_5 = new Usuario(whatsApp, "Camila", "+591 72721502", groupList4);
        //6.
        Usuario user_6 = new Usuario(whatsApp, "Alejandro", "+591 75418050", groupList3);
        //7.
        Usuario user_7 = new Usuario(whatsApp, "Fernanda", "+591 72517850", groupList2);
        //8.
        Usuario user_8 = new Usuario(whatsApp, "Alexander", "+591 78019907", groupList3);
        //9.
        Usuario user_9 = new Usuario(whatsApp, "Javier", "+591 72865150", groupList5);
        //10.
        Usuario user_10 = new Usuario(whatsApp, "Rocio", "+591 68002133", groupList2);

        whatsApp.addPersonasAlChat(user_1);
        whatsApp.addPersonasAlChat(user_2);
        whatsApp.addPersonasAlChat(user_3);
        whatsApp.addPersonasAlChat(user_4);
        whatsApp.addPersonasAlChat(user_5);
        whatsApp.addPersonasAlChat(user_6);
        whatsApp.addPersonasAlChat(user_7);
        whatsApp.addPersonasAlChat(user_8);
        whatsApp.addPersonasAlChat(user_9);
        whatsApp.addPersonasAlChat(user_10);

        //Conversación 1
        System.out.println("**** PRIMERA CONVERSACION ***\n");
        user_1.send("Hola, Cómo estas?");
        System.out.println();
        user_2.send("Todo bien.");
        System.out.println();
        user_1.send("Me alegra oir eso.");
        System.out.println();
        System.out.println("*****************************\n");

        //Conversación 2
        System.out.println("**** SEGUNDA CONVERSACION ***\n");
        user_10.send("Hola a todos!!!");
        System.out.println("*****************************\n");
    }
}
