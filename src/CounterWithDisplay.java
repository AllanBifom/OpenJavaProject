public class CounterWithDisplay extends Counter{
    @Override
    public void increment() {
        super.increment();
        System.out.println("new count is " + getCount());
    }

    @Override
    public void decrement() {
        super.decrement();
        System.out.println("new count is " + getCount());
    }
}
