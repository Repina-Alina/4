/**
 * Класс Division представляет подразделение в организации. Он содержит информацию об идентификаторе и названии подразделения.
 */
public class Division {
    int id;
    String name;

    /**
     *Конструктор для создания объекта Division.
     * @param id  уникальный идентификатор подразделения
     * @param name название подразделения
     */

    public Division(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Получает строку с информацией о подразделении.
     * @return строка, содержащая информацию о подразделении в формате: "Division ID: <id>, Name: <name>"
     */

    public String getInfo() {
        return "Division ID: " + id + ", Name: " + name;
    }
}

