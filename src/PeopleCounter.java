public class PeopleCounter extends Person implements CounterInterface{
    public PeopleCounter(String name, int age) {
        super(name, age);
    }

    @Override
    public void increment() {
        setAge(getAge() + 1);
    }

    @Override
    public void decrement() {
        setAge(getAge() - 1);
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public void reset() {
        setAge(0);
    }

    public static void main(String[] args) {

    }
}
