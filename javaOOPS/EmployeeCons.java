package javaOOPS;
class Employee{
	private int id;
	public Employee(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
}
public class EmployeeCons {

	public static void main(String[] args) {
		Employee e =new Employee(15);
		System.out.println(e.getId());
	}

}
