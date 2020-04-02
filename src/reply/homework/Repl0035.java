package reply.homework;

import java.util.Scanner;

public class Repl0035 {

	public static void main(String[] args) {
		
	  
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Do you need a loan?");
		  boolean loan;
		  loan=scan.nextBoolean();
		  
		  if(loan){
		    System.out.println("What is your credit score? ");
		    int score;
		    score=scan.nextInt();
		    if(score<=600){
		      System.out.println("The eligibility is Not eligible");
		    }else if(score>600 && score<=700){
		      System.out.println("The eligibility is Maybe eligible");
		    }else if(score>701 && score<=800){
		      System.out.println("The eligibility is Eligible");
		    }else {
		      System.out.println("The eligibility isDefinitely Eligible");
		    }
		    
		    
		  }else {
		    System.out.println("The eligibility is Unknown ");
		  }
		  
		  
	}

}
