package memento.e25_tesis_de_un_estudiante_2P;

public class Client {
    public static void main (String []args){
        DocumentoCareTaker document = new DocumentoCareTaker();
        ReversionOriginator originator = new ReversionOriginator();
        Estudiante student = new Estudiante("24415","Gabriel De La Riva");
        student.showInfo();

        // Versión 1:
        ConcreteTesis tesis;
        String title = "         IMPACTO ACADÉMICO DE LA PANDEMIA EN LAS AREAS\n " +
                       "                 EXACTAS-BIOLÓGICAS PARA ESTUDIANTES DE TERCER\n " +
                       "                 BIOLÓGICAS PARA ESTUDIANTES DE TERCER GRADO DE\n " +
                       "                         SECUNDARIA DEL COLEGIO ALEMAN\n";
        String body =  "INTRODUCCIÓN\n" +
                "En la sociedad en la que vivimos existe una deficiencia de conocimiento de\n" +
                "estas ciencias lo cual se ve reflejado en problemas, actualmente los\n" +
                "estudiantes del nivel secundario muestran dificultades en el aprendizaje de las\n" +
                "''Ciencias Exactas-Biológicas'' (Matemática, Física, Química y Biología), esto se\n" +
                "refleja en el rendimiento académico de algunos estudiantes que puede deberse\n" +
                "a factores tales como la falta de tiempo, poca importancia que le dan a estas\n" +
                "materias y el temor injustificado a una supuesta dificultad, entre otros.\n";
        tesis = new ConcreteTesis(title,body,1);
        originator.setState(tesis);
        document.createVersion(1, originator.createMemento());


        // Versión 2:
        title = "         IMPACTO ACADÉMICO DE LA PANDEMIA EN LAS AREAS\n " +
                "                 EXACTAS-BIOLÓGICAS PARA ESTUDIANTES DE TERCER\n " +
                "                 BIOLÓGICAS PARA ESTUDIANTES DE TERCER GRADO DE\n " +
                "                         SECUNDARIA DEL COLEGIO ALEMAN\n";
        body =  "INTRODUCCIÓN\n" +
                "En la sociedad en la que vivimos existe una deficiencia de conocimiento de\n" +
                "estas ciencias lo cual se ve reflejado en problemas, actualmente los\n" +
                "estudiantes del nivel secundario muestran dificultades en el aprendizaje de las\n" +
                "''Ciencias Exactas-Biológicas'' (Matemática, Física, Química y Biología), esto se\n" +
                "refleja en el rendimiento académico de algunos estudiantes que puede deberse\n" +
                "a factores tales como la falta de tiempo, poca importancia que le dan a estas\n" +
                "materias y el temor injustificado a una supuesta dificultad, entre otros.\n\n" +
                "Al estar en el último grado de nuestra formación académica tenemos como\n" +
                "objetivo continuar con el trabajo basado en ayudantías en el área de ''Exactas-\n" +
                "Biológicas''.";
        tesis = new ConcreteTesis(title,body,2);
        originator.setState(tesis);
        document.createVersion(2, originator.createMemento());


        // Versión 3:
        title = "         IMPACTO ACADÉMICO DE LA PANDEMIA EN LAS AREAS\n " +
                "                 EXACTAS-BIOLÓGICAS PARA ESTUDIANTES DE TERCER\n " +
                "                 BIOLÓGICAS PARA ESTUDIANTES DE TERCER GRADO DE\n " +
                "                         SECUNDARIA DEL COLEGIO ALEMAN\n";
        body =  "INTRODUCCIÓN\n" +
                "En la sociedad en la que vivimos existe una deficiencia de conocimiento de\n" +
                "estas ciencias lo cual se ve reflejado en problemas, actualmente los\n" +
                "estudiantes del nivel secundario muestran dificultades en el aprendizaje de las\n" +
                "''Ciencias Exactas-Biológicas'' (Matemática, Física, Química y Biología), esto se\n" +
                "refleja en el rendimiento académico de algunos estudiantes que puede deberse\n" +
                "a factores tales como la falta de tiempo, poca importancia que le dan a estas\n" +
                "materias y el temor injustificado a una supuesta dificultad, entre otros.\n\n" +
                "Al estar en el último grado de nuestra formación académica tenemos como\n" +
                "objetivo continuar con el trabajo basado en ayudantías en el área de ''Exactas-\n" +
                "Biológicas'' pero con un distinto enfoque que esta vez va dirigido a alumnos de\n" +
                "tercer grado de secundaria con el fin de evitar dificultades en el transcurso del\n" +
                "año tras tener conocimiento de sus notas del primer bimestre.";
        tesis = new ConcreteTesis(title,body,3);
        originator.setState(tesis);
        document.createVersion(3, originator.createMemento());


        // Versión 4:
        title = "         IMPACTO ACADÉMICO DE LA PANDEMIA EN LAS AREAS\n " +
                "                 EXACTAS-BIOLÓGICAS PARA ESTUDIANTES DE TERCER\n " +
                "                 BIOLÓGICAS PARA ESTUDIANTES DE TERCER GRADO DE\n " +
                "                         SECUNDARIA DEL COLEGIO ALEMAN\n";
        body =  "INTRODUCCIÓN\n" +
                "En la sociedad en la que vivimos existe una deficiencia de conocimiento de\n" +
                "estas ciencias lo cual se ve reflejado en problemas, actualmente los\n" +
                "estudiantes del nivel secundario muestran dificultades en el aprendizaje de las\n" +
                "''Ciencias Exactas-Biológicas'' (Matemática, Física, Química y Biología), esto se\n" +
                "refleja en el rendimiento académico de algunos estudiantes que puede deberse\n" +
                "a factores tales como la falta de tiempo, poca importancia que le dan a estas\n" +
                "materias y el temor injustificado a una supuesta dificultad, entre otros.\n\n" +
                "Al estar en el último grado de nuestra formación académica tenemos como\n" +
                "objetivo continuar con el trabajo basado en ayudantías en el área de ''Exactas-\n" +
                "Biológicas'' pero con un distinto enfoque que esta vez va dirigido a alumnos de\n" +
                "tercer grado de secundaria con el fin de evitar dificultades en el transcurso del\n" +
                "año tras tener conocimiento de sus notas del primer bimestre, mediante clases\n" +
                "en horarios extracurriculares en las materias de matemática, química, física y\n" +
                "biología. Ya que existen algunos alumnos con la necesidad de dichas clases.\n";
        tesis = new ConcreteTesis(title,body,4);
        originator.setState(tesis);
        document.createVersion(4, originator.createMemento());


        // Versión 5:
        title = "         IMPACTO ACADÉMICO DE LA PANDEMIA EN LAS AREAS\n " +
                "                 EXACTAS-BIOLÓGICAS PARA ESTUDIANTES DE TERCER\n " +
                "                 BIOLÓGICAS PARA ESTUDIANTES DE TERCER GRADO DE\n " +
                "                         SECUNDARIA DEL COLEGIO ALEMAN\n";
        body =   "INTRODUCCIÓN\n" +
                "En la sociedad en la que vivimos existe una deficiencia de conocimiento de\n" +
                "estas ciencias lo cual se ve reflejado en problemas, actualmente los\n" +
                "estudiantes del nivel secundario muestran dificultades en el aprendizaje de las\n" +
                "''Ciencias Exactas-Biológicas'' (Matemática, Física, Química y Biología), esto se\n" +
                "refleja en el rendimiento académico de algunos estudiantes que puede deberse\n" +
                "a factores tales como la falta de tiempo, poca importancia que le dan a estas\n" +
                "materias y el temor injustificado a una supuesta dificultad, entre otros.\n\n" +
                "Al estar en el último grado de nuestra formación académica tenemos como\n" +
                "objetivo continuar con el trabajo basado en ayudantías en el área de ''Exactas-\n" +
                "Biológicas'' pero con un distinto enfoque que esta vez va dirigido a alumnos de\n" +
                "tercer grado de secundaria con el fin de evitar dificultades en el transcurso del\n" +
                "año tras tener conocimiento de sus notas del primer bimestre, mediante clases\n" +
                "en horarios extracurriculares en las materias de matemática, química, física y\n" +
                "biología. Ya que existen algunos alumnos con la necesidad de dichas clases.\n" +
                "                                     ...\n" +
                "                                     ...\n" +
                "                                     ...\n";
        tesis = new ConcreteTesis(title,body,5);
        originator.setState(tesis);
        document.createVersion(5, originator.createMemento());

        //Retornar a la Tercera Versión
        originator.restoreFromMemento(document.getMemento(3));
    }
}
