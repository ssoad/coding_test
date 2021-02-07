package classes;

public class Class {
	 private int day;
	 private int hour;
	 private int coursee_id;

	    public Class(int day, int hour, int coursee_id){
	        this.setDay(day);
	        this.setHour(hour);
	        this.setCoursee_id(coursee_id);
	    }

	    @Override
	    public String toString() {
	        // TODO Auto-generated method stub
	        return getDay()+" "+getHour()+" "+getCoursee_id();
	    }

		public int getCoursee_id() {
			return coursee_id;
		}

		public void setCoursee_id(int coursee_id) {
			this.coursee_id = coursee_id;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getHour() {
			return hour;
		}

		public void setHour(int hour) {
			this.hour = hour;
		}
}
