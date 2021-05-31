package abstractFactory.e14_inscripcion_a_cursos;

public class FactoryCurso {

    public enum typeCourse {
        MATEMATICA, LENGUAJE, HISTORIA, INGLES
    }

    public static ICurso make(typeCourse type){
        ICurso curso;
        switch (type) {
            case INGLES:
                curso = new CursoIngles();
                ((CursoIngles)curso).setEnglishCourseCode("142-EN");
                ((CursoIngles)curso).setEnglishLength("18 Semanas");
                ((CursoIngles)curso).setEnglishCredits("12 Créditos");
                ((CursoIngles)curso).setEnglishLevel("Principiante/Medio/Avanzado");
                ((CursoIngles)curso).setEnglishStudent(new Estudiante("DEFAULT","DEFAULT","DEFAULT","DEFAULT"));
                break;
            case LENGUAJE:
                curso = new CursoLenguaje();
                ((CursoLenguaje)curso).setLanguageCourseCode("065-LG");
                ((CursoLenguaje)curso).setLanguageLength("4 Semanas");
                ((CursoLenguaje)curso).setLanguageCredits("3 Créditos");
                ((CursoLenguaje)curso).setLanguageStudent(new Estudiante("DEFAULT","DEFAULT","DEFAULT","DEFAULT"));
                break;
            case HISTORIA:
                curso = new CursoHistoria();
                ((CursoHistoria)curso).setHistoryCourseCode("070-HX");
                ((CursoHistoria)curso).setHistoryLength("6 Semanas");
                ((CursoHistoria)curso).setHistoryCredits("4 Créditos");
                ((CursoHistoria)curso).setHistoryStudent(new Estudiante("DEFAULT","DEFAULT","DEFAULT","DEFAULT"));
                break;
            case MATEMATICA:
                curso = new CursoMatematica();
                ((CursoMatematica)curso).setMath_course_code("300-MT");
                ((CursoMatematica)curso).setMath_length("6 semanas");
                ((CursoMatematica)curso).setMath_credits("4 Créditos");
                ((CursoMatematica)curso).setMath_course_area("Algorítmica/Algebra/Geometría");
                ((CursoMatematica)curso).setMath_student(new Estudiante("DEFAULT", "DEFAULT", "DEFAULT", "DEFAULT"));
                break;
            default:
                curso = new CursoLenguaje();
                System.out.println("Porfavor elija un curso valido");
                break;
        }
        return curso;
    }

}