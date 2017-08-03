
/**
 * Student class creates a student with all necessary info to add the student into a Roster
 *
 * @author Clint Broadhead <cbroadh@wgu.edu>
 * @version 0.0.1
 */
import java.util.ArrayList;

public class Student
{
    // instance variables - replace the example below with your own
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private ArrayList<int> score;
    

    /**
     * Constructor for objects of class Student
     */
    public Student(int id)
    {
        // initialise instance variables
        this.id = id;
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.age = 0;
        this.score = new ArrayList<int>();
    }

    /**
     * This method adds a first name to the Student
     *
     * @param  fname is the first name passed in
     */
    public void addFirstName(String fname)
    {
        this.firstName = fname;
    }
    
    /**
     * This method adds a last name to the Student
     *
     * @param  fname is the last name passed in
     */
    public void addLastName(String lname)
    {
        this.lastName = lname;
    }
    
    /**
     * This method adds an email to the Student
     *
     * @param  email is the email address passed in
     */
    public void email(String email)
    {
        this.email = email;
    }
    
    /**
     * This method adds an age to the Student
     *
     * @param  age is the age passed in
     */
    public void addAge(int age)
    {
        this.age = age;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addScore(int score)
    {
        this.score.add(score);
    }
}
