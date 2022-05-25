
public class ArraysDemo {
    
    public static void main(String[] args) {

        System.out.println("==========================");
        System.out.println("Task 1: arraySumAndAverage");
        int[] array = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = MyArrays.arraySumAndAverage(array);
        System.out.println("Sum: " + result[0]);
        System.out.println("Average: " + result[1]);

        System.out.println("==========================");
        System.out.println("Task 2: arrayIncrementAllElements");
        int[] array2 = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result2 = MyArrays.arrayIncrementAllElements(array2);
        System.out.println("Array: ");
        MyArrays.toString(result2);

        System.out.println("==========================");
        System.out.println("Task 3: arraySquareAndCube");
        int[] array3 = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] result3 = MyArrays.arraySquareAndCube(array3);
        System.out.println("Square: ");
        MyArrays.toString(result3[0]);
        System.out.println("Cube: ");
        MyArrays.toString(result3[1]);

        System.out.println("==========================");
        System.out.println("Task 4: arrayLargestWithIndex");
        int[] array4 = {1,2, 3, 40, 5, 6, 7, 8, 9, 10};
        int[] result4 = MyArrays.arrayLargestWithIndex(array4);
        System.out.println("Largest: " + result4[0]);
        System.out.println("Index: " + result4[1]);

        // commented out to deal with an error involving scanners... fixed
        System.out.println("==========================");
        System.out.println("Task 5: arraySearchFromUserInput");
        int[] array5 = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};
        MyArrays.arraySearchFromUserInput(array5);

        System.out.println("==========================");
        System.out.println("Task 6: arrayEvenCountOddCount");
        int[] array6 = {1,3, 3, 5, 5, 7, 7, 8, 8, 10};
        int[] result6 = MyArrays.arrayEvenCountOddCount(array6);
        System.out.println("Even: " + result6[0]);
        System.out.println("Odd: " + result6[1]);

        System.out.println("==========================");
        System.out.println("Task 7: arraySortUserChoice");
        int[] array7 = {4, 6, 5, 8, 9, 3, 2, 4, 10, 25, 1};
        int[] result7 = MyArrays.arraySortUserChoice(array7);
        System.out.println("Array: ");
        MyArrays.toString(result7);

        System.out.println("==========================");
        System.out.println("Task 8: arrayFindSecondLargestOrSmallest");
        int[] array8 = {4, 6, 5, 8, 9, 3, 2, 4, 10, 25, 1};
        String[] result8 = MyArrays.arrayFindSecondLargestOrSmallest(array8);
        System.out.println("Finding the second " + result8[0] + " element in the array");
        System.out.println("Second " + result8[0] + " element: " + result8[1]);

        System.out.println("==========================");
        System.out.println("Task 9: arrayFindAndCountRepeatValuesThenOutput");
        int[] array9 = {4,5,6,7,4,8,3,4,5,6,6,6};
        MyArrays.arrayFindAndCountRepeatValuesThenOutput(array9);

        System.out.println("==========================");
        System.out.println("Task 10: arraySortAndMergeTwoArrays");
        int[] array10 = {2,4,6,8,10,12,14,16,18,20};
        int[] array11 = {1,3,5,7,9,11,13,15,17,19};
        int[] result10 = MyArrays.arraySortAndMergeTwoArrays(array10, array11);
        System.out.println("Array: ");
        MyArrays.toString(result10);

        System.out.println("==========================");
        System.out.println("Task 11: arrayInsertToSpecificPosition");
        int[] array12 = {1,2,3,4,5,6,7,8,9,10};
        int[] result11 = MyArrays.arrayInsertToSpecificPosition(array12, 5, 11);
        System.out.println("Array: ");
        MyArrays.toString(result11);

        System.out.println("==========================");
        System.out.println("Task 12: arrayDeleteInteger");
        int[] array13 = {1,2,3,4,5,6,7,8,9,10};
        int[] result12 = MyArrays.arrayDeleteInteger(array13, 5);
        System.out.println("Array: ");
        MyArrays.toString(result12);
       



    }
}
