import develhope.interface1.TeachingPerson;

public class Professor extends CollegePerson implements TeachingPerson {
    @Override
    public void teachingPeople() {
        System.out.println("The teacher is here");

    }
    String teachingSubject;

    public Professor (String name, String surname, int id, String subject){

        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;

    }
}
