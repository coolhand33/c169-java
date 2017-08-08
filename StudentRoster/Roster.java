
/**
 * Write a description of class Roster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Roster
{
    private ArrayList<Student> roster;
    
    /**
     * Constructor for objects of class Roster
     */
    public Roster()
    {
        this.roster = new ArrayList<Student>();
        
        //The studentData is an array of strings, this process aims to parse the strings into Student Objects.
        for( String student : studentData )
        {
            //put comma separated data into an iterable format
            String[] studentInfo = student.split(",");
            //start building a Student object
            int id = Integer.parseInt(studentInfo[0]);
            String firstName = studentInfo[1];
            String lastName = studentInfo[2];
            String email = studentInfo[3];
            int age = Integer.parseInt(studentInfo[4]);
            //index 5 and on are scores and are handled in a loop below
            
            Student tempStudent = new Student(id);
            tempStudent.setFirstName(firstName);
            tempStudent.setLastName(lastName);
            tempStudent.setEmail(email);
            tempStudent.setAge(age);
            //I am making it possible for more than just 3 scores to be added to the roster
            for(int i = 5; i < studentInfo.length; i++)
            {
                tempStudent.setScore(Integer.parseInt(studentInfo[i]));
            }
            
            //take the created Student and add them to the roster
            roster.add(tempStudent);
        }
    }

    /**
     * Adds a student to the roster
     *
     * @param  studentID is the id passed in
     * @param  firstname is the students first name
     * @param  lastname is the students last name
     * @param  emailaddress is the students email
     * @param  age is the students age
     * @param  grade1 is the first score
     * @param  grade2 is the second score
     * @param  grade3 is the third score
     * 
     */
    
    public static void add(String studentID, String firstname, String lastname, String emailaddress, int age, int grade1, int grade2, int grade3)
    {
        
    }
    
    /**
     * Removes a student from the roster
     *
     * @param  studentID is the id to remove from the array
     * 
     */
    public static void remove(String studentID)
    {
        
    }
    
    /**
     * Prints all of the students info contained within the roster 
     */
    public static void print_all()
    {
    }
    
    /**
     * Prints a student’s average grade
     *
     * @param  studentID is the id of the student
     * 
     */
    public static void print_average_grade(String studentID)
    {
    }
    
    /**
     * Verifies student e-mail addresses and displays all invalid e-mail addresses to the user
     *
     * 
     */
    public static void print_invalid_emails()
    {
    
    }
}
