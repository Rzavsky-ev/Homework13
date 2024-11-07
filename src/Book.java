public class Book {
    public Book(Author author, String bookTitle, int yearPublication) {
        this.bookTitle = bookTitle;
        this.yearPublication = yearPublication;
        authorBook = author;
    }

    private Author authorBook;
    private String bookTitle;
    private int yearPublication;

    public Author getNameAuthor() {
        return authorBook;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int year) {
        yearPublication = year;
    }

    ////////////////////////////////////////Новое задание////////////////////////////////

    public String toString() {
        return authorBook.toString() + " Название книги:" + bookTitle + ". Год издания:" + yearPublication +
                ".";
    }

    public boolean equals(Object obj) {
        // Проверка на null
        if (obj == null) {
            return false;
        }
        // Проверка на тип
        if (!(obj instanceof Book)) {
            return false;
        }
        // Приведение к типу Book
        Book other = (Book) obj;
        // Сравнение полей
        if (!this.bookTitle.equals(other.bookTitle) || this.yearPublication != other.yearPublication) {
            return false;
        } else if (this.authorBook.equals(other.authorBook)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int result = 0;
        result = authorBook.hashCode() + bookTitle.hashCode() + yearPublication;
        return result;
    }
}
