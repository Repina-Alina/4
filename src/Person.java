import java.time.LocalDate;

/**
 * Класс Person представляет личные данные человека. Он содержит информацию об идентификаторе, имени, поле, дате рождения, подразделении и зарплате.
 */

public class Person {
    int id;
    String name;
    String gender;
    LocalDate birthDate;
    Division division;
    double salary;

    /**
     * Конструктор для создания объекта Person.
     * @param id  уникальный идентификатор человека
     * @param name имя человека
     * @param gender пол человека
     * @param birthDate дата рождения человека
     * @param division подразделение, к которому принадлежит человек
     * @param salary зарплата человека
     */

    public Person(int id, String name, String gender,LocalDate birthDate, Division division, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.division = division;
        this.salary = salary;
    }

    /**
     * Получает строку с информацией о человеке.
     * @return строка, содержащая информацию о человеке в формате: "Id: <id>, Name: <name>, Gender: <gender>, Birth Date: <birthDate>, Division ID: <division.id>, Division Name: <division.name>, Salary: <salary>"
     */

    public String getInfo() {
        return "Id:" + id + ", Name: " + name + ", Gender: " + gender +
                ", Birth Date: " + birthDate +
                ", Division ID: " + division.id +
                ", Division Name: " + division.name +
                ", Salary: " + salary;
    }
}