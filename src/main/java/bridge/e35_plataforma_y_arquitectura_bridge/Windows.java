package bridge.e35_plataforma_y_arquitectura_bridge;

public class Windows implements IPlataforma {
    private IArquitectura arch;
    private String version;

    public Windows(IArquitectura arch, String version) {
        this.arch = arch;
        this.version = version;
    }

    @Override
    public void showPlatformInfo() {
        System.out.println("Windows " + version);
        arch.showArchInfo();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
