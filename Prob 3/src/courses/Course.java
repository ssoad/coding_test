package courses;

public class Course {
	  private String name;
	  private String teacherName;
	  
	  
	  public Course(String name, String teacherName){
	       this.setName(name);
	       this.setTeacherName(teacherName);
	    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTeacherName() {
		return teacherName;
	}


	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
}
