package unsorted;

public abstract class StringList {
    // The number of items increases as items are added to the array
    protected int numItems;
    protected String[] list;
    protected int currentPos;
    protected int maxItems;

    public StringList(int maxItems) {
        numItems = 0;
        list = new String[maxItems];
    }

    public boolean isFull() {
        if (list != null && list.length == numItems)
            return true;
        return false;
    }

    public int lenghtIs() {
        return numItems;
    }

    public abstract boolean isThere(String item);

    public abstract void insert(String item);

    public abstract void delete(String item);

    public void reset() {
        currentPos = 0;
    }

    public String getNextItem() {
        String next = list[currentPos];

        if (currentPos == numItems - 1)
            currentPos = 0;
        else
            currentPos++;

        return new String(next);
    }
}
