package genericLists;

public class ListString implements Listable {
    private String key;

    public ListString(String inString) {
        key = new String(inString);
    }

    @Override
    public Listable copy() {
        ListString result = new ListString(this.key);
        return result;
    }

    @Override
    public int compareTo(Listable otherListString) {
        ListString other = (ListString) otherListString;
        return this.key.compareTo(other.key);
    }

    public String toString() {
        return key;
    }
}
