package abstractFactory.e4_heladeria;

public class Client {
    public static void main (String []args){
        //HELADOS DE AGUA
        //1.
        System.out.println("Helado 1:");
        HeladoAgua ice_cream1 = (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        ice_cream1.setWICBase(new Base("Cono", "Grande", "Barquillo", "5 Bs."));
        ice_cream1.setWICFruit(new Fruta("Frutos Rojos", "Frutilla", "Mediano", "10 Bs."));
        ice_cream1.setWICSize("Grande");
        ice_cream1.create();
        //2.
        System.out.println("Helado 2:");
        HeladoAgua ice_cream2 = (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        ice_cream2.setWICFruit(new Fruta("Cítrico", "Mandarina", "Pequeño", "8 Bs."));
        ice_cream2.setWICForm("Espiral");
        ice_cream2.create();
        //3.
        System.out.println("Helado 3:");
        HeladoAgua ice_cream3 = (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        ice_cream3.setWICBase(new Base("Canasta", "Mediano", "Galleta", "7 Bs."));
        ice_cream3.setWICFruit(new Fruta("Frutos Rojos", "Mora/Frutilla", "Mediano", "18 Bs."));
        ice_cream3.create();

        //HELADOS DE CREMA
        //4.
        System.out.println("Helado 4:");
        HeladoCrema ice_cream4 = (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        ice_cream4.setCICBase(new Base("Canasta", "Grande", "Galleta", "12 Bs."));
        ice_cream4.setCICFruit(new Fruta("Tropical", "Piña", "Grande", "10 Bs."));
        ice_cream4.setCICSize("Grande");
        ice_cream4.create();
        //5.
        System.out.println("Helado 5:");
        HeladoCrema ice_cream5 = (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        ice_cream5.setCICBase(new Base("Canasta","Mediano","Barquillo","10 Bs."));
        ice_cream5.setCICFruit(new Fruta("Frutos Rojos", "Arandanos", "Mediano", "8 Bs."));
        ice_cream5.setCICCream(new Crema("Vainilla", "Delizia", "15 Bs."));
        ice_cream5.setCICForm("Espiral");
        ice_cream5.setCICSize("Grande");
        ice_cream5.create();
        //6.
        System.out.println("Helado 6:");
        HeladoCrema ice_cream6 = (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        ice_cream6.setCICBase(new Base("Cono","Pequeño","Galleta","8 Bs."));
        ice_cream6.setCICCream(new Crema("Coco", "Pil", "12 Bs."));
        ice_cream6.setCICSize("Pequeño");
        ice_cream6.create();

        //HELADOS MIXTOS
        //7.
        System.out.println("Helado 7:");
        HeladoMixto ice_cream7 = (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        ice_cream7.setMICBase(new Base("Canasta", "Extra-Grande", "Galleta", "20 Bs."));
        ice_cream7.setMICFruit(new Fruta("Frutos Rojos", "Frutilla/Mora", "Grande", "15 Bs."));
        ice_cream7.setMICSize("Extra-Grande");
        ice_cream7.setMICPrice("70 Bs.");
        ice_cream7.create();
        //8.
        System.out.println("Helado 8:");
        HeladoMixto ice_cream8 = (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        ice_cream8.setMICFruit(new Fruta("Tropical", "Maracuya", "Mediana", "12 Bs."));
        ice_cream8.setMICForm("Glaceado");
        ice_cream8.setMICSize("Grande");
        ice_cream8.create();
        //9.
        System.out.println("Helado 9:");
        HeladoMixto ice_cream9 = (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        ice_cream9.setMICFruit(new Fruta("Frutos Rojos", "Frutill/Arandano/Cereza", "Pequeña", "15 Bs."));
        ice_cream9.setMICCream(new Crema("Vainilla", "Pil", "12 Bs."));
        ice_cream9.setMICSize("Mediano");
        ice_cream9.create();


    }
}
