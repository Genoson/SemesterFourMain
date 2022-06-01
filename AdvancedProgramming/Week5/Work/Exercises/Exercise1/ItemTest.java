public class ItemTest {

    public static void main (String[] args) {

        CountedItem ci = new CountedItem("apple", 0.5, 10);
        System.out.println(ci);
        System.out.println(ci.getPrice());
        ci.setCount(20);
        System.out.println(ci);

        WeightedItem wi = new WeightedItem("banana", 0.5, 1.0);
        System.out.println(wi);
        System.out.println(wi.getPrice());
        wi.setWeight(2.0);
        System.out.println(wi);

        

    }
    
}
