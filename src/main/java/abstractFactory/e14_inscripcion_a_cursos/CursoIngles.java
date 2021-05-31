package abstractFactory.e14_inscripcion_a_cursos;

public class CursoIngles implements ICurso{
    private String en_course_code;
    private String en_credits;
    private String en_length;
    private String en_level;
    private Estudiante en_student;

    public CursoIngles() {}

    @Override
    public void create() {
        System.out.println("******+*** CURSO DE INGLÉS *********");
        System.out.println("- Estudiante: ");
        en_student.showInfo();
        System.out.println("- Código del");
        System.out.println("  Curso     : " + en_course_code);
        System.out.println("- Nivel     : " +en_level);
        System.out.println("- Créditos  : " + en_credits);
        System.out.println("- Duración  : " + en_length);
        System.out.println("********* ----------------- *********");
        System.out.println();
    }

    public String getEnglishCourseCode(){
        return en_course_code;
    }

    public void setEnglishCourseCode(String en_course_code) {
        this.en_course_code = en_course_code;
    }

    public String getEnglishCredits() {
        return en_credits;
    }

    public void setEnglishCredits(String en_credits) {
        this.en_credits = en_credits;
    }

    public String getEnglishLength() {
        return en_length;
    }

    public void setEnglishLength(String en_length) {
        this.en_length = en_length;
    }

    public String getEnglishLevel() {
        return en_level;
    }

    public void setEnglishLevel(String en_level) {
        this.en_level = en_level;
    }

    public Estudiante getEnglishStudent() {
        return en_student;
    }

    public void setEnglishStudent(Estudiante en_student) {
        this.en_student = en_student;
    }
}
