import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static CPSC319HashMap<String, Long>  readCSVFile(String filePath){
        ArrayList<Pair<String, Long>> items = new ArrayList<Pair<String, Long>>();
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(",");
                String country = tokens[0];
                Long count = Long.parseLong(tokens[1]);
                Pair<String, Long> pair = new Pair(country, count);
                items.add(pair);
            }
            scanner.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        CPSC319HashMap<String, Long> population = new CPSC319HashMap<>(16, 0.75F);
        for(Pair<String, Long> p: items){
            population.put(p.getKey(), p.getValue());
        }
        return population;
    }

    public static Pair<String, Long> findMin(CPSC319HashMap<String, Long> map){
        //TODO: Implement this method
        return null;
    }

    public static void main(String[] args) throws Exception {
        String filePath = "population.csv";
        //TODO: Implement this method
    }



}