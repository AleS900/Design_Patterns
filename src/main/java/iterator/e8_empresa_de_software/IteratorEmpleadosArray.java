package iterator.e8_empresa_de_software;

public class IteratorEmpleadosArray implements Iterator {
    private String [] arr_employees;
    private int position;

    public IteratorEmpleadosArray(String [] arr_employees){
        this.arr_employees = arr_employees;
    }

    @Override
    public Object next() {
        return arr_employees[position++];
    }

    @Override
    public boolean hasNext() {
        return arr_employees.length != 0 && position < arr_employees.length ;
    }
}
