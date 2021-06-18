package visitor.e31_plugin_editor_de_texto_PF;

public class Word extends EditorDeTexto implements IEditorDeTexto {
    private String txt;
    private String id;
    private int number;
    private String title;

    public Word() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void crear(String txt){
        setTxt(txt);
    }

    @Override
    public void editar(){
        System.out.println(getTxt());
    }

    @Override
    public void eliminar(){
        setTxt("");
    }

    @Override
    public void accept(IPlugin plugin) {
        plugin.guardandoPDF(this);
    }
}
