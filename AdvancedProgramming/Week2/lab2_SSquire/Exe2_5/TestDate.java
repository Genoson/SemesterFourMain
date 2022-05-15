package AdvancedProgramming.Week2.lab2_SSquire.Exe2_5;

public class TestDate {

    public static void main(String[] args) {

        Date date1 = new Date(1, 4, 1987);
        Date date2 = new Date(12, 5, 1988);
        Date date3 = new Date(1, 11, 1987);

        System.out.println("\nDate 1: " );
        System.out.println(date1.toString());
        System.out.println("\nDate 2: " );
        System.out.println(date2.toString());
        System.out.println("\nDate 3: " );
        System.out.println(date3.toString());

        System.out.println("\n\nIntentionally triggering an error" );
        date1.setDate(40, 4, 1987);
        
    }
    
}
