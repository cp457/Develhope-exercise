public class TestingClass {
    public static void main(String[] args) {

        Students student = new Students("Giulia ", "Boldi ", 7, 8);
        Professor professor = new Professor("Mario ", "Marii ", 8, "Massimo" ) ;
        Assistant assistant = new Assistant("Mirko ", "Verdi ", 6, false);


        assistant.goToCollege();
        student.goToCollege();
        professor.goToCollege();

        student.studyAtHome();
        professor.teachingPeople();
        assistant.teachingPeople();
        assistant.studyAtHome();


    }
}

