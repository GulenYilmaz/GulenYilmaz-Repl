package Repl_Homeworks;
/*
 * Create a custom Exception class
In main class create a method that will check students grade
if students grade is >90 then below exception should be thrown
if students grade is below 90 print "You are a great student"

In main method calls method gradeCheck and handle an Exception

Expected Output:
SyntaxStudentException: You are an exceptionally awesome student
 */
public class Repl00210 {
public static void gradeCheck(int grade)   {
        
        if(grade>90) {
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        }else if(grade<90) {
            System.out.println("You are a great student");
        }
    }


    public static void main(String[] args) {
        
        try {
            gradeCheck(92);
        } catch (SyntaxStudentException e) {
            
            System.out.println(e);
        }
    }
}




class SyntaxStudentException extends RuntimeException{
    
	public SyntaxStudentException(String message) {
        super(message);
    }
    
}

