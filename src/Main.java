public class Main {
    public static void main(String[] args) {

        Author tolstoy = new Author("Лев", "Толстой");
        Author sholohov = new Author("Михаил", "Шолохов");

        Book voinaMir = new Book(tolstoy, "Война и мир", 1865);
        Book tihiyDon = new Book(sholohov, "Тихий дон", 1928);

        System.out.println(voinaMir.toString());
        System.out.println(tihiyDon.toString());
        System.out.println(voinaMir.equals(tihiyDon));
        System.out.println(voinaMir.hashCode() + "  " + tihiyDon.hashCode());
    }
}