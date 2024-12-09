import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "C:\\Users\\Alina\\Desktop\\вгу\\java\\foreign_names.csv";
        char separator = ';';
        List<Person> people = CSVReaderExample.readPeopleFromCsv(csvFilePath, separator);
        for (Person person : people) {
            System.out.println(person.getInfo());
        }
    }
}
