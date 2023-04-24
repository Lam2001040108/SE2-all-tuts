package Person;

public class Child extends Person {

    public Child(String name, int age) {
        super(name, age);
        if (age <= 15) {
            throw new IllegalArgumentException("Age must be greater than 15");
        }
    }

    @Override
    protected void setAge(int age) {
        if (age <= 15) {
            throw new IllegalArgumentException("Age must be greater than 15");
        }
        super.setAge(age);
    }
}
