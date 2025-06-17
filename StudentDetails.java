package task.problem;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
    	
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	
    	System.out.println("Enter the Name :");
    	String stdName = scanner.nextLine();
    	
    	System.out.println("Enter the Roll number");
    	Integer rollNumber = scanner.nextInt();
    	
    	
    	int[] marks = new int[5];
    	int sum=0;
    	
    	//get five subject marks
    	for(int i=0; i < 5 ; i++) {
    		System.out.println("Enter the subject " + (i + 1)+ ":");
    		marks[i]=scanner.nextInt();
    		sum +=marks[i] ;
    	}
    	
    	//calculate average
    	double averageMark = (double) sum/5;
    	
    	System.out.println("-----------------> Student Details < --------------------------");
    	System.out.println("Student name : "+stdName);
    	System.out.println("Student roll number : "+rollNumber);
    	for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + " Marks: " + marks[i]);
        }
    	System.out.println("Total mark : " + sum);
    	System.out.println("Average mark : "+ averageMark);
    	
    	scanner.close();
    	
    	
    	
    	
        
    }
}
