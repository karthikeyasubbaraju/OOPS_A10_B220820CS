package newshelf;

import IBook.FictionType;
import IBook.Comic;
import IBook.TextBook;

public class NewSelection {
    public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case Comic c -> c.title();
            case Fiction f when f.type() == FictionType.Tragedy -> "Tragic: " + f.name(); // Example of using `when` for Fiction
            case Fiction f -> f.name();
            case TextBook t -> t.subject();
            default -> "Empty";
        };
    }

    public static String getAgeOrTitle(Object o){
        return switch(o){
            case Comic(String title,int age) ->"Comic: " + title + ", Age: " + age;
            case Fiction(String name, FictionType type) when type == FictionType.Tragedy ->
                "Tragic Fiction: " + name;
            case Fiction(String name, FictionType type) -> "Fiction: " + name;
            case TextBook(String subject) -> "TextBook: " + subject;
            default -> "Unknown type";
        };
    }
    
    public static void main(String[] args) {
        // Testing with different types
        TextBook t = new TextBook("math");
        Comic c = new Comic("one piece", 19);
        Fiction f1 = new Fiction("The NUN", FictionType.Tragedy);
        Fiction f2 = new Fiction("THE ELETERNAL WHITE SNAKE", FictionType.Drama);

        System.out.println(NewSelection.getAgeOrTitle(c));
        System.out.println(NewSelection.getAgeOrTitle(t));  
        System.out.println(NewSelection.getAgeOrTitle(f1)); 
        System.out.println(NewSelection.getAgeOrTitle(f2)); 
    }
}
