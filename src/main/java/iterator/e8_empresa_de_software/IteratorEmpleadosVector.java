package iterator.e8_empresa_de_software;

import java.util.Vector;

public class IteratorEmpleadosVector implements Iterator {
    private Vector<String> vec_employees;
    private int position;

    public IteratorEmpleadosVector(Vector<String> vec_employees){
        this.vec_employees = vec_employees;
        this.position=0;
    }

    @Override
    public Object next() {
        return this.vec_employees.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.vec_employees.size() !=0 && this.vec_employees.size() > position;
    }
}
