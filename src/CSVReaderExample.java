import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс CSVReaderExample предназначен для чтения данных о людях из CSV файла.
 * Данные включают информацию о персональных данных, таких как имя, пол, дата рождения, подразделение и зарплата. Класс также обрабатывает создание объектов подразделений.
 */

public class CSVReaderExample {
    private static int divisionIdCounter = 1;

    /**
     * Читает данные о людях из указанного CSV файла.
     * @param csvFilePath путь к CSV файлу, который нужно прочитать
     * @param separator символ-разделитель, используемый в CSV файле
     * @return список объектов {@link Person}, представляющих данные из CSV файла или пустой список, если файл не содержит данных
     */

    public static List<Person> readPeopleFromCsv(String csvFilePath, char separator) {
        List<Person> people = new ArrayList<>();
        Map<String, Division> divisionMap = new HashMap<>();
        String currLine = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            br.readLine();
            int personIdCounter = 1;

            while ((currLine = br.readLine()) != null) {
                String[] nextLine = currLine.split(String.valueOf(separator));

                try {
                    int id = Integer.parseInt(nextLine[0]);
                    String name = nextLine[1];
                    String gender = nextLine[2];
                    LocalDate birthDate = LocalDate.parse(nextLine[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                    String divisionName = nextLine[4];
                    String salaryString = nextLine[5].replace(',', '.');
                    double salary = Double.parseDouble(salaryString);

                    Division division = divisionMap.get(divisionName);
                    if (division == null) {
                        division = new Division(divisionIdCounter++, divisionName);
                        divisionMap.put(divisionName, division);
                    }

                    Person person = new Person(personIdCounter++, name, gender, birthDate, division, salary);
                    people.add(person);
                } catch (NumberFormatException e) {
                    System.err.println("Ошибка преобразования числа в строке: " + currLine + ". Ошибка: " + e.getMessage());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("Ошибка формата строки в файле: " + currLine + ". Ошибка: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        }

        return people;
    }
}
