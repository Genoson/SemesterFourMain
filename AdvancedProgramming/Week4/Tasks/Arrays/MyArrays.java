import java.util.*;
//import java.util.Arrays;
//^^ i was definitly meant to use this and its methods


public class MyArrays {

    private static Scanner scanner = new Scanner(System.in);
    //^^ fixed issue with scanner by creating a private static Scanner object
    //^^ and referencing it in multiple methods, never closing the scanner

    // Task 1: arraySumAndAverage
      /**
        * This method takes an array of integers and returns an array of two integers.
        * The first integer in the returned array is the sum of all the integers in the array.
        * The second integer in the returned array is the average of all the integers in the array.
        * 
        * @param array - an array of integers
        * @return an array of two integers [sum, average]
        */
    public static int[] arraySumAndAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum / array.length;
        int[] result = {sum, average};
        return result;
    }  

    // Task 2: arrayIncrementAllElements
    /**
     * This method takes an array of integers and returns an array of integers.
     * The returned array contains the same integers as the input array, but each integer is incremented by 1.
     * 
     * @param array - an array of integers
     * @return an array of integers
     */
    public static int[] arrayIncrementAllElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 1;
        }
        return array;
    }

    // a toString method that takes an array of integers and prints it out
    /**
     * This method takes an array of integers and prints it out.
     * @param array - an array of integers
     */
    public static void toString(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    //Task 3: arraySquareAndCube 
    /**
     * This method takes an array of integers and returns an array of two integers.
     * The first integer in the returned array is the square of all the integers in the array.
     * The second integer in the returned array is the cube of all the integers in the array.
     * 
     * @param array - an array of integers
     * @return a 2D array of integers [[square], [cube]]
     */
    public static int[][] arraySquareAndCube(int[] array) {
        int[][] result = new int[array.length][array.length];
        int[] square = new int[array.length];
        int[] cube = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            square[i] = array[i] * array[i];
            cube[i] = array[i] * array[i] * array[i];
        }
        result[0] = square;
        result[1] = cube;
        return result;
    }

    //Task 4: arrayLargestWithIndex
    /**
     * This method takes an array of integers and returns an array of two integers.
     * The first integer in the returned array is the largest integer in the array.
     * The second integer in the returned array is the index of the largest integer in the array.
     * 
     * @param array - an array of integers
     * @return an array of two integers [largest, index]
     */
    public static int[] arrayLargestWithIndex(int[] array) {
        int[] result = new int[2];
        int largest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
                index = i;
            }
        }
        result[0] = largest;
        result[1] = index;
        return result;
    }

    //Task 5: arraySearchFromUserInput
    /**
     * This method takes an array of integers and has no return value.
     * It asks the user to enter an integer and then searches the array for that integer.
     * If the integer is found, it prints out the index of the integer in the array.
     * 
     * @param array - an array of integers
     */
    public static void arraySearchFromUserInput(int[] array) {
        // scanner declared as a private static Scanner object in this class instead of local to this method
        // Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search for: ");
        int number = scanner.nextInt();
        for(int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Found at index: " + i);
                //scanner.close();
                return;
            }
        }
        System.out.println("Not found");
        // don't close scanner, it prevents the scanner from being reopened in the next method
        //scanner.close();
        return;
    }

    //Task 6: arrayEvenCountOddCount
    /**
     * This method takes an array of integers and returns an array of two integers.
     * The first integer in the returned array is the number of even integers in the array.
     * The second integer in the returned array is the number of odd integers in the array.
     * 
     * @param array - an array of integers
     * @return an array of two integers [evenCount, oddCount]
     */
    public static int[] arrayEvenCountOddCount(int[] array) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int[] result = {evenCount, oddCount};
        return result;

    }

    //Task 7 : arraySortUserChoice
    /**
     * This method takes an array of integers and returns an array of integers.
     * The returned array contains the same integers as the input array but sorted.
     * The user can choose to sort the array in ascending or descending order.
     * 
     * @param array - an array of integers
     * @return a sorted array of integers
     */
    public static int[] arraySortUserChoice(int[] array) {
        int [] temp = new int[array.length]; 
        // Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter 1 to sort in ascending order\n2 to sort in descending order.");
        int choice = scanner.nextInt();
        if (choice == 1) {
            // nested for loops, an inefficient solution
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        temp[i] = array[i];
                        array[i] = array[j];
                        array[j] = temp[i];
                    }
                }
            }
        } else if (choice == 2) {
            // repeated code, a sort method would be better
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        temp[i] = array[i];
                        array[i] = array[j];
                        array[j] = temp[i];
                    }
                }
            }
        } else {
            System.out.println("Invalid choice.");
        }
        // scanner doesn't need to be closed, it is a soft issue.
        // scanner.close();
        return array;

    }

    // Adding a overloaded method of the arraySortUserChoice method
    // will receive the choice as a parameter
      /**
         * This method takes an array of integers and an integer, returns an array of integers.
         * The returned array contains the same integers as the input array but sorted.
         * ascending or descending order based on the second parameter.
         * 
         * @param array - an array of integers
         * @param choice - an integer
         * @return a sorted array of integers
         */
    public static int[] arraySortUserChoice(int[] array, int choice) {
        int [] temp = new int[array.length]; 
        if (choice == 1) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        temp[i] = array[i];
                        array[i] = array[j];
                        array[j] = temp[i];
                    }
                }
            }
        } else if (choice == 2) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        temp[i] = array[i];
                        array[i] = array[j];
                        array[j] = temp[i];
                    }
                }
            }
        } else {
            // redundant, but just in case
            System.out.println("Invalid choice.");
        }
        return array;

    }

    //Task 8: arrayFindSecondLargestOrSmallest
            /**
         * This method takes an array of integers and returns an array of two Strings.
         * The first String in the returned array is the users choice of whether to find the second largest or smallest number.
         * The second String in the returned array is the second largest or smallest number in the array.
         * 
         * @param array - an array of integers
         * @return an array of two Strings [choice, secondLargestOrSmallest]
         */
    public static String[] arrayFindSecondLargestOrSmallest(int[] array) {
        String[] result = new String[2];
        System.out.println("Enter 1 to find the second largest\n2 to find the second smallest.");
        int choice = scanner.nextInt();
        if (choice == 1) {
            result[0] = "largest";
            MyArrays.arraySortUserChoice(array, 1);
            result[1] = Integer.toString(array[array.length - 2]);
        }
        else if (choice == 2) {
            result[0] = "smallest";
            MyArrays.arraySortUserChoice(array, 1);
            result[1] = Integer.toString(array[1]);
        }
        else {
            System.out.println("Invalid choice.");
        }
        return result;

    }
    
    // Task 9: arrayFindAndCountRepeatValuesThenOutput
            /**
         * This method takes an array of integers and prints the number of times 
         * each integer repeats in the array, only if repeated.
         * 
         * @param array - an array of integers
         */
    public static void arrayFindAndCountRepeatValuesThenOutput(int[] array) {
        int[] count = new int[array.length];
        // nested for loop again, inefficient solution
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (count[i] > 0) {
                System.out.println("The number " + array[i] + " is repeated " + count[i] + " times.");
                count[i] = 0;
            }
        }
        // I would need to create a map of the values already reported and then only 
        //report the ones that are not in the map.
        // better solutions definitely exist.

    }

    // Task 10: arraySortAndMergeTwoArrays
        /**
     * This method takes two arrays of integers and returns an array of integers.
     * The returned array contains the same integers as the input arrays but sorted.
     * The two arrays are merged into one array.
     * 
     * @param array1 - an array of integers
     * @param array2 - an array of integers
     * @return a sorted array of integers
     */
    public static int[] arraySortAndMergeTwoArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        MyArrays.arraySortUserChoice(array1, 1);
        MyArrays.arraySortUserChoice(array2, 1);
        int i = 0;
        int j = 0;
        for (int k = 0; k < result.length; k++) {
            if (i < array1.length && j < array2.length) {
                if (array1[i] < array2[j]) {
                    result[k] = array1[i];
                    i++;
                } else {
                    result[k] = array2[j];
                    j++;
                }
            } else if (i < array1.length) {
                result[k] = array1[i];
                i++;
            } else {
                result[k] = array2[j];
                j++;
            }
        }
        return result;
    }

    // Task 11: arrayInsertToSpecificPosition
            /**
         * This method takes an array of integers and two integers returning an array of integers.
         * The returned array contains the same integers as the input array but with the value 
         * inserted at the specified position.
         * 
         * @param array - an array of integers
         * @param position - an integer
         * @param value - an integer
         * @return an array of integers
         */
    public static int[] arrayInsertToSpecificPosition(int[] array, int position, int value) {
        int[] result = new int[array.length + 1];
        //first we copy the array up to the insertion point
        for (int i = 0; i < position; i++) {
            result[i] = array[i];
        }
        //then we insert the value
        result[position] = value;
        //then we copy the array after the insertion point
        for (int i = position + 1; i < result.length; i++) {
            result[i] = array[i - 1];
        }
        return result;
    }

    // Task 12: arrayDeleteInteger
            /**
         * This method takes an array of integers and an integer returning an array of integers.
         * The returned array contains the same integers as the input array but with the value 
         * removed from the array.
         * 
         * @param array - an array of integers
         * @param value - an integer
         * @return an array of integers
         */
    public static int[] arrayDeleteInteger(int[] array, int value) {
        int[] result = new int[array.length - 1];
        // we use count to keep track of our position in the result array
        int count = 0;
        // we iterate through the array copying each value to the result array
        // except the value to delete, which we skip
        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                result[count] = array[i];
                count++;
            }
        }
        return result;
    }


    
}
