package textSingleton;

public class Color {
    public static final Color RED =new Color("RED");
    public static final Color YELLOW =new Color("YELLOW");
    public static final Color BLUE =new Color("BLUE");
    private String title;
    private Color(String title){
        this.title = title;
    }
    public static Color getInstance(String color){
        switch(color){
            case "red" :return RED;
            case "yellow" :return YELLOW;
            case "blue" :return BLUE;
        }
        return null;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
