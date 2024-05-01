import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("foreign_names.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<People> peoples = new ArrayList<>();
        HashMap<String, Division> divisions = new HashMap<String, Division>();
        int idDivision = 1;

        while ((line = reader.readLine()) != null) {
            People people = new People();
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    people.setId(Integer.parseInt(data));
                else if (index == 1)
                    people.setName(data);
                else if (index == 2)
                    people.setGender(data);
                else if (index == 3)
                    people.setBirthDate(data);
                else if (index == 4){
                    if (!divisions.containsKey(data)) {
                        divisions.put(data, new Division(idDivision, data));
                        idDivision++;
                    }
                    people.setDivision(divisions.get(data));
                }
                else if (index == 5)
                {
                    people.setSalary(Integer.parseInt(data));
                }

                index++;
            }
            index = 0;
            peoples.add(people);
        }

        //закрываем наш ридер
        reader.close();

        System.out.println(peoples);
    }
}