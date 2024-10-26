package oldshelf;

public class Comic extends Book {

	/* DONE: Add most strict modifiers here*/ 
	private final String Title;

	// DONE: Warning to be removed.
	private final int ageOfMainCharacter;

	// DONE Correct the error
	public Comic(String Title,int ageOfMainCharacter) {
		this.Title = Title;
		this.ageOfMainCharacter = ageOfMainCharacter;
	}
	
	// DONE : create a getter if required.
	
	
	// DONE: Create a setter if required

	// DONE: write a toString method
	@Override
	public String toString() {
		String s = "Title : " + this.getTitle();
		String s1 = "Age of Main Character : " + this.getAgeOfMainCharacter();
		return s + "\n" + s1;
	}

	public String getTitle() {
		return Title;
	}

	public int getAgeOfMainCharacter() {
		return ageOfMainCharacter;
	}

	// DONE: Bonus: 
	@Override
	public int hashCode() {
		return Integer.hashCode(ageOfMainCharacter);

		}

		// DONE: Fill up an arbitrary hash method that takes into account only the age of main characted and the Strign title
	
	// DONE: Bonus: 
	@Override
	public boolean equals(Object o) {
		// DONE: Based on the information about hashCode write the equals method.
		if( this == o ){
			return true;
		}
		else if( o.getClass() != getClass() ){
			return false;
		}
		else{
			return hashCode() == o.hashCode();
		}


	}
}
