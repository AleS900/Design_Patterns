package abstractFactory.e14_inscripcion_a_cursos;

public class CursoLenguaje implements ICurso {
    private String lg_course_code;
    private String lg_credits;
    private String lg_length;
    private Estudiante lg_student;

    public CursoLenguaje() {}

    @Override
    public void create() {
        System.out.println("********* CURSO DE LENGUAJE *********");
        System.out.println("- Estudiante: ");
        lg_student.showInfo();
        System.out.println("- Código del");
        System.out.println("  Curso     : " + lg_course_code);
        System.out.println("- Créditos  : " + lg_credits);
        System.out.println("- Duración  : " + lg_length);
        System.out.println("********* ----------------- *********");
        System.out.println();
    }

    public String getLanguageCourseCode() {
        return lg_course_code;
    }

    public void setLanguageCourseCode(String lg_course_code) {
        this.lg_course_code = lg_course_code;
    }

    public String getLanguageCredits() {
        return lg_credits;
    }

    public void setLanguageCredits(String lg_credits) {
        this.lg_credits = lg_credits;
    }

    public String getLanguageLength() {
        return lg_length;
    }

    public void setLanguageLength(String lg_length) {
        this.lg_length = lg_length;
    }

    public Estudiante getLanguageStudent() {
        return lg_student;
    }

    public void setLanguageStudent(Estudiante lg_student) {
        this.lg_student = lg_student;
    }
}
