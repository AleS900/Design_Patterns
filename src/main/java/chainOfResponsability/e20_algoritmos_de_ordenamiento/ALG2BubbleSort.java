package chainOfResponsability.e20_algoritmos_de_ordenamiento;

import java.util.Arrays;

public class ALG2BubbleSort implements IHandler {
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
        if (person_arr.getArr_data().length > 20  && person_arr.getArr_data().length <= 50){
            System.out.println("*************************************");
            System.out.println("Se tienen un número de personas no");
            System.out.println("mayor a 20, es decir se utilizará");
            System.out.println("el primer algoritmo de ordenación:\n");
            System.out.println("       SELECTION SORT");
            System.out.println("   |  Edad  |   Nombre   |");
            bubbleSort(person_arr);
            System.out.println("***********************\n");
        } else {
            this.next.identificarAlgoritmo(person_arr);
        }
    }

    public void bubbleSort(ArregloPersonas person_arr) {
        int n = person_arr.getArr_data().length;
        Persona[] bs_arr = Arrays.copyOf(person_arr.getArr_data(), n);

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++){
                if (bs_arr[j].getPers_age() > bs_arr[j+1].getPers_age())
                {
                    // swap arr[j+1] and arr[j]
                    Persona temp = bs_arr[j];
                    bs_arr[j] = bs_arr[j+1];
                    bs_arr[j+1] = temp;
                }
            }
        }
        printArray(bs_arr);
    }

    public void printArray(Persona[] ss_arr){
        for (Persona persona : ss_arr) {
            System.out.print("       " + persona.getPers_age() + "  ---  " + persona.getPers_name() + "\n");
        }
        System.out.println();
    }
}
