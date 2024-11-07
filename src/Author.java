public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    ////////////////////////Новое задание////////////////////////////////////////

    public String toString() {
        return "Фамилия автора:" + surname + ". Имя автора:" + name + ".";
    }

    public boolean equals(Object obj) {
        // Проверка на null
        if (obj == null) {
            return false;
        }
        // Проверка на тип
        if (!(obj instanceof Author)) {
            return false;
        }
        // Приведение к типу Author
        Author other = (Author) obj;
        // Сравнение полей
        if (!this.name.equals(other.name) || !this.surname.equals(other.surname)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int result = 0;
        result = name.hashCode() + surname.hashCode();
        return result;
    }
}
