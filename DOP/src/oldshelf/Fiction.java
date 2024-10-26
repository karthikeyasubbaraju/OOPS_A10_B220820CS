package oldshelf;

public class Fiction extends Book {

	/* DONE: Add most strict modifiers here*/ private final String name;
	// DONE: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private static FictionType type;
	public Fiction(String name,FictionType f) {
		
		this.name = name;
		Fiction.type = f;
		// DONE  correct the above.
	}

	public String getName() {
		return name;
	}
	public static FictionType getType() {
		return type;
	}

	

}
