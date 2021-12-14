package javaOOPS;

 class Details{
	String name;
	String language;
	String city;
	String state;
	Details(){
		System.out.println("It is a default constructor");
		name = "Purushotham";
		language = "telugu";
		city = "Punganur";
		state = "Andhra Pradesh";
	}
}
public class DetailsUsingCons {

	public static void main(String[] args) {
		
		Details d = new Details();
		System.out.println("Name : "+d.name);
		System.out.println("Language : "+d.language);
		System.out.println("City : "+d.city);
		System.out.println("State : "+d.state);
	}

}
