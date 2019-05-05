package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        //Ask how many students we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();

        Student[] students = new Student[numOfStudents];

        //Create n number of new students
        for (int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();

        }

        for(Student st : students){
            System.out.println(st.showInfo());
            System.out.println("--------------------------");
        }
    }
}
