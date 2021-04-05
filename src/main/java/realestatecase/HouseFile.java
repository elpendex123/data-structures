package realestatecase;

import java.io.*;

public class HouseFile {
    private static BufferedReader inFile;
    private static PrintWriter outFile;
    private static boolean inFileOpen = false;
    private static boolean outFileOpen = false;
    private static String inString = "";

    public static void reset() throws IOException {
        if (inFileOpen) inFile.close();
        if (outFileOpen) outFile.close();
        inFile = new BufferedReader(new FileReader("src\\main\\resources\\houses.txt"));
        inFileOpen = true;
        inString = inFile.readLine();
    }

    public static void rewrite() throws IOException {
        if (inFileOpen) inFile.close();
        if (outFileOpen) outFile.close();
        outFile = new PrintWriter(new FileWriter("src\\main\\resources\\houses.txt"));
        outFileOpen = true;
    }

    public static boolean moreHouses()
    {
        if (!inFileOpen || (inString == null))
            return false;
        else
            return true;
    }

    public static ListHouse getNextHouse() throws IOException {
        int lotNumber = 0;
        String lastName = "xxxxx";
        String firstName = "xxxxx";
        int price = 0;
        int squareFeet = 0;
        int bedRooms = 0;

        lotNumber = Integer.parseInt(inFile.readLine());
        lastName = inString;
        firstName = inFile.readLine();
        price = Integer.parseInt(inFile.readLine());
        squareFeet = Integer.parseInt(inFile.readLine());
        bedRooms = Integer.parseInt(inFile.readLine());

        inString = inFile.readLine();

        ListHouse house = new ListHouse(lotNumber, firstName, lastName, price, squareFeet, bedRooms);
        return house;
    }

    public static void putToFile(ListHouse house)
    {
        outFile.println(house.getLotNumber());
        outFile.println(house.getFirstName());
        outFile.println(house.getLastName());
        outFile.println(house.getPrice());
        outFile.println(house.getSquareFeet());
        outFile.println(house.getBedRooms());
    }

    public static void close() throws IOException {
        if (inFileOpen) inFile.close();
        if (outFileOpen) outFile.close();
        inFileOpen = false;
        outFileOpen = false;
    }
}
