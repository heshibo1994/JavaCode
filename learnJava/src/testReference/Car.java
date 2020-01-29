package testReference;

public class Car {
    private String name;
    private int price;
    private Person person;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", person=" + person +
                '}';
    }
}
