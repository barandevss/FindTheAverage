package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        int quiz , midterm , fınal ;
        float average ;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the quiz mark : ");
        quiz = input.nextInt();
        
        System.out.print("Enter the midterm mark : ");
        midterm = input.nextInt();
        
        System.out.print("Enter the fınal mark : ");
        fınal = input.nextInt();
        
        average = (quiz + midterm + fınal) / 3;
        
        System.out.println("The average is : " + average);
        
        
        
        
        
        
        
        
        
        

    }

}


