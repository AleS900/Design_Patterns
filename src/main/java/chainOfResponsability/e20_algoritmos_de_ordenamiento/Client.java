package chainOfResponsability.e20_algoritmos_de_ordenamiento;

public class Client {
    public static void main (String[] args) {
        IdentificadorAlgoritmo algorithm = new IdentificadorAlgoritmo();

        Persona p1 = new Persona("1110", "Carlos", 20);
        Persona p2 = new Persona("1111", "Natalia", 22);
        Persona p3 = new Persona("1112", "Sofia", 21);
        Persona p4 = new Persona("1113", "Enrique", 19);
        Persona[] arr_1 = {p1, p2, p3, p4};
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
        Persona[] arr_2 = {p01, p02, p03, p04, p05, p06, p07, p08, p09, p10,
                p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21};
        ArregloPersonas arr_p2 = new ArregloPersonas("arr-2", arr_2);
        algorithm.identificarAlgoritmo(arr_p2);


        Persona p22 = new Persona ("1131","Melissa", 27);
        Persona p23 = new Persona("1132", "Viacheslav", 43);
        Persona p24 = new Persona("1133", "Sadko", 25);
        Persona p25 = new Persona("1134", "Jhoseline", 63);
        Persona p26 = new Persona("1135", "David", 63);
        Persona p27 = new Persona("1136", "Darla", 34);
        Persona p28 = new Persona("1137", "Dario", 24);
        Persona p29 = new Persona("1138", "Jhoana", 35);
        Persona p30 = new Persona("1139", "Rider", 56);
        Persona p31 = new Persona("1140", "Gariela", 64);
        Persona p32 = new Persona("1141", "Bary", 15);
        Persona p33 = new Persona("1142", "Mauricio", 40);
        Persona p34 = new Persona("1143", "Mauro", 34);
        Persona p35 = new Persona("1144", "Maya", 25);
        Persona p36 = new Persona("1145", "Guadalupe", 52);
        Persona p37 = new Persona("1146", "Jesús", 56);
        Persona p38 = new Persona("1147", "María", 64);
        Persona p39 = new Persona("1148", "María José", 76);
        Persona p40 = new Persona("1149", "José María", 86);
        Persona p41 = new Persona("1150", "Susan", 23);
        Persona p42 = new Persona ("1151","Patrick", 42);
        Persona p43 = new Persona("1152", "Susana", 54);
        Persona p44 = new Persona("1153", "Noelia", 14);
        Persona p45 = new Persona("1154", "Noel", 13);
        Persona p46 = new Persona("1155", "Mael", 3);
        Persona p47 = new Persona("1156", "Joel", 42);
        Persona p48 = new Persona("1157", "Thamiel", 42);
        Persona p49 = new Persona("1158", "Rosa", 46);
        Persona p50 = new Persona("1159", "Flora", 16);
        Persona p51 = new Persona("1160", "Brayan 2", 27);
        Persona[] arr_3 = {p01, p02, p03, p04, p05, p06, p07, p08, p09, p10,
                p11, p12, p13, p14, p15, p16, p17, p18, p19, p20,
                p21, p22, p23, p24, p25, p26, p27, p28, p29, p30,
                p31, p32, p33, p34, p35, p36, p37, p38, p39, p40,
                p41, p42, p43, p44, p45, p46, p47, p48, p49, p50,
                p51
        };
        ArregloPersonas arr_p3 = new ArregloPersonas("arr-3", arr_3);
        algorithm.identificarAlgoritmo(arr_p3);

    }
}
