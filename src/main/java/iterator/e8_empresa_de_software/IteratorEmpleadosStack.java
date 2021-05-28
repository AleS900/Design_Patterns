package iterator.e8_empresa_de_software;

import java.util.Vector;

public class IteratorEmpleadosStack implements Iterator{
    private Vector<String> stk_employees;
    private int position;

    public IteratorEmpleadosStack(Vector<String> stk_employees){
        this.stk_employees = stk_employees;
    }

    @Override
    public Object next() {
        return stk_employees.get(position++);
    }

    @Override
    public boolean hasNext() {
        return stk_employees.size() != 0 && position < stk_employees.size();
    }
}
