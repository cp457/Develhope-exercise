public class Main {
    public static void main(String[] args){

        Students students1, students2;
        students1 = new Students(" Chris ");
        students2 = new Students(" Max ");
        Teacher teach = new Teacher("Gertrude ");
        teach.assignGrade(students1, 7);
        teach.assignGrade(students2, 19);
        students1.getStudentDetails();
        students2.getStudentDetails();





    }
}