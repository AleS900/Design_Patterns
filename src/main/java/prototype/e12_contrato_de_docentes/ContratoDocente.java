package prototype.e12_contrato_de_docentes;

public class ContratoDocente implements IContratoDocente {
    private String salary;
    private String workload;
    private Boolean high_education_course;
    private Boolean access_to_the_platform;
    private Boolean biometric_reg;
    private String check_in_time;
    private String departure_time;
    private Docente teacher;

    public ContratoDocente() {
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    public Boolean getHighEducationCourse() {
        return high_education_course;
    }

    public void setHighEducationCourse(Boolean high_education_course) {
        this.high_education_course = high_education_course;
    }

    public Boolean getAccessToThePlatform() {
        return access_to_the_platform;
    }

    public void setAccessToThePlatform(Boolean access_to_the_platform) {
        this.access_to_the_platform = access_to_the_platform;
    }

    public Boolean getBiometricReg() {
        return biometric_reg;
    }

    public void setBiometricReg(Boolean biometric_reg) {
        this.biometric_reg = biometric_reg;
    }

    public String getCheckInTime() {
        return check_in_time;
    }

    public void setCheckInTime(String check_in_time) {
        this.check_in_time = check_in_time;
    }

    public String getDepartureTime() {
        return departure_time;
    }

    public void setDepartureTime(String departure_time) {
        this.departure_time = departure_time;
    }

    public Docente getTeacher() {
        return teacher;
    }

    public void setTeacher(Docente teacher) {
        this.teacher = teacher;
    }

    @Override
    public Object clone() {
        ContratoDocente objClone = new ContratoDocente();
        objClone.setSalary(this.salary);
        objClone.setWorkload(this.workload);
        objClone.setHighEducationCourse(this.high_education_course);
        objClone.setAccessToThePlatform(this.access_to_the_platform);
        objClone.setBiometricReg(this.biometric_reg);
        objClone.setCheckInTime(this.check_in_time);
        objClone.setDepartureTime(this.departure_time);
        objClone.setTeacher(this.teacher);
        return objClone;
    }

    public void showInformation(){
        System.out.println("**********************************************************");
        System.out.println("DOCENTE: ");
        System.out.println("         Apellido: " + teacher.getThcrLastName());
        System.out.println("         Nombre  : " + teacher.getTchrName());
        System.out.println("         C.I.    : " + teacher.getTchrID());
        System.out.println("\n- Sueldo         : " + salary);
        System.out.println("- Carga Horaria  : " + workload);
        System.out.println("- Curso Educación \n  Superior       : " + high_education_course);
        System.out.println("- Acceso a la \n  Plataforma     : " + access_to_the_platform);
        System.out.println("- Reg. Biométrico: " + biometric_reg);
        System.out.println("- Hora de Entrada: " + check_in_time);
        System.out.println("- Hora de Salida : " + departure_time);
        System.out.println("**********************************************************");
        System.out.println();
    }
}
