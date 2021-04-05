package realestatecase;

import genericLists.Listable;

public class ListHouse implements Listable {
    private int lotNumber;
    private String firstName;
    private String lastName;
    private int price;
    private int squareFeet;
    private int bedRooms;

    public ListHouse(int lotNumber, String firstName, String lastName, int price, int squareFeet, int bedRooms) {
        this.lotNumber = lotNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.price = price;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }

    @Override
    public Listable copy() {
        ListHouse result = new ListHouse(lotNumber, firstName, lastName, price, squareFeet, bedRooms);
        return result;
    }

    @Override
    public int compareTo(Listable otherListHouse) {
        ListHouse other = (ListHouse) otherListHouse;
        return (this.lotNumber - other.lotNumber);
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
    }
}
