/* InputGrades.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   11/2/2016
*/

import java.util.Scanner;

public class InputGrades
    {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
        {
        final int NUM_COURSES = 2;
        Student[] students = new Student[1];

        int id;
        char grade;

        for (int i = 0; i < students.length; i++)
            {
            students[i] = new Student();

            System.out.print("For student #" + (i + 1) + ", enter the student ID: ");
            students[i].setStudentID(scan.nextInt());
            scan.nextLine();

            for (int x = 0; x < NUM_COURSES; x++)
                {
                CollegeCourse course = new CollegeCourse();

                System.out.print("Enter course #" + (x + 1) + ": ");
                course.setCourseID(scan.nextLine());
                System.out.print("Enter credits: ");
                course.setCreditHours(scan.nextDouble());
                scan.nextLine();
                
                boolean isGood = false;
                do
                    {
                    System.out.print("Enter grade: ");
                    grade = scan.nextLine().toUpperCase().charAt(0);
                    if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')
                        isGood = true;
                    } while (!isGood);
                course.setGrade(grade);
                students[i].setCourses(course, x);
                }
            }
        for (int i = 0; i < students.length; i++)
            {
            CollegeCourse course = new CollegeCourse();
            for (int j = 0; j < NUM_COURSES; j++)
                {
                course = students[i].getCourses(j);
                System.out.println("For course #" + (j + 1));
                System.out.println("Course ID: " + course.getCourseID());
                System.out.println("Credit Hours: " + course.getCreditHours());
                System.out.println("Grade: " + course.getGrade());
                
                }
            }
    
    
        }// end main method
    }