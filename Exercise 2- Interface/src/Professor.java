import develhope.interface1.TeachingPerson;

public class Professor extends CollegePerson implements TeachingPerson {
    @Override
    public void teachingPeople() {
        System.out.println("The teacher is here");

    }
    String teachingSubject;

    public void data2(String name, String surname, int id, String subject){

        name = "Mr.Teacher";
        surname = "Mr.Teachersurname";
        id = 8;
        subject = "Really don't know";

    }
}
