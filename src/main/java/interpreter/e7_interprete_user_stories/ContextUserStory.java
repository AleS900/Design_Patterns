package interpreter.e7_interprete_user_stories;
/*
- Como:  ...  -->  Given:...
- Quiero:...  -->  When: ...
- Para:  ...  -->  Then: ...
*/
public class ContextUserStory {
    protected String input = "";
    protected String output = "";
    public ContextUserStory( String input ) {
        this.input = input;
    }
}
