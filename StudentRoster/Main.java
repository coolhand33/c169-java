
/**
 * This is the main program that will build and run my Student Roster app
 *
 * @author Clint Broadhead <cbroadh@wgu.edu>
 * @version 0.0.1
 */

import java.util.Arrays;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        String [] students = 
        {
            "1,John,Smith,John1989@gmail.com,20,88,79,59", 
            "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
            "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
            "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
            "5,Clint,Broadhead,cbroadh@wgu.edu,32,100,100,100"
        };
        
        ArrayList<Student> studentList = new ArrayList<Student>();
        
        for( String student : students )
        {
            String[] studentInfo = student.split(",");
            String id = studentInfo[0];
            String fName = studentInfo[1];
            String lName = studentInfo[2];
            Student tempStudent = new Student(id);
            
        }
        
    }
}
