
/**
 * Write a description of class Roster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Roster
{
    static ArrayList<Student> studentList = new ArrayList<>();
    
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
        
        for( String student : students )
        {
            //put comma separated data into an iterable format
            
            String[] studentInfo = student.split(",");
            //start building a Student object
            int id = Integer.parseInt(studentInfo[0]);
            String firstName = studentInfo[1];
            String lastName = studentInfo[2];
            String email = studentInfo[3];
            int age = Integer.parseInt(studentInfo[4]);
            int grade1 = Integer.parseInt(studentInfo[5]);
            int grade2 = Integer.parseInt(studentInfo[6]);
            int grade3 = Integer.parseInt(studentInfo[7]);
        
            //pass info to Roster.add to create Student and add them to the roster
            Roster.add(id, firstName, lastName, email, age, grade1, grade2, grade3);
        }   

        print_all();
        print_invalid_emails();
        //loop through the ArrayList and for each element:
        for( Student student : studentList )
        {
            print_average_grade(student.getId());
        }
        remove(3);
        remove(3);
        //expected: this should print a message saying such a student with this ID was not found.
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
    
    public static void add(int studentID, String firstname, String lastname, String emailaddress, int age, int grade1, int grade2, int grade3)
    {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(grade1);
        scores.add(grade2);
        scores.add(grade3);
        
        Student newStudent = new Student(studentID, firstname, lastname, emailaddress, age, scores);
        
        studentList.add(newStudent);
    }
    
    /**
     * Removes a student from the roster
     *
     * @param  studentID is the id to remove from the array
     * 
     */
    public static void remove(int studentID)
    {
        int indexOfStudent = getStudentIndexById(studentID);
        
        if( indexOfStudent != -1 )
        {
            studentList.remove(indexOfStudent);
            System.out.println("Successfully removed student with the ID: " + studentID);
        }
        else
        {
            System.out.println("Error: Unable to locate a student with given ID: " + studentID);
        }
        
    }
    
    /**
     * Prints all of the students info contained within the roster 
     */
    public static void print_all()
    {
        for(Student student : studentList)
        {
            System.out.println("ID:\t" + student.getId() + "\tFirstName:\t" + student.getFirstName() + "\tLastName:\t" + 
            student.getLastName() + "\tEmail:\t" + student.getEmail() + "\tAge:\t" + student.getAge() + "\tScores:\t" + student.getScores());
        }
    }
    
    /**
     * Prints a student’s average grade
     *
     * @param  studentID is the id of the student
     * 
     */
    public static void print_average_grade(int studentID)
    {
        int indexOfStudent = getStudentIndexById(studentID);
        if( indexOfStudent != -1 )
        {
            Student student = studentList.get(indexOfStudent);
            ArrayList<Integer> scores = student.getScores();
            
            int sum = 0;
            for(int score : scores)
            {
                sum += score;
            }
            
            System.out.println( sum / scores.size() );
        } else {
            System.out.println("Error: Unable to locate student with given ID: " + studentID);
        }
    }
    
    /**
     * Verifies student e-mail addresses and displays all invalid e-mail addresses to the user
     * 
     */
    public static void print_invalid_emails()
    {
        ArrayList<String> invalidEmails = new ArrayList<String>();
        
        for( Student student : studentList )
        {
            String email = student.getEmail();
            
            if(email.contains(" ") || !email.contains("@") || !email.contains("."))
            {
                invalidEmails.add(email);
            }
            
        }
        
        if( invalidEmails.size() == 0 )
        {
            System.out.println("No invalid emails found.");
        }
        else
        {
            System.out.println("Invalid emails: " + invalidEmails.toString());
        }
    }
    
    /**
     * Looks up a student in the studentList by ID
     * 
     * @param studentID is the id to look up
     * @return index is the index of the student within the list
     */
    
    private static int getStudentIndexById (int studentID)
    {
        //jump out of the loop as soon as the student is found
        boolean found = false;
        int i = 0;
        int index = -1; //will return -1 if a student is not found
        
        while(!found)
        {
            Student student = studentList.get(i);
            if(student.getId() == studentID)
            {
                found = true;
                index = studentList.indexOf(student);
            } else {
                i++;
            }
            
            if( i >= studentList.size() )
            {
                found = true;
            }
        }
        
        return index;
    }
}
