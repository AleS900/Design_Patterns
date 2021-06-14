package patternCombinations.e27_repositorio_de_github_2P;

public class MMConcreteCodigo {
    private String code_body;
    private  String code_commit;

    public MMConcreteCodigo(String code_body, String code_commit) {
        this.code_body = code_body;
        this.code_commit = code_commit;
    }

    public String getCode_body() {
        return code_body;
    }

    public void setCode_body(String code_body) {
        this.code_body = code_body;
    }

    public String getCode_commit() {
        return code_commit;
    }

    public void setCode_commit(String code_commit) {
        this.code_commit = code_commit;
    }

    public void showInfo(){
        System.out.println("-- Código: " + code_body);
        System.out.println("-- Commit: " + code_commit);
    }
}
