package app;
import java.util.ArrayList;
import java.util.Scanner;

import courses.Course;
import routines.Routine; 
public class App {
	
    public static void Run(){
    	Routine routine = new Routine();
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        routine.courses.add(new Course("English Grammar", "John Smith"));
        routine.courses.add(new Course("Mathematics", "Lara Gilbert"));
        routine.courses.add(new Course("Physics", "Johanna Kabir"));
        routine.courses.add(new Course("Chemistry", "Danniel Robertson"));
        routine.courses.add(new Course("Biology", "Larry Cooper"));
        while(true) {
        System.out.println("A. Create Routine\nB. Show Routine\nC. List Courses with Teachers Name");
        char c = in.next().charAt(0);
        switch(c){
            case 'A':
            routine.createRoutine();
            break;
            case 'B':
            routine.showRoutine();
            break;
            case 'C':
            routine.displayList();
            break;
        }
        }


    }
    
    
    
}
