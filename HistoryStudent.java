package overriding_class;


public class HistoryStudent extends Student{
	private int historyMarks;
	private int civicsMarks;
	
	public HistoryStudent(String studentName, String studentClass, int historyMarks,
			int civicsMarks) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	public int getPercentage() {
		int total = this.historyMarks + this.civicsMarks;
		int percentage = total/2;
		return percentage;
	}

	@Override
	public String toString() {
		return "HistoryStudent [studentName=" + studentName + ", studentClass=" + studentClass + ", historyMarks="
				+ historyMarks + ", civicsMarks=" + civicsMarks + "]";
	}
	
	
}