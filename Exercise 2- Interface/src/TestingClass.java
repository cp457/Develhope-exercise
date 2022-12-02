public class TestingClass {
    public static void main(String[] args) {

        Students student = new Students();
        Professor professor = new Professor();
        Assistant assistant = new Assistant();

        assistant.name = "Giulia ";
        assistant.surname = " Boldi ";
        assistant.collegeId = 5;

        student.name = "Mario ";
        student.surname = " Mariii ";
        student.collegeId = 6;

        professor.name = "Mirko ";
        professor.surname = "Verdi ";
        professor.collegeId = 4;

        assistant.goToCollege();
        student.goToCollege();
        professor.goToCollege();

        student.studyAtHome();
        professor.teachingPeople();
        assistant.teachingPeople();
        assistant.studyAtHome();


    }
}

