package oldshelf;

public class OldSelection {

	// DONE: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		return switch(o){
			case TextBook t -> t.subject();
			case Comic c -> c.getTitle();
			case Fiction f -> f.getName();
			default -> "";
		}
		
		// if (o instanceof Comic c) {
		// 	return c.getTitle();	
		// }
		// if( o instanceof Fiction f ){
		// 	return f.getName();
		// }
		// if( o instanceof TextBook t){
		// 	return t.subject();
		// }
		// return "";
	}

	public static void main(String[] args) {

		// DONE: Write a test code here and execute and text.
		TextBook t = new TextBook("Physics");

		System.out.println(OldSelection.getAgeOrTitle(t));

		Comic c = new Comic("Invincible",18);

		System.out.println(OldSelection.getAgeOrTitle(c));

		Fiction f = new Fiction("The Nun",FictionType.GoK);

		System.out.println(OldSelection.getAgeOrTitle(f));
	
		
	}
}
