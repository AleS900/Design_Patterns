package chainOfResponsability.e20_algoritmos_de_ordenamiento;

public class Client {
    public static void main (String[] args) {
        IdentificadorAlgoritmo algorithm = new IdentificadorAlgoritmo();

        Persona p1 = new Persona("1110", "Carlos", 20);
        Persona p2 = new Persona("1111", "Natalia", 22);
        Persona p3 = new Persona("1112", "Sofia", 21);
        Persona p4 = new Persona("1113", "Enrique", 19);
        Persona arr_1[] = {p1, p2, p3, p4};
        ArregloPersonas arr_p1 = new ArregloPersonas("arr-1", arr_1);
        algorithm.identificarAlgoritmo(arr_p1);

        Persona p01 = new Persona("1110", "Carlos", 20);
        Persona p02 = new Persona("1111", "Natalia", 22);
        Persona p03 = new Persona("1112", "Sofia", 21);
        Persona p04 = new Persona("1113", "Enrique", 19);
        Persona p05 = new Persona("1114", "Karla", 17);
        Persona p06 = new Persona("1115", "Rocio", 16);
        Persona p07 = new Persona("1116", "Melany", 25);
        Persona p08 = new Persona("1117", "Jorge", 16);
        Persona p09 = new Persona("1118", "Pedro", 27);
        Persona p10 = new Persona("1119", "Santiago", 29);
        Persona p11 = new Persona("1120", "Daniel", 40);
        Persona p12 = new Persona("1121", "Rodolfo", 65);
        Persona p13 = new Persona("1122", "Sol", 33);
        Persona p14 = new Persona("1123", "Luz", 25);
        Persona p15 = new Persona("1124", "Clara", 76);
        Persona p16 = new Persona("1125", "Alexis", 11);
        Persona p17 = new Persona("1126", "Alexander", 16);
        Persona p18 = new Persona("1127", "Perla", 15);
        Persona p19 = new Persona("1128", "Nicolas", 21);
        Persona p20 = new Persona("1129", "Nicole", 15);
        Persona p21 = new Persona("1130", "Rodo", 14);
        Persona arr_2[] = {p01, p02, p03, p04, p05, p06, p07, p08, p09, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21};
        ArregloPersonas arr_p2 = new ArregloPersonas("arr-2", arr_2);
        algorithm.identificarAlgoritmo(arr_p2);
    }
}
