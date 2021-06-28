package patternCombinations.e44_empresa_de_reparacion_de_computadoras_PF;

public class Client {
    public static void main(String []args){
        ServicioDeMensajes skype = new ServicioDeMensajes();

        //1. INFORMACION DEL TECNICO
        //// DATOS DISPOSITIVOS
        Tablet tablet = new Tablet("Samsung", "NU-SG1642", "256 GB.","8 GB.", "Android", "Pequeño");
        PC pc =  new PC("HP", "TR-35-53", "2 TB.", "16 GB.", "Windows", "Grande");
        Laptop laptop = new Laptop("Dell", "G3 15", "2 TB.", "18 GB.", "Windows", "Mediano");

        //// DATOS ADMINISTRATIVOS
        System.out.println("******************* SE MUESTRAN LAS NOTIFICACIONES **************************");
        //1.
        Presidente p1 = new Presidente(skype,"Presidente","Céspedes Alejandro",9890202);
        //2.
        Vicepresidente p2 = new Vicepresidente(skype, "Vicepresidente", "Mejía Ismael", 9150331);
        //3.
        Contabilidad p3 = new Contabilidad(skype,"Contabilidad","Claure Gabriel", 10962455);
        //4.
        Bot p4 = new Bot(skype,"Bot","Bot",1);

        System.out.println("\n*******************INFORMACION DEL TECNICO**************************\n");
        TecnicoAsignado tecnico_a = new TecnicoAsignado();
        TecnicoAsignado tecnico_b = new TecnicoAsignado();
        TecnicoAsignado tecnico_c = new TecnicoAsignado();
        tablet.accept(tecnico_a);
        pc.accept(tecnico_b);
        laptop.accept(tecnico_c);


        // SE MUESTRAN LAS NOTIFICACIONES
        skype.addPeopleToList(p1);
        skype.addPeopleToList(p2);
        skype.addPeopleToList(p3);
        skype.addPeopleToList(p4);

        System.out.println("\n*******************NOTIFICACION A ADMINISTRATIVOS**************************\n");

        Thread primerPago = new Thread(new Runnable() {
            @Override
            public void run() {
                Cliente carlos = new Cliente("Carlos", "1517171 OR");
                carlos.pagar(tecnico_a,"156332420 Mercantil Santa Cruz");
            }
        });

        Thread segundoPago = new Thread(new Runnable() {
            @Override
            public void run() {
                Cliente pedro = new Cliente("Pedro", "4034260 LP");
                pedro.pagar(tecnico_b,"156332420 Mercantil Santa Cruz");
            }
        });

        Thread tercerPago = new Thread(new Runnable() {
            @Override
            public void run() {
                Cliente marta = new Cliente("Maria", "1101002 STC");
                marta.pagar(tecnico_c,"156332420 Mercantil Santa Cruz");
            }
        });

        //2. INFORMACION DE LA CUENTA UNICA

        primerPago.start();
        p4.send("Se realizado un pago de: " + tecnico_a.getPrice());
        System.out.println();

        segundoPago.start();
        p4.send("Se realizado un pago de: " + tecnico_b.getPrice());
        System.out.println();

        tercerPago.start();
        p4.send("Se realizado un pago de: " + tecnico_c.getPrice());
        System.out.println();

        System.out.println("\n\n*******************INFORMACION DE LA CUENTA UNICA**************************\n\n");
    }


}
