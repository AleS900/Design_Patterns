package patternCombinations.e27_repositorio_de_github_2P;

import java.util.HashMap;
import java.util.Map;

public class MMGitHubCareTaker {
    private Map<String,Memento> stateSaved= new HashMap<>();

    public void createCommit(String commitCode, Memento memento){
        stateSaved.put(commitCode,memento);
    }

    public Memento getMemento(String commitCode){
        return stateSaved.get(commitCode);
    }
}
