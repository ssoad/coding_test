import java.util.ArrayList;
import java.util.Scanner;

class Routine{
    ArrayList<Class> class_list = new ArrayList<Class>();
    ArrayList<Course> courses = new ArrayList<Course>();
    
    
     void displayList() {
    	for(int i=0;i<this.courses.size();i++) {
    		Course a = courses.get(i);
    		System.out.println(a.name+","+a.teacherName);
    	}
    	
    }
     
     
     void createRoutine() {
    	 Scanner in = new Scanner(System.in);
    	 for(int i=0;i<this.courses.size();i++) {
     		Course a = courses.get(i);
     		System.out.println(i+"."+a.name);
     	}
    	 int day,hour,course;
     	for(int i=0;i<4;i++) {
     		day = in.nextInt();
     		hour = in.nextInt();
     		course = in.nextInt();
     		Class a = new Class(day,hour,course);
     		class_list.add(a);
     	}     	
     }
     
     void showRoutine() {
    	 for(int i=0;i<this.class_list.size();i++) {
    		 Class a = class_list.get(i);
    		 String course_name = courses.get(a.coursee_id).name;
    		 System.out.println(a.day +" "+ a.hour+" "+course_name);
    	 }
     }


}