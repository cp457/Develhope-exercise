import develhope.interface1.LearningPerson;

public class Students extends CollegePerson implements LearningPerson {
    @Override
    public void studyAtHome() {

        System.out.println("We are learning!");
    }


    int academicYear;

    public void data(String name, String surname, int id, int year){

          this.name = name;
          this.surname = surname;
          this.collegeId = id;
          this.academicYear = year;

    }

}



