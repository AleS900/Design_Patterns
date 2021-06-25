package composite.e36_computadoras_laboratorios_contenedores_PF;

public class Client {
    public static void main(String[] args) {

        CompositeArtefacto computer_a = new CompositeArtefacto("3434-PC", "Computadora");
        CompositeArtefacto computer_b = new CompositeArtefacto("3435-PC", "Computadora");
        CompositeArtefacto computer_c = new CompositeArtefacto("3436-PC", "Computadora");
        CompositeArtefacto computer_d = new CompositeArtefacto("3437-PC", "Computadora");
        CompositeArtefacto computer_e = new CompositeArtefacto("3438-PC", "Computadora");
        CompositeArtefacto computer_f = new CompositeArtefacto("3439-PC", "Computadora");

        CompositeArtefacto laboratory_a = new CompositeArtefacto("15-LAB","Laboratorio");
        laboratory_a.add(computer_a);
        laboratory_a.add(computer_c);

        CompositeArtefacto laboratory_b = new CompositeArtefacto("25-LAB","Laboratorio");
        laboratory_b.add(computer_a);
        laboratory_b.add(computer_b);
        laboratory_b.add(computer_c);

        CompositeArtefacto laboratory_c = new CompositeArtefacto("35-LAB","Laboratorio");
        laboratory_c.add(computer_a);
        laboratory_c.add(computer_b);
        laboratory_c.add(computer_c);
        laboratory_c.add(computer_d);
        laboratory_c.add(computer_e);
        laboratory_c.add(computer_f);

        CompositeArtefacto laboratory_d = new CompositeArtefacto("45-LAB","Laboratorio");
        laboratory_d.add(computer_d);
        laboratory_d.add(computer_e);
        laboratory_d.add(computer_f);

        CompositeArtefacto laboratory_e = new CompositeArtefacto("55-LAB","Laboratorio");
        laboratory_e.add(computer_f);
        laboratory_e.add(computer_a);

        CompositeArtefacto container_a = new CompositeArtefacto("42551-AC", "Contenedor");
        container_a.add(laboratory_a);
        container_a.add(laboratory_b);
        container_a.add(laboratory_c);
        container_a.add(laboratory_d);

        //1.
        container_a.calculatePrice();
        container_a.showTotalAmount();
    }
}
