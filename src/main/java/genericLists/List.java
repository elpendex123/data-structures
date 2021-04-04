package genericLists;

public abstract class List {
    protected int numItems;
    protected Listable[] list;
    protected int currentPos;

    public List(int maxItems) {
        numItems = 0;
        list = new Listable[maxItems];
    }

    public boolean isFull() {
        if (list != null && list.length == numItems)
            return true;
        return false;
    }

    public int lenghtIs() {
        return numItems;
    }

    public abstract boolean isThere(Listable item);

    public abstract Listable retrieve(Listable item);

    public abstract void insert(Listable item);

    public abstract void delete(Listable item);

    public void reset() {
        currentPos = 0;
    }

    public Listable getNextItem() {
        Listable next = list[currentPos];

        if (currentPos == numItems - 1)
            currentPos = 0;
        else
            currentPos++;

        return next.copy();
    }
}
