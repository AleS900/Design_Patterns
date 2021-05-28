package iterator.e8_empresa_de_software;

import java.util.List;
import java.util.Vector;

public class IteratorEmpleadosList implements Iterator {
    private List<String> lst_employees;
    private int position;

    public IteratorEmpleadosList(List<String> lst_employees){
        this.lst_employees = lst_employees;
    }

    @Override
    public Object next() {
        return lst_employees.get(position++);
    }

    @Override
    public boolean hasNext() {
        return lst_employees.size() != 0 && position < lst_employees.size();
    }
}
