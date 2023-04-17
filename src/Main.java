public class Main {
    static AdvancedCounter advancedCounter = new AdvancedCounter();
    static DoubleCounter doubleCounter = new DoubleCounter();
    static Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180);
    static Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 281);
    static Library library = new Library();

    static AVLTree simpleTree = new AVLTree();

    static Game game = new Game();
    public static void main(String[] args) {
        doubleCounter.increment();
        advancedCounter.increment();
        System.out.println(doubleCounter.getCount2());
        System.out.println(advancedCounter.getCount());
        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();
        game.start();
    }
}