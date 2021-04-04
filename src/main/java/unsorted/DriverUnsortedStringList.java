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
        UnsortedStringList unsortedStringList1b = new UnsortedStringList(5);
        unsortedStringList1b.insert("Tom");
        System.out.println(unsortedStringList1b.lenghtIs());
        System.out.println(unsortedStringList1b.isFull());
        System.out.println(unsortedStringList1b.isThere("Tom"));
        for(int i = 0; i < unsortedStringList1b.numItems; i++)
            System.out.println(unsortedStringList1b.getNextItem());

        System.out.println("Test 3");
        unsortedStringList1b.insert("Julie");
        unsortedStringList1b.insert("Nora");
        unsortedStringList1b.insert("Maeve");
        System.out.println(unsortedStringList1b.lenghtIs());
        System.out.println(unsortedStringList1b.isFull());
        System.out.println(unsortedStringList1b.isThere("Tom"));
        System.out.println(unsortedStringList1b.isThere("Julie"));
        System.out.println(unsortedStringList1b.isThere("Nora"));
        System.out.println(unsortedStringList1b.isThere("Kevin"));
        for(int i = 0; i < unsortedStringList1b.numItems; i++)
            System.out.print(unsortedStringList1b.getNextItem() + " ");

    }
}
