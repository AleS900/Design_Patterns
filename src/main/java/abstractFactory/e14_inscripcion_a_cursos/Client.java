package abstractFactory.e14_inscripcion_a_cursos;

public class Client {
    public static void main (String []args){
        //1.
        System.out.println("ESTUDIANTE 1");
        CursoIngles course1 = (CursoIngles)FactoryCurso.make(FactoryCurso.typeCourse.INGLES);
        course1.setEnglishStudent(new Estudiante("2894365 OR","Rodriguez","Carmen","50344"));
        course1.setEnglishLevel("Avanzado");
        course1.create();
        //2.
        System.out.println("ESTUDIANTE 2");
        CursoIngles course2 = (CursoIngles)FactoryCurso.make(FactoryCurso.typeCourse.INGLES);
        course2.setEnglishStudent(new Estudiante("8989563 OR","Entrambasaguas","Rodrigo","49150"));
        course2.setEnglishLevel("Básico");
        course2.create();
        //3.
        System.out.println("ESTUDIANTE 3");
        CursoHistoria course3 = (CursoHistoria)FactoryCurso.make(FactoryCurso.typeCourse.HISTORIA);
        course3.setHistoryStudent(new Estudiante("7875929 LP", "Ortiz", "Melany", "49523"));
        course3.create();
        //4.
        System.out.println("ESTUDIANTE 4");
        CursoLenguaje course4 = (CursoLenguaje)FactoryCurso.make(FactoryCurso.typeCourse.LENGUAJE);
        course4.setLanguageStudent(new Estudiante("7390113 LP","Vargas","Alejandro","51442"));
        course4.create();
        //5.
        System.out.println("ESTUDIANTE 5");
        CursoMatematica course5 = (CursoMatematica)FactoryCurso.make(FactoryCurso.typeCourse.MATEMATICA);
        course5.setMath_student(new Estudiante("7323214 CBBA","Portal","Karla","34344"));
        course5.setMath_course_area("Geometría");
        course5.create();
    }
}
