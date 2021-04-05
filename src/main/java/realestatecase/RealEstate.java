package realestatecase;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class RealEstate {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src\\main\\resources\\houses.txt"));

        System.out.println("lines: " + lines.size());

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
