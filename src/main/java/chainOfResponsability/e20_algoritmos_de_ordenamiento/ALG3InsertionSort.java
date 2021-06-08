package chainOfResponsability.e20_algoritmos_de_ordenamiento;

import java.util.Arrays;

public class ALG3InsertionSort implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void identificarAlgoritmo(ArregloPersonas person_arr) {
        if (person_arr.getArr_data().length > 50){
            System.out.println("*************************************");
            System.out.println("Se tienen un número de personas que es");
            System.out.println("mayor a 50, es decir se utilizará");
            System.out.println("el tercer algoritmo de ordenación:\n");
            System.out.println("       INSERTION SORT");
            System.out.println("   |  Edad  |   Nombre   |");
            insertionSort(person_arr);
            System.out.println("***********************\n");
        } else {
            System.out.println("ENTRADA ERRONEA");
        }
    }

    public void insertionSort(ArregloPersonas person_arr){
        int n = person_arr.getArr_data().length;
        Persona[] is_arr = Arrays.copyOf(person_arr.getArr_data(), n);
        for (int i = 1; i < n; i++) {
            Persona key = is_arr[i];
            int j = i - 1;
            while ((j >= 0) && (is_arr[j].getPers_age() > key.getPers_age())) {
                is_arr[j + 1] = is_arr[j];
                j--;
            }
            is_arr[j + 1] = key;
        }
        printArray(is_arr);
    }

    public void printArray(Persona[] is_arr){
        for (Persona persona : is_arr) {
            System.out.print("       " + persona.getPers_age() + "  ---  " + persona.getPers_name() + "\n");
        }
        System.out.println();
    }
}
