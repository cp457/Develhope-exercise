import develhope.interface1.LearningPerson;
import develhope.interface1.TeachingPerson;

public class Assistant extends  CollegePerson implements TeachingPerson, LearningPerson {


    @Override
    public void teachingPeople() {

        System.out.println("I'm here to help");
    }

     boolean isGoingToBeAPhD;

    public void data3(String name, String surname, int id, boolean willBeAPhD){

        name = "Laura";
        surname = "Lauri";
        id = 10;
        willBeAPhD = false;
    }

    @Override
    public void studyAtHome() {

    }
}
