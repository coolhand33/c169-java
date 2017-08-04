
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
    public Roster(String[] studentData)
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
            tempStudent.addFirstName(firstName);
            tempStudent.addLastName(lastName);
            tempStudent.addEmail(email);
            tempStudent.addAge(age);
            //I am making it possible for more than just 3 scores to be added to the roster
            for(int i = 5; i < studentInfo.length; i++)
            {
                tempStudent.addScore(Integer.parseInt(studentInfo[i]));
            }
            
            //take the created Student and add them to the roster
            roster.add(tempStudent);
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
}
