public class Main {
    static AdvancedCounter advancedCounter = new AdvancedCounter();
    static DoubleCounter doubleCounter = new DoubleCounter();

    static AVLTree simpleTree = new AVLTree();
    public static void main(String[] args) {
        doubleCounter.increment();
        advancedCounter.increment();
        System.out.println(doubleCounter.getCount2());
        System.out.println(advancedCounter.getCount());
    }
}