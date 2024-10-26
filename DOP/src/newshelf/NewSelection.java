package newshelf;

import oldshelf.FictionType;

public class NewSelection {

	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Comic c) {
			return c.title();
		}
		if( o instanceof Fiction f ){
			return f.name();
		}
		if( o instanceof TextBook t){
			return t.subject();
		}
		return "Empty";
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t = new TextBook("Chemistry");
		Comic c = new Comic("Gintama",26);
		Fiction f = new Fiction("The 100",FictionType.Tragedy);
		

		System.out.println(NewSelection.getAgeOrTitle(c));
		System.out.println(NewSelection.getAgeOrTitle(t));
		System.out.println(NewSelection.getAgeOrTitle(f));
	
		
	
		
	}
}
