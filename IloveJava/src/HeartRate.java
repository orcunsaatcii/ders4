
public class HeartRate {

	private String name;
	private String surname;
	private int birthYear,age;
	private double mhr,thr;
	int year = 2022;

	public HeartRate() {
		
	}
	
	public HeartRate(String name, String surname, int birthYear) {
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
		this.age = year - this.birthYear;
	}
	public double mhr() {
		this.mhr = 220 - this.age;
		return this.mhr;
	}
	public double thr() {
		this.thr = mhr() * (double) 85/100;
		return this.thr;
	}
	public static void show() {
		/*System.out.println("Name: " + this.name);
		System.out.println("Surname: " + this.surname);
		System.out.println("Age: " + this.age);*/
		System.out.println("MHR: ");
		System.out.println("THR: ");
	}

}
