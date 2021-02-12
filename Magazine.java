/*
 * Christy Pavlik
 * December 5, 2020
 * Final Project
 * Java 2212.502
 */
package finalProject;

public class Magazine extends Publication{
			//data fields
			private String howOften;
			private Boolean online;
			
			////////////////////////////// Constructors
			Magazine(){
				super();
			}
			Magazine(String name, String publisher, int year, int pages, String howOften, Boolean online){
				super(name, publisher, year, pages);
				this.howOften = howOften;
				this.online = online;
			}
			////////////////////////////////// getters and setters
			public String getHowOften() {
				return howOften;
			}
			public void setHowOften(String howOften) {
				this.howOften = howOften;
			}
			public Boolean getOnline() {
				return online;
			}
			public void setOnline(Boolean online) {
				this.online = online;
			}
			////////////////////////////////methods
			@Override
			public String toString() {
				return super.toString() + "\n\tIssued: " + howOften + "\n\tOffered online: " + online; 
			}

}
