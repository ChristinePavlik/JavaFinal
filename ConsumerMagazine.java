/*
 * Christy Pavlik
 * December 5, 2020
 * Final Project
 * Java 2212.502
 */
package finalProject;

public class ConsumerMagazine extends Magazine {
	//data fields
	private String specialty;
	private double price;
	
	////////////////////////////// Constructors
	ConsumerMagazine(){
		super();
	}
	ConsumerMagazine(String name, String publisher, int year, int pages, String howOften, Boolean online, String specialty, double price){
		super(name, publisher, year, pages, howOften, online);
		this.specialty = specialty;
		this.price = price;
	}
	////////////////////////////////// getters and setters
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//////////////////////////////// methods
	@Override
	public String toString() {
		return super.toString() + "\n\tSpecialty: " + specialty + "\n\tPrice: $" + price + " per year"; 
	}
}
