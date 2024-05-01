public class Division {

    private int id;
    private String name;

    // Конструктор класса
    public Division(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Пустой конструктор класса
    public Division() {}

    // Геттер для поля id
    public int getId() {
        return id;
    }

    // Сеттер для поля id
    public void setId(int id) {
        this.id = id;
    }

    // Геттер для поля name
    public String getName() {
        return name;
    }

    // Сеттер для поля name
    public void setName(String name) {
        this.name = name;
    }

    // Переопределение метода toString для удобного вывода информации о Division
    public String toString() {
        return "Division{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
