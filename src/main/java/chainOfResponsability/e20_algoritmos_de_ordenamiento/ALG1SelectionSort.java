package chainOfResponsability.e20_algoritmos_de_ordenamiento;

import java.util.Arrays;

public class ALG1SelectionSort implements IHandler {
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
        if (person_arr.getArr_data().length <= 20){
            System.out.println("*************************************");
            System.out.println("Se tienen un número de personas no");
            System.out.println("mayor a 20, es decir se utilizará");
            System.out.println("el primer algoritmo de ordenación:\n");
            System.out.println("       SELECTION SORT");
            System.out.println("   |  Edad  |   Nombre   |");
            selectionSort(person_arr);
            System.out.println("***********************\n");
        } else {
            this.next.identificarAlgoritmo(person_arr);
        }
    }

    public void selectionSort(ArregloPersonas person_arr){
        int n = person_arr.getArr_data().length;
        Persona[] ss_arr = Arrays.copyOf(person_arr.getArr_data(), n);
        // Límita el movimiento uno por uno del subarreglo sin clasificar
        for (int i = 0; i < n-1; i++) {
            // Encuentra el elemento mínimo en una matriz sin clasificar
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (ss_arr[j].getPers_age() < ss_arr[min_idx].getPers_age())
                    min_idx = j;
            // Intercambia el elemento mínimo encontrado con el primer
            // elemento
            Persona temp = ss_arr[min_idx];
            ss_arr[min_idx] = ss_arr[i];
            ss_arr[i] = temp;
        }
        printArray(ss_arr);
    }

    public void printArray(Persona[] ss_arr){
        for (Persona persona : ss_arr) {
            System.out.print("       " + persona.getPers_age() + "  ---  " + persona.getPers_name() + "\n");
        }
        System.out.println();
    }
}
