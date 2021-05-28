package iterator.e8_empresa_de_software;

import java.util.Stack;
import java.util.Vector;

public class ListaEmpleadosStack implements IList {

    private Stack<String> stk_employees;

    public ListaEmpleadosStack() {
        stk_employees = new Stack<>();
    }
    public void add(String value) {
        stk_employees.add(value);
    }

    @Override
    public Iterator iterator() {
        return new IteratorEmpleadosStack(this.stk_employees);
    }
}
