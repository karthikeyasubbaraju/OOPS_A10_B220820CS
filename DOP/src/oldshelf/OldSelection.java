package newshelf;

import oldshelf.FictionType;

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

    public static void main(String[] args) {
        // Testing with different types
        TextBook t = new TextBook("Chemistry");
        Comic c = new Comic("Gintama", 26);
        Fiction f1 = new Fiction("The 100", FictionType.Tragedy);
        Fiction f2 = new Fiction("The Catcher in the Rye", FictionType.Drama);

        System.out.println(NewSelection.getAgeOrTitle(c));   // Expected: "Gintama"
        System.out.println(NewSelection.getAgeOrTitle(t));   // Expected: "Chemistry"
        System.out.println(NewSelection.getAgeOrTitle(f1));  // Expected: "Tragic: The 100" (because of the `when` clause)
        System.out.println(NewSelection.getAgeOrTitle(f2));  // Expected: "The Catcher in the Rye"
    }
}
