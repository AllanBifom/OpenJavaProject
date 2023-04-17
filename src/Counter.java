public class Counter implements CounterInterface{
    public int count;
    public Counter() {
        count = 0;
    }
    @Override
    public void increment() {
        count++;
    }

    @Override
    public void decrement() {
        count--;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void reset() {
        count = 0;
    }
}
