package patternCombinations.e27_repositorio_de_github_2P;

public interface ISubjectGitHub {
    void attach(IDesarrollador observer);
    void deattach(IDesarrollador observer);
    void notifyObserver(OBSNotificacionGit codigo);
}
