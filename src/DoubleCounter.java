public class DoubleCounter implements CounterInterface{
    private int Count1, Count2;
    public DoubleCounter() {
        Count1 = 0;
        Count2 = 0;
    }
    @Override
    public void increment() {
        Count1 ++;
        Count2 ++;
    }

    @Override
    public void decrement() {
        Count1 --;
        Count2 --;
    }

    @Override
    public int getCount() {
        return Count1;
    }

    public int getCount2(){
        return Count2;
    }

    @Override
    public void reset() {
        Count1 = 0;
        Count2 = 0;
    }
}
