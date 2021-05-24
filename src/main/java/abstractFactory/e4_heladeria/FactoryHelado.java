package abstractFactory.e4_heladeria;

public class FactoryHelado {

    public enum typeHelado {
        HELADO_AGUA, HELADO_CREMA, HELADO_MIXTO
    }

    public static IHelado make(typeHelado type){
        IHelado helado;
        switch (type) {
            case HELADO_AGUA:
                helado = new HeladoAgua();
                ((HeladoAgua)helado).setWICBase(new Base("Cono","Mediano","Galleta","5 Bs."));
                ((HeladoAgua)helado).setWICFruit(new Fruta("--","--","--","0 Bs."));
                ((HeladoAgua)helado).setWICSize("Mediano");
                ((HeladoAgua)helado).setWICForm("Clásica");
                break;
            case HELADO_CREMA:
                helado = new HeladoCrema();
                ((HeladoCrema)helado).setCICBase(new Base("Cono","Mediano","Galleta","5 Bs."));
                ((HeladoCrema)helado).setCICFruit(new Fruta("--","--","--","0 Bs."));
                ((HeladoCrema)helado).setCICSize("Mediano");
                ((HeladoCrema)helado).setCICForm("Clásica");
                ((HeladoCrema)helado).setCICCream(new Crema("Frutilla", "Pil", "10 Bs."));
                break;
            case HELADO_MIXTO:
                helado = new HeladoMixto();
                ((HeladoMixto)helado).setMICBase(new Base("Cono","Mediano","Galleta","5 Bs."));
                ((HeladoMixto)helado).setMICFruit(new Fruta("--","--","--","0 Bs."));
                ((HeladoMixto)helado).setMICSize("Mediano");
                ((HeladoMixto)helado).setMICForm("Clásica");
                ((HeladoMixto)helado).setMICCream(new Crema("Frutilla", "Pil", "10 Bs."));
                ((HeladoMixto)helado).setMICPrice("50 Bs.");
                break;
            default:
                helado = new HeladoAgua();
                break;
        }
        return helado;
    }


}
