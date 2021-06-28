package patternCombinations.e44_empresa_de_reparacion_de_computadoras_PF;

public class TecnicoAsignado implements IVisitante {
    int price;

    @Override
    public void elegirKit(Laptop laptop) {
        System.out.println("----ARTEFACTO ELECTRONICO: LAPTOP----\n");
        System.out.println("-- Marca            : " + laptop.getTrademark());
        System.out.println("-- Modelo           : " + laptop.getModel());
        System.out.println("-- Almacenamiento   : " + laptop.getStorage());
        System.out.println("-- Memoria RAM      : " + laptop.getRam());
        System.out.println("-- Sistema Operativo: " + laptop.getSo());
        System.out.println("-- Tamaño           : "  + laptop.getSize().toUpperCase());
        System.out.println("-- Precio           : "  + laptop.getPrice());
        System.out.println("\nSE NECESITA UN KIT PARA LAPTOPS");
        setPrice(laptop.getPrice());
        System.out.println("\n-------------------------------------\n\n");
    }

    @Override
    public void elegirKit(PC pc) {
        System.out.println("----ARTEFACTO ELECTRONICO: PC----\n");
        System.out.println("-- Marca            : " + pc.getTrademark());
        System.out.println("-- Modelo           : " + pc.getModel());
        System.out.println("-- Almacenamiento   : " + pc.getStorage());
        System.out.println("-- Memoria RAM      : " + pc.getRam());
        System.out.println("-- Sistema Operativo: " + pc.getSo());
        System.out.println("-- Tamaño           : "  + pc.getSize().toUpperCase());
        System.out.println("-- Precio           : "  + pc.getPrice());
        System.out.println("\nSE NECESITA UN KIT PARA PC");
        setPrice(pc.getPrice());
        System.out.println("\n-------------------------------------\n\n");
    }

    @Override
    public void elegirKit(Tablet tablet) {
        System.out.println("----ARTEFACTO ELECTRONICO: TABLET----\n");
        System.out.println("-- Marca            : " + tablet.getTrademark());
        System.out.println("-- Modelo           : " + tablet.getModel());
        System.out.println("-- Almacenamiento   : " + tablet.getStorage());
        System.out.println("-- Memoria RAM      : " + tablet.getRam());
        System.out.println("-- Sistema Operativo: " + tablet.getSo());
        System.out.println("-- Tamaño           : "  + tablet.getSize().toUpperCase());
        System.out.println("-- Precio           : "  + tablet.getPrice());
        System.out.println("\nSE NECESITA UN KIT PARA TABLET");
        setPrice(tablet.getPrice());
        System.out.println("\n-------------------------------------\n\n");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
