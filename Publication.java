/*
 * Christy Pavlik
 * December 5, 2020
 * Final Project
 * Java 2212.502
 */
package finalProject;

public class Publication {
	//data fields
		private String name;
		private String publisher;
		private int year; 
		private int pages;
		
		////////////////////////////// Constructors
		Publication(){
			
		}
		Publication(String name, String publisher, int year, int pages){
			this.name = name;
			this.publisher = publisher;
			this.year = year;
			this.pages = pages;
		}
		////////////////////////////////// getters and setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getPages() {
			return pages;
		}
		public void setPages(int pages) {
			this.pages = pages;
		}
		
		/////////////////////////////////// other methods
		
		public int yearMethod() {
			return (2020 - year);
		}
		
		@Override
		public String toString() {
			return "\nName: " + name + "\n\tPublisher: " + publisher + "\n\tYear published: " + year 
					+ "\n\tNumber of pages: " + pages + "\n\tAge: " + yearMethod() + " years";
		}
		
}
