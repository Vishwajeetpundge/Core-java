package overriding_class;


public class StudentTester {
	public static void main(String[] args) {
		ScienceStudent s = new ScienceStudent("Rahul","12th",70,80,90);
		System.out.println("Total Number of Students : "+s.getTotalNoStudents());
		System.out.println("Science Student Percentage : "+s.getPercentage()+"%");
		
		System.out.println("==========================================");
		
		HistoryStudent h = new HistoryStudent("Rohan","11th",57,84);
		System.out.println("Total Number of Students : "+h.getTotalNoStudents());
		System.out.println("History Student Percentage : "+h.getPercentage()+"%");
	}
}