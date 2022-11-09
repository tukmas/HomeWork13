public class Main {
    public static void main(String[] args) {
        Author Pushkin = new Author("Alexander", "Pushkin");
        Book Poltava = new Book("Poltava", Pushkin, 1829);
        System.out.println("Книга " + Poltava.getTitle() + " автор: " + Pushkin.getAuthorName() + " год публикации: " + Poltava.getPublicationYear());
        Author Lermontov = new Author("Mikhail", "Lermontov");
        Book Borodino = new Book("Borodino", Lermontov, 1648);
        Borodino.setPublicationYear(1837);
        System.out.println("Книга " + Borodino.getTitle() + " автор: " + Lermontov.getAuthorName() + " год публикации: " + Borodino.getPublicationYear());
        System.out.println(Poltava);
        System.out.println(Borodino);
    }
}