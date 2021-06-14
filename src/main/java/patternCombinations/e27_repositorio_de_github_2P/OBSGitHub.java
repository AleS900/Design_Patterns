package patternCombinations.e27_repositorio_de_github_2P;

import observer.e22_empresa_telefonica_2P.NotificacionEmpresa;

import java.util.ArrayList;
import java.util.List;

public class OBSGitHub implements ISubjectGitHub{
    private List<IDesarrollador> observerList= new ArrayList<>();

    private List<OBSNotificacionGit> codeList = new ArrayList<>();

    public void setNewNotify(OBSNotificacionGit code){
        codeList.add(code);
        this.notifyObserver(code);
    }

    @Override
    public void attach(IDesarrollador observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IDesarrollador observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(OBSNotificacionGit codigo) {
        for (IDesarrollador developer :observerList) {
                developer.update("Se recupero una versión pasada del \ncódigo, el "+ codigo.getNtf_commit(),codigo);

        }
    }
}

