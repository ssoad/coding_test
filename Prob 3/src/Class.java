
public class Class {
	 int day;
	    int hour;
	    int coursee_id;

	    Class(int day, int hour, int coursee_id){
	        this.day = day;
	        this.hour = hour;
	        this.coursee_id = coursee_id;
	    }

	    @Override
	    public String toString() {
	        // TODO Auto-generated method stub
	        return day+" "+hour+" "+coursee_id;
	    }
}
