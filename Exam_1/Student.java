public class Student {
    String surname;
    String firstname;
    char middleInitial;
    int dateOfBirth; 
    int studentNumber;
    String emailAddress;
    boolean IamAwesome;

    public void sayMyStudentNumber() {
        System.out.println("My student number is " + studentNumber +"");
    }
    public void sayMyEmailAddress() {
        System.out.println("My student email address  is " + emailAddress +"");
    }
    public void amIAwesome() {
        System.out.println("Am I Awesome? " + IamAwesome +"");
    }

}         
