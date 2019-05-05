package studentDatabaseApp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = sc.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = sc.nextLine();

        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class: ");
        this.gradeYear = sc.nextInt();

        setStudentID();



    }

    //Generate ID
    private void setStudentID(){
        //Grade level + id
        id++;
       this.studentID = this.gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll(){
        //Get inside a loop, user hits 0

        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner sc = new Scanner(System.in);

            String course = sc.nextLine();
            if (!course.equals("Q")){
                this.courses = this.courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }    else {
                break;
            }
        } while (1 != 0);

    }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + this.tuitionBalance);
    }

    //Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: ");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //Show Satus
    public String showInfo(){
        return "Name: " + this.firstName + " " + this.lastName +
                "\nGrade Level: " + this.gradeYear
                + "\nStudent ID: " + this.studentID + "\nCourses Enrolled: " +
                this.courses + "\nBalance: $" + this.tuitionBalance;
    }
}
