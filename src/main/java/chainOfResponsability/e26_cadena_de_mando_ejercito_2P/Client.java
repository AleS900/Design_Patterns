package chainOfResponsability.e26_cadena_de_mando_ejercito_2P;

public class Client {
    public static void main (String[] args){
        CuerpoDelEjercito cuerpoDelEjercito =  new CuerpoDelEjercito();

        cuerpoDelEjercito.atenderOrden(new OrdenDeMando("OR-524","Entrevistas"));
        cuerpoDelEjercito.atenderOrden(new OrdenDeMando("OR-525","Disciplina"));
        cuerpoDelEjercito.atenderOrden(new OrdenDeMando("OR-526","Manifestaciones"));
        cuerpoDelEjercito.atenderOrden(new OrdenDeMando("OR-527","Desbloqueos"));
        cuerpoDelEjercito.atenderOrden(new OrdenDeMando("OR-528","Limpiezas"));
        cuerpoDelEjercito.atenderOrden(new OrdenDeMando("OR-529","Otro"));
    }
}
