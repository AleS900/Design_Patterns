package chainOfResponsability.e20_algoritmos_de_ordenamiento;

public interface IHandler  {
        void setNext(IHandler handler);
        IHandler next();
        void identificarAlgoritmo(ArregloPersonas person_arr);
}
