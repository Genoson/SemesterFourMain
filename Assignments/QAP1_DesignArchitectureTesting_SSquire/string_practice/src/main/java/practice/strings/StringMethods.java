package practice.strings;

import java.util.*;


public final class StringMethods{

    //Task 1: return duplicate characters in a string
    /**
     * Return duplicate characters in a string
     * 
     * @param str - input string
     * @return - an array of duplicate characters
     */
    public static char[] printDuplicateCharacters(String str) {
        // declare a char array of unknown size(ArrayList) to hold the duplicate characters
        ArrayList<Character> result = new ArrayList<Character>();
        // declare a map to hold the characters and their frequency
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // iterate through the string and add the characters to the map
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        // iterate through the map and add the duplicate characters to the result array
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        // declare a char array of the size of the result array
        char[] resultArray = new char[result.size()];
        // convert the result array to a char array
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }  

    //Task 2: determine if two strings are anagrams
    /**
     * Determine if two strings are anagrams
     * 
     * @param str1 - first string
     * @param str2 - second string
     * @return - true if the two strings are anagrams, false otherwise
     */
    public static boolean determineIfTwoStringsAreAnagrams(String str1, String str2) {
        // convert the strings to lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // convert the strings to char arrays
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        // sort the char arrays
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        // compare the sorted char arrays
        return Arrays.equals(str1Array, str2Array);
    }

    //Task 3: return the first non-duplicate character in a string
    /**
     * Return the first non-duplicate character in a string
     * 
     * @param str - input string
     * @return - the first non-duplicate character in the string
     */
    public static Character returnFirstNonDuplicateChar(String str) {
        // declare a map to hold the characters and their frequency
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // iterate through the string and add the characters to the map
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        // iterate through the map and return the first non-duplicate character
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    //Task 4.1: reverse a string iteratively
    /**
     * Reverse a string iteratively
     * 
     * @param str - input string
     * @return - the reversed string
     */
    public static String reverseStringIterative(String str) {
        // convert the string to a char array
        char[] strArray = str.toCharArray();
        // declare a char array of the same size as the input string
        char[] resultArray = new char[str.length()];
        // iterate through the input string and add the characters to the result array
        for (int i = 0; i < str.length(); i++) {
            resultArray[i] = strArray[str.length() - i - 1];
        }
        // convert the result array to a string
        return new String(resultArray);
    }

    //Task 4.2: reverse a string recursively
    /**
     * Reverse a string recursively
     * 
     * @param str - input string
     * @return - the reversed string
     */
    public static String reverseStringRecursive(String str) {
        // base case
        if (str.length() <= 1) {
            return str;
        }
        // recursive case
        return reverseStringRecursive(str.substring(1)) + str.charAt(0);
    }

    //Task 5: check if string contains only digits
    /**
     * Check if string contains only digits
     * 
     * @param str - input string
     * @return - true if the string contains only digits, false otherwise
     */
    public static boolean stringContainsOnlyDigits(String str) {
       // using a regular expression to check if the string contains only digits
         return str.matches("[0-9]+");
    }

    //Task 6: return duplicate characters in a string with their frequency
    /**
     * Return duplicate characters in a string with their frequency
     * 
     * @param str - input string
     * @return - an array of duplicate characters with their frequency
     */
    public static String returnDuplicateCharactersAndCount(String str) {
        // declare a char array of unknown size(ArrayList) to hold the duplicate characters
        ArrayList<Character> result = new ArrayList<Character>();
        // declare a map to hold the characters and their frequency
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // iterate through the string and add the characters to the map
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        // iterate through the map and add the duplicate characters to the result array
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        // declare a char array of the size of the result array
        char[] resultArray = new char[result.size()];
        // convert the result array to a char array
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        // sort the char array to ensure consistent output order
        Arrays.sort(resultArray);
        // declare a String array of the size of the result array
        String[] resultStringArray = new String[result.size()];
        // convert the result array to a String array
        for (int i = 0; i < result.size(); i++) {
            resultStringArray[i] = resultArray[i] + ":" + map.get(resultArray[i]);
        }
        // convert the String array to a String
        return Arrays.toString(resultStringArray);
        
    }

    // Task 7: count the number of vowels and consonants in a string
    /**
     * Count the number of vowels and consonants in a string
     * 
     * @param str - input string
     * @return - an array of two integers, the first is the number of vowels, the second is the number of consonants, as a string
     */
     public static String countVowelsAndConsonants(String str) {
        //convert string to lower case
        str = str.toLowerCase();
        // declare a map to hold the characters and their frequency
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // iterate through the string and add the characters to the map
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        // declare an array to hold the number of vowels and consonants
        int[] result = new int[2];
        // iterate through the map and add the vowels and consonants to the result array
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 'a' || entry.getKey() == 'e' || entry.getKey() == 'i' || entry.getKey() == 'o' || entry.getKey() == 'u') {
                result[0] += entry.getValue();
            } else {
                result[1] += entry.getValue();
            }
        }
        // return the result array
        return Arrays.toString(result);
    }

    // Task 8: convert a String to an integer
    /**
     * Convert a String to an integer
     * 
     * @param str - input string
     * @return - the integer value of the string
     */
    public static int convertStringToInteger(String str) {
        // declare a variable to hold the integer value
        int result = 0;
        // iterate through the string and add the integer value
        if (str == null || str.length() == 0) {
            return 0;
        } else if(str.charAt(0) == '-') {
            for (int i = 1; i < str.length(); i++) {
                //check if the character is a digit
                if (Character.isDigit(str.charAt(i))) {
                    result = result * 10 + Character.getNumericValue(str.charAt(i));
                }
                else {
                    return 0;
                }
            }
            result = -result;
        } else  if (str.charAt(0) == '+') {
            for (int i = 1; i < str.length(); i++) {
                //check if the character is a digit
                if (Character.isDigit(str.charAt(i))) {
                    result = result * 10 + Character.getNumericValue(str.charAt(i));
                }
                else {
                    return 0;
                }
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                //check if the character is a digit
                if (Character.isDigit(str.charAt(i))) {
                    result = result * 10 + Character.getNumericValue(str.charAt(i));
                }
                else {
                    return 0;
                }
            }
        }
        // return the integer value
     
        return result;
    }

    // Task 9: replace given character with another character in a string
    // I dont like that the question says character a bunch of times but the example is to replace a character with a string("%20")
    /**
     * Replace given character with another character in a string
     * 
     * @param str - input string
     * @param oldChar - the character to be replaced
     * @param newChar - the character to replace the old character
     * @return - the string with the replaced character
     */
    public static String replaceCharacterWithCharacter(String str, char oldChar, String newChar) {
        // declare a StringBuilder to hold the new string
        StringBuilder result = new StringBuilder();
        // iterate through the string and replace the old character with the new character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldChar) {
                result.append(newChar);
            } else {
                result.append(str.charAt(i));
            }
        }
        // return the new string
        return result.toString();
    } 


}
