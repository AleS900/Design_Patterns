package chainOfResponsability.e20_algoritmos_de_ordenamiento;

public class IdentificadorAlgoritmo implements IHandler {
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
        ALG1SelectionSort selectionSort = new ALG1SelectionSort();
        this.setNext(selectionSort);

        ALG2BubbleSort bubbleSort = new ALG2BubbleSort();
        selectionSort.setNext(bubbleSort);

        ALG3InsertionSort insertionSort = new ALG3InsertionSort();
        bubbleSort.setNext(insertionSort);

        this.next.identificarAlgoritmo(person_arr);
    }
}
