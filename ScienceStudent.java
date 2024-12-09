package overriding_class;


public class ScienceStudent extends Student{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	public ScienceStudent(String studentName, String studentClass, int physicsMarks,
			int chemistryMarks, int mathsMarks) {
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	public int getPercentage() {
		int total = this.physicsMarks + this.chemistryMarks + this.mathsMarks;
		int percentage = total/3;
		return percentage;
	}

	@Override
	public String toString() {
		return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + ", studentName=" + studentName + ", studentClass=" + studentClass + "]";
	}
	
	
}