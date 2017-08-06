
/**
 * Write a description of class Converter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class Converter
{
   public static ArrayList<Student> data(String [] students)
   {
       for( String student : students )
        {
            //put comma separated data into an iterable format
            String[] studentInfo = student.split(",");
            
            //start building a Student objects
            int id = Integer.parseInt(studentInfo[0]);
            String firstName = studentInfo[1];
            String lastName = studentInfo[2];
            String email = studentInfo[3];
            int age = Integer.parseInt(studentInfo[4]);
            //index 5 and on are scores and are handled in a loop below
            
            Student tempStudent = new Student();
            tempStudent.setId(id);
            tempStudent.setFirstName(firstName);
            tempStudent.setLastName(lastName);
            tempStudent.setEmail(email);
            tempStudent.setAge(age);
            //I am making it possible for more than just 3 scores to be added to the roster
            for(int i = 5; i < studentInfo.length; i++)
            {
                tempStudent.setScore(Integer.parseInt(studentInfo[i]));
            }
        }
   }
}
