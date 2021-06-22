package bridge.e34_plataforma_y_arquitectura_sin_bridge;

public class Client {
    public static void main (String [] args){
        Windows7x64 windows7x64 = new Windows7x64();
        windows7x64.showWindows7x64();

        Windows7x86 windows7x86 = new Windows7x86();
        windows7x86.showWindows7x64();
        windows7x86.showWindows7x86();

        Linuxx64 linux64 = new Linuxx64();
        linux64.showInfoLinuxx64();

        Linuxx86 linuxx86 = new Linuxx86();
        linuxx86.showInfoLinuxx86();

    }
}
