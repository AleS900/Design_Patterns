package singleton.e30_prestamo_bancario_2P;

public class Client {
    public static void main (String []argumento){
        Thread primerPago = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona carlos = new Persona();
                carlos.pagar(12,"156332420 Mercantil Santa Cruz");
            }
        });

        Thread segundoPago = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona carlos = new Persona();
                carlos.pagar(7,"156332420 Mercantil Santa Cruz");
            }
        });

        Thread tercerPago = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona carlos = new Persona();
                carlos.pagar(15,"156332420 Mercantil Santa Cruz");
            }
        });

        Thread cuartoPago = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona carlos = new Persona();
                carlos.pagar(25,"156332420 Mercantil Santa Cruz");
            }
        });

        Thread quintoPago = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona carlos = new Persona();
                carlos.pagar(18,"156332420 Mercantil Santa Cruz");
            }
        });

        Thread sextoPago = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona carlos = new Persona();
                carlos.pagar(30,"156332420 Mercantil Santa Cruz");
            }
        });

        //PAGO DEL PRESTAMO
        primerPago.start();
        segundoPago.start();
        tercerPago.start();
        cuartoPago.start();
        quintoPago.start();
        sextoPago.start();


    }


}
