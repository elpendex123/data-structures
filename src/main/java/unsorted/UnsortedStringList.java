package unsorted;

public class UnsortedStringList {
    // The number of items increases as items are added to the array
    protected int numItems;
    protected String[] list;
    protected int currentPos;
    protected int maxItems;

    public void UnsortedStringList(int maxItems) {
        numItems = 0;
        list = new String[maxItems];
    }

    public void UnsortedStringList() {
        numItems = 0;
        list = new String[100];
    }

    public boolean isFull() {
        return (list.length == numItems);
    }

    public int lenghtIs() {
        return numItems;
    }

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

    public void insert(String item) {
        list[numItems] = new String((item));
        numItems++;
    }

    public void delete(String item) {
        int location = 0;

        while (item.compareTo(list[location]) != 0)
            location++;

        list[location] = list[numItems - 1];
        numItems--;
    }

    public void reset() {
        currentPos = 0;
    }

    public String getNextItem() {
        String next = list[currentPos];

        if(currentPos == numItems - 1)
            currentPos = 0;
        else
            currentPos++;

        return new String(next);
    }
}
