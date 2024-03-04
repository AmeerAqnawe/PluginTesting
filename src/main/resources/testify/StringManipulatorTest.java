package testify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringManipulatorTest {

    private StringManipulator manipulator;

    @BeforeEach
    public void setUp() {
        manipulator = new StringManipulator();
    }

    @Test
    public void testConcatenate() {
        assertEquals("hello world", manipulator.concatenate("hello ", "world"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> manipulator.concatenate(null, "world"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", manipulator.toUpperCase("hello"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> manipulator.toUpperCase(null));
    }

    @Test
    public void testStringLength() {
        assertEquals(5, manipulator.stringLength("hello"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> manipulator.stringLength(null));
    }

    @Test
    public void testLongestSubstringWithoutRepeatingCharacters() {
        assertEquals(" world", manipulator.longestSubstringWithoutRepeatingCharacters("hello world"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> manipulator.longestSubstringWithoutRepeatingCharacters(null));
    }

    @Test
    public void testCountSubstringOccurrences() {
        assertEquals("Case-sensitive count: 2, Case-insensitive count: 3", manipulator.countSubstringOccurrences("hello Hello hEllo", "ello"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> manipulator.countSubstringOccurrences(null, "test"));
    }
}
