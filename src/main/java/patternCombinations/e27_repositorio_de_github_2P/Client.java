package patternCombinations.e27_repositorio_de_github_2P;

public class Client {
    public static void main (String []argsss ){
        MMGitHubCareTaker github = new MMGitHubCareTaker();
        MMGitOriginator git = new MMGitOriginator();
        OBSGitHub obs_git =  new OBSGitHub();

        MMConcreteCodigo codigo;

        //*******PARTE 1***********
        System.out.println("*************PARTE 1**************\n");
        OBSDesarrollador user1 = new OBSDesarrollador("15-A",new OBSPersona("5495425 LP", "Sonia Aranibar"));
        OBSDesarrollador user2 = new OBSDesarrollador("17-B",new OBSPersona("8593364 OR", "Patrick Gutierrez"));
        OBSDesarrollador user3 = new OBSDesarrollador("12-A",new OBSPersona("14525622 SC", "Vladimir Gómez"));
        obs_git.attach(user1);
        user1.getDev_person().showInfo();
        obs_git.attach(user2);
        user2.getDev_person().showInfo();
        obs_git.attach(user3);
        user3.getDev_person().showInfo();


        //*******PARTE 2***********
        System.out.println("\n*************PARTE 2**************\n");
        //-- Creación de 5 Commits
        //1.
        codigo =  new MMConcreteCodigo("CODIGO 1","Creación Proyecto");
        git.setState(codigo);
        github.createCommit("COMMIT1", git.createVersion());
        //2.
        codigo =  new MMConcreteCodigo("CODIGO 2","Creacion Clases Principales");
        git.setState(codigo);
        github.createCommit("COMMIT2", git.createVersion());
        //3.
        codigo =  new MMConcreteCodigo("CODIGO 3","Prueba de Funcionamiento");
        git.setState(codigo);
        github.createCommit("COMMIT3", git.createVersion());
        //4.
        codigo =  new MMConcreteCodigo("CODIGO 4","Prueba 1");
        git.setState(codigo);
        github.createCommit("COMMIT4", git.createVersion());
        //5.
        codigo =  new MMConcreteCodigo("CODIGO 5","Prueba 2");
        git.setState(codigo);
        github.createCommit("COMMIT5", git.createVersion());
        //-- Retornando a una versión anterior (Primer Commit).
        git.restoreFromMemento(github.getMemento("COMMIT1"));
        //-- Mostrar Notificaciones de los Desarolladores
        obs_git.setNewNotify(new OBSNotificacionGit("> ALERTA, cambio en el Repositorio.", "COMMIT 1"));


        //*******PARTE 3***********
        System.out.println("\n*************PARTE 3**************");
        obs_git.deattach(user1);
        obs_git.deattach(user2);
        obs_git.deattach(user3);
        OBSDesarrollador user4 = new OBSDesarrollador("13-A",new OBSPersona("5365425 LP", "Alexander Castillo"));
        OBSDesarrollador user5 = new OBSDesarrollador("20-C",new OBSPersona("7773364 OR", "Alejandro Rojas"));
        OBSDesarrollador user6 = new OBSDesarrollador("12-B",new OBSPersona("10256223 SC", "María Guzmán"));
        obs_git.attach(user4);
        user4.getDev_person().showInfo();
        obs_git.attach(user5);
        user5.getDev_person().showInfo();
        obs_git.attach(user6);
        user6.getDev_person().showInfo();

        //*******PARTE 4***********
        System.out.println("\n\n*************PARTE 4**************");
        //-- Retornando a una versión anterior (Commit 5).
        git.restoreFromMemento(github.getMemento("COMMIT5"));
        //-- Mostrar Notificaciones de los Desarolladores
        obs_git.setNewNotify(new OBSNotificacionGit("> INFO, Retornando a la Ultima Versión.", "COMMIT 5"));


    }
}
