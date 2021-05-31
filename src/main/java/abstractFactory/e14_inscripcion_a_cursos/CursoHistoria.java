package abstractFactory.e14_inscripcion_a_cursos;

public class CursoHistoria implements ICurso {
    private String hx_course_code;
    private String hx_credits;
    private String hx_length;
    private Estudiante hx_student;

    public CursoHistoria() {}

    @Override
    public void create() {
        System.out.println("********* CURSO DE HISTORIA *********");
        System.out.println();
        System.out.println("- Estudiante: ");
        hx_student.showInfo();
        System.out.println("- Código del");
        System.out.println("  Curso     : " + hx_course_code);
        System.out.println("- Créditos  : " + hx_credits);
        System.out.println("- Duración  : " + hx_length);
        System.out.println("********* ----------------- *********");
        System.out.println();
    }

    public String getHistoryCourseCode() {
        return hx_course_code;
    }

    public void setHistoryCourseCode(String hx_course_code) {
        this.hx_course_code = hx_course_code;
    }

    public String getHistoryCredits() {
        return hx_credits;
    }

    public void setHistoryCredits(String hx_credits) {
        this.hx_credits = hx_credits;
    }

    public String getHistoryLength() {
        return hx_length;
    }

    public void setHistoryLength(String hx_length) {
        this.hx_length = hx_length;
    }

    public Estudiante getHistoryStudent() {
        return hx_student;
    }

    public void setHistoryStudent(Estudiante hx_student) {
        this.hx_student = hx_student;
    }
}
