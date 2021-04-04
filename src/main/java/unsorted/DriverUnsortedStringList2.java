package unsorted;

public class DriverUnsortedStringList2 {

    public static void main(String[] args) {
        System.out.println("Test 1");
        UnsortedStringList2 unsortedStringList2 = new UnsortedStringList2();
        System.out.println(unsortedStringList2.lenghtIs());
        System.out.println(unsortedStringList2.isFull());
        System.out.println(unsortedStringList2.isThere("Tom"));
        for(int i = 0; i < unsortedStringList2.numItems; i++)
            System.out.println(unsortedStringList2.getNextItem());

        System.out.println("Test 2");
        UnsortedStringList2 unsortedStringList2b = new UnsortedStringList2(5);
        unsortedStringList2b.insert("Tom");
        System.out.println(unsortedStringList2b.lenghtIs());
        System.out.println(unsortedStringList2b.isFull());
        System.out.println(unsortedStringList2b.isThere("Tom"));
        for(int i = 0; i < unsortedStringList2b.numItems; i++)
            System.out.println(unsortedStringList2b.getNextItem());

        System.out.println("Test 3");
        unsortedStringList2b.insert("Julie");
        unsortedStringList2b.insert("Nora");
        unsortedStringList2b.insert("Maeve");
        System.out.println(unsortedStringList2b.lenghtIs());
        System.out.println(unsortedStringList2b.isFull());
        System.out.println(unsortedStringList2b.isThere("Tom"));
        System.out.println(unsortedStringList2b.isThere("Julie"));
        System.out.println(unsortedStringList2b.isThere("Nora"));
        System.out.println(unsortedStringList2b.isThere("Kevin"));
        for(int i = 0; i < unsortedStringList2b.numItems; i++)
            System.out.print(unsortedStringList2b.getNextItem() + " ");
    }
}
