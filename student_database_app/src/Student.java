import java.sql.SQLOutput;
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
    private String courses = null;
    private double tuitionBalance = 0;
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
    public void enroll() {
        // Iterate with a loop until user is finished enrolling
        do {
            System.out.print("Enter course to enroll in (0 to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);

        System.out.println("Enrolled in: " + courses);

    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }


    // Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        double payment = in.nextDouble();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }



    // Show status
    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudentId: " + studentId +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}