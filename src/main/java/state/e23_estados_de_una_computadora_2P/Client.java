package state.e23_estados_de_una_computadora_2P;

import chainOfResponsability.e20_algoritmos_de_ordenamiento.Persona;

public class Client {
    public static void main(String []args){
        Programa p1 = new Programa(1,"Chrome");
        Programa p2 = new Programa(2,"Firefox");
        Programa p3 = new Programa(3,"Edge");
        Programa p4 = new Programa(4,"Lol");
        Programa p5 = new Programa(5,"Photshop");
        Programa p6 = new Programa(6,"Acrobat Reader");
        Programa p7 = new Programa(7,"Virtual Box");
        Programa p8 = new Programa(8,"Intellij IDEA");
        Programa p9 = new Programa(9,"Word");
        Programa p10 = new Programa(10,"Excel");
        Programa p11 = new Programa(11,"Eclipse");
        Programa p12 = new Programa(12,"Bloc de Notas");
        Programa p13 = new Programa(13,"One Drive");
        Programa p14 = new Programa(14,"Steam");
        Programa p15 = new Programa(15,"Latex");
        Programa p16 = new Programa(16,"Code Blocks");
        Programa p17 = new Programa(17,"PythonPi");
        Programa p18 = new Programa(18,"Zoom");
        Programa p19 = new Programa(19,"Discord");
        Programa p20 = new Programa(20,"Power Point");
        Programa p21 = new Programa(21,"Power Point");
        Programa[] arr = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21};
        ArregloProgramas arr_p = new ArregloProgramas("ARR_1",arr);


        IStateComputadora state = new StateApagado();
        Computadora computadora = new Computadora();
        computadora.setProg_number(0);
        computadora.setState(state);
        computadora.request();

        state = new StatePrendido("Prendido");
        int numero = (int)(Math.random()*20+1);
        computadora.setProg_number(numero);
        computadora.setState(state);
        computadora.request();
        arr_p.showInfo(numero);

        state = new StateReiniciar();
        computadora.setProg_number(0);
        computadora.setState(state);
        computadora.request();
    }
}
