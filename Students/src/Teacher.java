public class Teacher {

    public String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = "Gertrude ";
        System.out.println("The teacher name is " + teacherName);

    }


    public void assignGrade(Students alum, int finalGrade) {

        alum.grade = finalGrade;

        System.out.println("The final grade " + alum.name + "And the final grade is " + finalGrade);


    }


}
