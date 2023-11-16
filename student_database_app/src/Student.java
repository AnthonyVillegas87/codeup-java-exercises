import java.util.Scanner;

public class Student {
    /*
     *           Student Database Application -
     *      as a Database Admin for a university, you need to create an application to manage student enrollments and balance
     *
     *  Ask the user how many students will be added to the database
     *  The user should be prompted to enter the name and year for each student
     *  The student should have a 5-digit unique-ID, with the first number being their grade level
     *  A student can enroll in the following courses:
     *   History 101
     *   Mathematics 101
     *   English 101
     *   Chemistry 101
     *   Computer Science 101
     *
     *  Each course costs $600 to enroll
     *  The student should be able to view their balance and pay the tuition
     *  To see the status of the student, we should see their name, ID, courses enrolled, and balance.
     *
     *
     *
     *
     * */




    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;


    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level:  ");
        this.gradeYear = in.nextInt();

        setStudentId();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);


    }

    // Generate ID: Should be a static property
    private void setStudentId() {
        //  Grade level + ID
        //  Increment id by 1
        id++;
       this.studentId = gradeYear + "" + id;
    }
    // Enroll in courses

    // View balance

    // Pay tuition

    // Show status

}