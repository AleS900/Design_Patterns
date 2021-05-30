package prototype.e12_contrato_de_docentes;

public class Client {
    public static void main(String[] args) {
        ContratoDocente input = new ContratoDocente();
        input.setTeacher(new Docente("---","---","---"));
        input.setSalary("5000 Bs.");
        input.setWorkload("80 horas");
        input.setHighEducationCourse(Boolean.TRUE);
        input.setAccessToThePlatform(Boolean.TRUE);
        input.setBiometricReg(Boolean.FALSE);
        input.setCheckInTime("08:00");
        input.setDepartureTime("18:00");
        //1.
        ContratoDocente teacher1 = (ContratoDocente)input.clone();
        teacher1.setTeacher(new Docente("1670597","Liz","Fuentes"));
        //2.
        ContratoDocente teacher2 = (ContratoDocente)input.clone();
        teacher2.setTeacher(new Docente("2447979","Jorge","Almendras"));
        //3.
        ContratoDocente teacher3 = (ContratoDocente)input.clone();
        teacher3.setTeacher(new Docente("7825985","Erwin","Taborga"));
        //4.
        ContratoDocente teacher4 = (ContratoDocente)input.clone();
        teacher4.setTeacher(new Docente("5198787","Jorge","Vizcarra"));
        //5.
        ContratoDocente teacher5 = (ContratoDocente)input.clone();
        teacher5.setTeacher(new Docente("6414759","Juan Víctor","Camargo"));
        //6.
        ContratoDocente teacher6 = (ContratoDocente)input.clone();
        teacher6.setTeacher(new Docente("8748379","Enrique","Corrales"));
        //7.
        ContratoDocente teacher7 = (ContratoDocente)input.clone();
        teacher7.setTeacher(new Docente("9947730","Daniel","Ugarte"));
        //8.
        ContratoDocente teacher8 = (ContratoDocente)input.clone();
        teacher8.setTeacher(new Docente("1671593","Jhonny","Gumucio"));
        //9.
        ContratoDocente teacher9 = (ContratoDocente)input.clone();
        teacher9.setTeacher(new Docente("2891200","Hugo","Sarmiento"));
        //10.
        ContratoDocente teacher10 = (ContratoDocente)input.clone();
        teacher10.setTeacher(new Docente("4228631","Carmen","Rodriguéz"));
        //11.
        ContratoDocente teacher11 = (ContratoDocente)input.clone();
        teacher11.setTeacher(new Docente("7941909","Karina","Mendienta"));
        //12.
        ContratoDocente teacher12 = (ContratoDocente)input.clone();
        teacher12.setTeacher(new Docente("5934267","Gustavo","Selaya"));
        //13.
        ContratoDocente teacher13 = (ContratoDocente)input.clone();
        teacher13.setTeacher(new Docente("6626159","Cinthia","Sevillano"));
        //14.
        ContratoDocente teacher14 = (ContratoDocente)input.clone();
        teacher14.setTeacher(new Docente("7849340","Norka","Mireya"));
        //15.
        ContratoDocente teacher15 = (ContratoDocente)input.clone();
        teacher15.setTeacher(new Docente("7449551","José","Mercado"));

        teacher1.showInformation();
        teacher2.showInformation();
        teacher3.showInformation();
        teacher4.showInformation();
        teacher5.showInformation();
        teacher6.showInformation();
        teacher7.showInformation();
        teacher8.showInformation();
        teacher9.showInformation();
        teacher10.showInformation();
        teacher11.showInformation();
        teacher12.showInformation();
        teacher13.showInformation();
        teacher14.showInformation();
        teacher15.showInformation();
    }
}
