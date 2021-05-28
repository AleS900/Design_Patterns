package iterator.e8_empresa_de_software;

import java.util.HashMap;

public class Client {
    public static void main (String[] args){
        ListaEmpleadosList employee_lst = new ListaEmpleadosList();
        ListaEmpleadosArray employee_arr = new ListaEmpleadosArray();
        ListaEmpleadosVector employee_vec = new ListaEmpleadosVector();
        ListaEmpleadosStack employee_stk = new ListaEmpleadosStack();
        HashMap<Integer,String> employee_hmp = new HashMap<>();
        int map_key = 1;
        int number_employees_lst;
        int number_employees_arr;
        int number_employees_vec;
        int number_employees_stk;
        String map_value;

        //Lista Empleados EMPRESA ADQUIRIDA 1 (List)
        employee_lst.add("Romina Rojas");
        employee_lst.add("Roberto Ardaya");
        employee_lst.add("Mauricio Gumucio");
        employee_lst.add("Alexander Castillo");
        employee_lst.add("Natalia Gómez");
        //Lista Empleados EMPRESA ADQUIRIDA 2 (Array)
        employee_arr.add("Rocío Zamora");
        employee_arr.add("Javier Gutierrez");
        employee_arr.add("Pamela Kancahari");
        employee_arr.add("Mirka Aguilar");
        employee_arr.add("Sofía Gómez");
        //Lista Empleados EMPRESA ADQUIRIDA 3 (Vector)
        employee_vec.add("Rodrigo Entrambasaguas");
        employee_vec.add("Juan Pablo Guzmán");
        employee_vec.add("Elmer Sánchez");
        employee_vec.add("Heather Vásquez");
        employee_vec.add("Jhoseline Méndez");
        //Lista Empleados EMPRESA ADQUIRIDA 4 (Stack)
        employee_stk.add("Alejandro Céspedes");
        employee_stk.add("Vannessa Machado");
        employee_stk.add("Cecilia Maita");
        employee_stk.add("Thaelis Zeballos");
        employee_stk.add("Ameluz Sánchez");

        //Lista Empleados EMPRESA TOTAL (HashMap)
        System.out.println("*********** LISTA EMPLEADOS ***********");

        Iterator iterator = employee_lst.iterator();
        while(iterator.hasNext()) {
            map_value = (String) iterator.next();
            employee_hmp.put(map_key, map_value);
            map_key++;
            System.out.println("- EMPRESA A: " + map_value);
        }
        number_employees_lst = map_key - 1;

        iterator = employee_arr.iterator();
        while(iterator.hasNext()){
            map_value = (String)iterator.next();
            employee_hmp.put(map_key, map_value);
            map_key++;
            System.out.println("- EMPRESA B: " + map_value);
        }
        number_employees_arr = map_key - number_employees_lst - 1;

        iterator = employee_vec.iterator();
        while(iterator.hasNext()){
            map_value = (String)iterator.next();
            employee_hmp.put(map_key, map_value);
            map_key++;
            System.out.println("- EMPRESA C: " + map_value);
        }
        number_employees_vec = map_key - number_employees_arr - number_employees_lst - 1;

        iterator = employee_stk.iterator();
        while(iterator.hasNext()){
            map_value = (String)iterator.next();
            employee_hmp.put(map_key, map_value);
            map_key++;
            System.out.println("- EMPRESA D: " + map_value);
        }
        number_employees_stk = map_key - number_employees_vec - number_employees_arr - number_employees_lst - 1;

        System.out.println();
        System.out.println("Número empleados EMPRESA A: " + number_employees_lst);
        System.out.println("Número empleados EMPRESA B: " + number_employees_arr);
        System.out.println("Número empleados EMPRESA C: " + number_employees_vec);
        System.out.println("Número empleados EMPRESA D: " + number_employees_stk);
        System.out.println("Número empleados TOTAL    : " + (map_key - 1));
    }
}
