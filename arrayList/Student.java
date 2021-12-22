package arrayList;

class Student implements Comparable<Student> {
	private String studentName;
	private int rollNo;
	private int marks;

	public Student(String studentName, int rollNo, int marks) {
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	// We need to create a method explicitly to accomplish the sort mechanism
	@Override
	public String toString() {
		return "[Name = " + studentName + ", rollNo = " + rollNo + ", marks = " + marks + "]";
	}

	
	/*
	 * public int compareTo(Student compare) { int compareMarks
	 * =((Student)compare).getMarks(); return this.marks-compareMarks; //current
	 * object - given object for ascending order }
	 */
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	  public int compareTo(Student compare) { 
		  int compareMarks = ((Student)compare).getMarks();
		  return compareMarks-this.marks; 
		  //given object - current object for descinding order
	 }
	 
}
