package testStatic;

public class Book {
    private String name;
    private static int count = 0;
    public Book(){
        this("No_name");
    }
    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
