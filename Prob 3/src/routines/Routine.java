package routines;
import java.util.ArrayList;
import java.util.Scanner;

import classes.Class;
import courses.Course;

public class Routine{
    ArrayList<Class> class_list = new ArrayList<Class>();
    public ArrayList<Course> courses = new ArrayList<Course>();
    
    
     public void displayList() {
    	for(int i=0;i<this.courses.size();i++) {
    		Course a = courses.get(i);
    		System.out.println(a.getName()+","+a.getTeacherName());
    	}
    	
    }
     
     
     public void createRoutine() {
    	 Scanner in = new Scanner(System.in);
    	 for(int i=0;i<this.courses.size();i++) {
     		Course a = courses.get(i);
     		System.out.println(i+"."+a.getName());
     	}
    	 int day,hour,course;
    	 System.out.println("(DAY) (HOUR) (COURSE)");
    	 System.out.println("Enter 'A' to Exit");
     	while(in.hasNextInt()) {
     		day = in.nextInt();
     		hour = in.nextInt();
     		course = in.nextInt();
     		Class a = new Class(day,hour,course);
     		class_list.add(a);
     	}     	
     }
     
     public void showRoutine() {
    	 for(int i=0;i<this.class_list.size();i++) {
    		 Class a = class_list.get(i);
    		 String course_name = courses.get(a.getCoursee_id()).getName();
    		 System.out.println(a.getDay() +" "+ a.getHour()+" "+course_name);
    	 }
     }


}