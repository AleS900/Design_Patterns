package visitor.e31_plugin_editor_de_texto_PF;

public interface IPlugin {
    void guardandoPDF(Word word);
    void guardandoPDF(Notepad notepad);
    void guardandoPDF(Sublime sublime);
}
