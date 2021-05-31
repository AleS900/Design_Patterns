package abstractFactory.e14_inscripcion_a_cursos;

public class CursoMatematica implements ICurso {
    private String math_course_code;
    private String math_credits;
    private String math_length;
    private String math_course_area;
    private Estudiante math_student;

    public CursoMatematica() {}

    @Override
    public void create() {
        System.out.println("******** CURSO DE MATEMATICA ********");
        System.out.println("- Estudiante: ");
        math_student.showInfo();
        System.out.println("- Código del");
        System.out.println("  Curso     : " + math_course_code);
        System.out.println("- Area      : " + math_course_area);
        System.out.println("- Créditos  : " + math_credits);
        System.out.println("- Duración  : " + math_length);
        System.out.println("********* ----------------- *********");
        System.out.println();
    }

    public String getMath_course_code() {
        return math_course_code;
    }

    public void setMath_course_code(String math_course_code) {
        this.math_course_code = math_course_code;
    }

    public String getMath_credits() {
        return math_credits;
    }

    public void setMath_credits(String math_credits) {
        this.math_credits = math_credits;
    }

    public String getMath_length() {
        return math_length;
    }

    public void setMath_length(String math_length) {
        this.math_length = math_length;
    }

    public String getMath_course_area() {
        return math_course_area;
    }

    public void setMath_course_area(String math_course_area) {
        this.math_course_area = math_course_area;
    }

    public Estudiante getMath_student() {
        return math_student;
    }

    public void setMath_student(Estudiante math_student) {
        this.math_student = math_student;
    }
}
