package iterator.e8_empresa_de_software;

import java.util.Vector;

public class ListaEmpleadosVector implements IList {

    private Vector<String> vec_employees;

    public ListaEmpleadosVector() {
        vec_employees = new Vector<>();
    }
    public void add(String value) {
        vec_employees.add(value);
    }

    @Override
    public Iterator iterator() {
        return new IteratorEmpleadosVector(this.vec_employees);
    }
}
