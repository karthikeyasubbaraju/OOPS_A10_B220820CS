import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OldSelectionTest {

    // Positive test case: Passes a Comic instance, expecting its title.
    @Test
    void testGetAgeOrTitleForComic() {
        Comic comic = new Comic("Invincible", 18);
        String result = OldSelection.getAgeOrTitle(comic);
        assertEquals("Invincible", result, "Should return the title of the comic.");
    }

    // Negative test case: Passes a String object, expecting an empty string as output.
    @Test
    void testGetAgeOrTitleWithUnsupportedType() {
        String unsupportedObject = "Not a book";
        String result = OldSelection.getAgeOrTitle(unsupportedObject);
        assertEquals("", result, "Should return an empty string for unsupported types.");
    }
}
