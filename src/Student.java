/* Student.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   10/31/2016
*/

public class Student
    {
        private int studentID;
        private CollegeCourse[] courses = new CollegeCourse[5];
        
    public int getStudentID()
        {
        return studentID;
        }

    public void setStudentID(int studentID)
        {
        this.studentID = studentID;
        }

    public CollegeCourse getCourses(int course)
        {
        return courses[course];
        }

    public void setCourses(CollegeCourse course, int position)
        {
        this.courses[position] = course;
        }
    }
