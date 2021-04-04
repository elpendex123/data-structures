package unsorted;

public class DriverUnsortedStringList {

    public static void main(String[] args) {
        System.out.println("Test 1");
        UnsortedStringList unsortedStringList = new UnsortedStringList();
        System.out.println(unsortedStringList.lenghtIs());
        System.out.println(unsortedStringList.isFull());
        System.out.println(unsortedStringList.isThere("Tom"));
        for(int i = 0; i < unsortedStringList.numItems; i++)
            System.out.println(unsortedStringList.getNextItem());

        System.out.println("Test 2");
        UnsortedStringList unsortedStringList2 = new UnsortedStringList(5);
        unsortedStringList2.insert("Tom");
        System.out.println(unsortedStringList2.lenghtIs());
        System.out.println(unsortedStringList2.isFull());
        System.out.println(unsortedStringList2.isThere("Tom"));
        for(int i = 0; i < unsortedStringList2.numItems; i++)
            System.out.println(unsortedStringList2.getNextItem());

        System.out.println("Test 3");
        unsortedStringList2.insert("Julie");
        unsortedStringList2.insert("Nora");
        unsortedStringList2.insert("Maeve");
        System.out.println(unsortedStringList2.lenghtIs());
        System.out.println(unsortedStringList2.isFull());
        System.out.println(unsortedStringList2.isThere("Tom"));
        System.out.println(unsortedStringList2.isThere("Julie"));
        System.out.println(unsortedStringList2.isThere("Nora"));
        System.out.println(unsortedStringList2.isThere("Kevin"));
        for(int i = 0; i < unsortedStringList2.numItems; i++)
            System.out.print(unsortedStringList2.getNextItem() + " ");

    }
}
