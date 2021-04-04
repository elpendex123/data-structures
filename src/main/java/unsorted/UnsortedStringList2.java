package unsorted;

public class UnsortedStringList2 extends StringList {
    public UnsortedStringList2(int maxItems) {
        super(maxItems);
    }

    public UnsortedStringList2() {
        super(100);
    }

    @Override
    public boolean isThere(String item) {
        boolean moreToSearch;
        int location = 0;
        boolean found = false;

        moreToSearch = (location < numItems);

        while (moreToSearch && !found) {
            if (item.compareTo(list[location]) == 0)
                found = true;
            else {
                location++;
                moreToSearch = (location < numItems);
            }
        }

        return found;
    }

    @Override
    public void insert(String item) {
        list[numItems] = new String(item);
        numItems++;
    }

    @Override
    public void delete(String item) {
        int location = 0;

        while (item.compareTo(list[location]) != 0)
            location++;

        list[location] = list[numItems - 1];
        numItems--;
    }
}
