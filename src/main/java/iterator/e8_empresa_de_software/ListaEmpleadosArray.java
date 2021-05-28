package iterator.e8_empresa_de_software;

public class ListaEmpleadosArray implements IList {

    private String [] arr_employees;
    private int position;

    public ListaEmpleadosArray() {
        position=0;
        arr_employees = new String[5];
    }

    public void add(String value){
        arr_employees[position]=value;
        position++;
    }

    @Override
    public Iterator iterator() {
        return new IteratorEmpleadosArray(this.arr_employees);
    }
}
