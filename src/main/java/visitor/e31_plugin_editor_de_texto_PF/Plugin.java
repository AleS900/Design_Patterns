package visitor.e31_plugin_editor_de_texto_PF;

public class Plugin implements IPlugin {

    @Override
    public void guardandoPDF(Word word) {
        System.out.println("Guardando el documento de Word " + word.getTitle() +" en PDF.");
        System.out.println("Caracteres guardados: " + word.getTxt().length());
    }

    @Override
    public void guardandoPDF(Notepad notepad) {
        System.out.println("Guardando el documento de Notepad con el codigo identificador " + notepad.getId() +" en PDF.");
        System.out.println("Caracteres guardados: " + notepad.getTxt().length());
    }

    @Override
    public void guardandoPDF(Sublime sublime) {
        System.out.println("Guardando el documento de Sublime, número " + sublime.getNumber() + " en PDF.");
        System.out.println("Caracteres guardados: " + sublime.getTxt().length());
    }
}
