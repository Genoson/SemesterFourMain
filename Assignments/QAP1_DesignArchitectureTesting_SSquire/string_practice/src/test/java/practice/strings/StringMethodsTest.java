package practice.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// better tests and methods not modified to pass bad tests would involve:
//^^ preforming the Arrays.toString() conversion in the test not in the method
class StringMethodsTest{

    @Test
    void testPrintDuplicateCharacters() {
        assertArrayEquals(new char[] {'a'}, StringMethods.printDuplicateCharacters("Java"));
        assertArrayEquals(new char[] {'a', 'n'}, StringMethods.printDuplicateCharacters("Banana"));
        assertArrayEquals(new char[] {}, StringMethods.printDuplicateCharacters("aeiou"));
    }

    @Test
    void testDetermineIfTwoStringsAreAnagrams() {
        assertTrue(StringMethods.determineIfTwoStringsAreAnagrams("cork", "rock"));
        assertFalse(StringMethods.determineIfTwoStringsAreAnagrams("rock", "crock"));
        assertFalse(StringMethods.determineIfTwoStringsAreAnagrams("carry", "car"));
    }

    @Test
    void testReturnFirstNonDuplicateChar(){
        assertEquals('H', StringMethods.returnFirstNonDuplicateChar("Hannah"));
        assertEquals('c', StringMethods.returnFirstNonDuplicateChar("aabbc"));
        assertNull(StringMethods.returnFirstNonDuplicateChar("aabbcc"));
    }

    @Test
    void testReverseStringIterative(){
        assertEquals("olleh", StringMethods.reverseStringIterative("hello"));
        assertEquals("", StringMethods.reverseStringIterative(""));
        assertEquals("a", StringMethods.reverseStringIterative("a"));
    }

    @Test
    void testReverseStringRecursive(){
        assertEquals("olleh", StringMethods.reverseStringRecursive("hello"));
        assertEquals("", StringMethods.reverseStringRecursive(""));
        assertEquals("a", StringMethods.reverseStringRecursive("a"));
    }

    @Test
    void testStringContainsOnlyDigits(){
        assertTrue(StringMethods.stringContainsOnlyDigits("12345"));
        assertFalse(StringMethods.stringContainsOnlyDigits("12345a"));
        assertFalse(StringMethods.stringContainsOnlyDigits(""));
        assertFalse(StringMethods.stringContainsOnlyDigits("a"));
    }

    @Test
    void testReturnDuplicateCharactersAndCount(){
        assertEquals("[a:2, b:2]", StringMethods.returnDuplicateCharactersAndCount("aabb"));
        assertEquals("[]", StringMethods.returnDuplicateCharactersAndCount(""));
        assertNotEquals("[a:1]", StringMethods.returnDuplicateCharactersAndCount("a"));
        assertEquals("[g:2, m:2, r:2]", StringMethods.returnDuplicateCharactersAndCount("programming"));
    }
   
    @Test
    void testCountVowelsAndConsonants(){
        assertEquals("[3, 8]", StringMethods.countVowelsAndConsonants("programming"));
        assertEquals("[0, 0]", StringMethods.countVowelsAndConsonants(""));
        assertNotEquals("[1, 1]", StringMethods.countVowelsAndConsonants("y"));
        assertEquals("[2, 2]", StringMethods.countVowelsAndConsonants("JAVA"));
    }

    @Test
    void testConvertStringToInteger(){
        assertEquals(123, StringMethods.convertStringToInteger("123"));
        assertEquals(0, StringMethods.convertStringToInteger("0"));
        assertEquals(-123, StringMethods.convertStringToInteger("-123"));
        assertEquals(123, StringMethods.convertStringToInteger("+123"));
        assertEquals(0 , StringMethods.convertStringToInteger(null));
        assertEquals(0, StringMethods.convertStringToInteger(""));
    }

    @Test
    void testReplaceCharacterWithCharacter(){
        assertEquals("JAvA", StringMethods.replaceCharacterWithCharacter("Java", 'a', "A"));
        assertEquals("%20", StringMethods.replaceCharacterWithCharacter(" ", ' ', "%20"));
        assertEquals("?", StringMethods.replaceCharacterWithCharacter("a", 'a', "?"));
    }
    
}
