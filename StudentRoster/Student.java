
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
    private ArrayList<Integer> scores;
    

    /**
     * Constructor for objects of class Student
     */
    public Student(int id, String firstName, String lastName, String email, int age, ArrayList<Integer> scores)
    {
        // initialise instance variables
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setAge(age);
        this.setScores(scores);
    }
    
    /**
     * This method adds an id to the Student
     *
     * @param  fname is the first name passed in
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * This method adds a first name to the Student
     *
     * @param  fname is the first name passed in
     */
    public void setFirstName(String fname)
    {
        this.firstName = fname;
    }
    
    /**
     * This method adds a last name to the Student
     *
     * @param  fname is the last name passed in
     */
    public void setLastName(String lname)
    {
        this.lastName = lname;
    }
    
    /**
     * This method adds an email to the Student
     *
     * @param  email is the email address passed in
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * This method adds an age to the Student
     *
     * @param  age is the age passed in
     */
    public void setAge(int age)
    {
        this.age = age;
    }
    
    /**
     * Adds a score to the score arraylist
     *
     * @param  a score in integer form to be added
     */
    public void setScores(ArrayList<Integer> scores)
    {
        this.scores = scores;
    }
    
    /**
     * This method gets studentID of the Student
     *
     * @param  id is the first name passed in
     */
    public int getId()
    {
        return this.id;
    }
    
    /**
     * This method gets first name of the Student
     *
     * @param  fname is the first name passed in
     */
    public String getFirstName()
    {
        return this.firstName;
    }
    
    /**
     * This method gets a last name to the Student
     *
     * @param  fname is the last name passed in
     */
    public String getLastName()
    {
        return this.lastName;
    }
    
    /**
     * This method gets the email of the Student
     *
     * @return  a string that contains the email address of the Student
     */
    public String getEmail()
    {
        return this.email;
    }
    
    /**
     * This method gets the age of the Student
     *
     * @return  age of Student
     */
    public int getAge()
    {
        return this.age;
    }
    
    /**
     * Gets the scores of the Student
     *
     * @return  an array of the students scores
     */
    public ArrayList<Integer> getScores()
    {
        return this.scores;
    }
    
    public void print()
    {
        System.out.println("ID:\t" + getId() + "\tFirstName:\t" + getFirstName() + "\tLastName:\t" + getLastName() + "\tEmail:\t" + getEmail() + "\tAge:\t" + getAge() + "\tScores:\t" + getScores());
    }
}
