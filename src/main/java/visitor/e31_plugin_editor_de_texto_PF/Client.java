package visitor.e31_plugin_editor_de_texto_PF;

public class Client {
    public static void main(String []sss){

        String title = "                  IMPACTO ACADÉMICO DE LA PANDEMIA EN LAS AREAS\n " +
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


        Word word = new Word();
        word.setTitle("Tesina 2015");
        word.crear(title+body);
        System.out.println("TEXTO DE WORD:");
        word.editar();

        Notepad notepad =  new Notepad();
        notepad.setId("1514-NP");
        notepad.crear(title);
        System.out.println("*********************************\n\nTEXTO DE NOTEPAD:");
        notepad.editar();


        Sublime sublime = new Sublime();
        sublime.setNumber(15);
        sublime.crear(body);
        System.out.println("*********************************\n\nTEXTO DE SUBLIME:");
        sublime.editar();

        Sublime sublime1 = new Sublime();
        sublime1.setNumber(16);
        sublime1.crear(body);
        System.out.println("*********************************\n\nTEXTO DE SUBLIME 1 version 1:\n");
        sublime1.editar();
        sublime1.eliminar();
        System.out.println("TEXTO DE SUBLIME 1 version 2:\n");
        sublime1.editar();


        Plugin plugin = new Plugin();
        word.accept(plugin);
        notepad.accept(plugin);
        sublime.accept(plugin);
        sublime1.accept(plugin);

    }
}
