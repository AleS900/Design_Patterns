package iterator.e8_empresa_de_software;

import java.util.LinkedList;
import java.util.List;

public class ListaEmpleadosList implements IList{

    private List<String> lst_employees;

    public ListaEmpleadosList() {
        lst_employees = new LinkedList<>();
    }

    public void add(String value) {
        lst_employees.add(value);
    }

    @Override
    public Iterator iterator() {
        return new IteratorEmpleadosList(this.lst_employees);
    }
}
