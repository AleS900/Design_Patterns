package bridge.e34_plataforma_y_arquitectura_sin_bridge;

public class Windows7x64 extends Windows{
    @Override
    public void showInfoLinuxx64() {
        System.out.println("No soy Linux x64");
    }

    @Override
    public void showInfoLinuxx86() {
        System.out.println("No soy Linux x86");
    }

    @Override
    public void showWindows7x64() {
        System.out.println("Windows 7 -- x64");
    }

    @Override
    public void showWindows7x86() {
        System.out.println("No soy Windows 7 x86");
    }
}
