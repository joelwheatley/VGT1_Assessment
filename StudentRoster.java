import java.util.Arrays;
import java.util.ArrayList;

/**
 * StudentRoster for Scripting and Programming VGT1 Assessment
 * June 2015 for WGU
 * 
 * @author Joel Wheatley 
 * @version 06.14.2015
 */
public class StudentRoster
{
    private String[] students;
    public void main(String args[])
    {
        students = new String[5];
        students[0] = "1,John,Smith,John1989@gmail.com,20,88,79,59";
        students[1]("2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85";
        students[2]("3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87";
        students[3]("4,Erin,Black,Erin.black@comcast.net,22,91,98,82";
        students[4]("5,Joel,Wheatley,jwheat2@wgu.edu,38,77,67,95";
        Roster roster = new Roster(students);
        printAll(roster);
        
    }
    /**
     * Prints Roster to screen
     */
    public static void printAll(Roster roster)
    {}
    public static void print_Invalid_Emails()
    {}
    public static void print_Average_Grade()
    {}
     public class Student
     {
         private String studentID;
         private String firstName;
         private String lastName;
         private String emailAddress;
         private int age;
         private int[] grades;
         
         /**
          * Student object constructor
          * @param String studentID 
          */
         public static void student(String toAdd)
         {
            student.firstName = toAdd.substring();
            student.lastName = toAdd.substring();
            student.emailAddress = toAdd.substring();
            student.age = toAdd.substring();
            student.grades = toAdd.substring();
         }
         public static void student(String studentID, String firstName, String lastName, 
         String emailAdress, int age, int grade1,int grade2, int grade3)
         {
            studentID = studentID;
            firstName = firstName;
            lastName = lastName;
            emailAddress = emailAddress;
            age = age;
            grades = new int[grades.AddGrade];
         }
         public static void getStudentID(Student student)
         {
             return student.toString().studentID;
         }
         public static void setStudentID(String studentID, String newStudentID)
         {
            student.studentID = newStudentID;
         }
         public static String getFirstName(String studentID)
         {
            return student.toString().firstName;
         }
         public static void setFirstName(String studentID, String newFirstName)
         {
            student.firstName = newFirstName;
         }
         public static String getLastName(String studentID)
         {
            return toString(student.LastName);
         }
         public static void setLastName(String studentID, String newLastName)
         {
            student.lastName = newlastName;
         }
         public static String getEmailAddress(String studentID)
         {
            return toString(student.emailAddress);
         }
         public static void setEmailAddress(String studentID, String newEmailAddress)
         {
            student.emailAddress = newEmailAddress;
         }
         public static int getAge(String studentID)
         {
            return toString(student.age);
         }
         public static void setAge(String studentID, String newAge)
         {
            student.age = newAge;
         }
         public static String[] getGrades(String studentID)
         {
            return toString(student.grades);
         }
         public static void setGrades(String studentID, int newGrade)
         {
            student.add(grades);
         }
         
     }
     public class Roster
     {
         public static void roster(String[] students)
         {
             for(String toAdd : students)
             {
                 student(students);
             }
         }
         public static void addStudent(Student student)
         {
             roster.add(student);
         }
         public static void removeStudent()
         {
         
         }
     }
}
