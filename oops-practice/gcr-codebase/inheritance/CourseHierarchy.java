package inheritance;

//	Base class
	class Course {
	 String courseName;
	 int duration; // in hours
	
	 Course(String courseName, int duration) {
	     this.courseName = courseName;
	     this.duration = duration;
	 }
	
	 void displayDetails() {
	     System.out.println("Course Name: " + courseName);
	     System.out.println("Duration: " + duration + " hours");
	 }
	}
	
//	Intermediate subclass
	class OnlineCourse extends Course {
	 String platform;
	 boolean isRecorded;
	
	 OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
	     super(courseName, duration);
	     this.platform = platform;
	     this.isRecorded = isRecorded;
	 }
	
	 @Override
	 void displayDetails() {
	     super.displayDetails();
	     System.out.println("Platform: " + platform);
	     System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
	 }
	}
	
//	Final subclass
	class PaidOnlineCourse extends OnlineCourse {
	 double fee;
	 double discount;
	
	 PaidOnlineCourse(String courseName, int duration, String platform,boolean isRecorded, double fee, double discount) {
	     super(courseName, duration, platform, isRecorded);
	     this.fee = fee;
	     this.discount = discount;
	 }
	
	 @Override
	 void displayDetails() {
	     super.displayDetails();
	     System.out.println("Course Fee: ₹" + fee);
	     System.out.println("Discount: " + discount + "%");
	     System.out.println("Final Price: ₹" + (fee - (fee * discount / 100)));
	 }
	}
	
//	Main class
	public class CourseHierarchy {
	 public static void main(String[] args) {	
	     PaidOnlineCourse course =
	             new PaidOnlineCourse("Java Full Stack",
	                     120,
	                     "Udemy",
	                     true,
	                     5000,
	                     20);
	
	     course.displayDetails();
	 }


}
