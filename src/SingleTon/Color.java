package SingleTon;

public class Color {
    private static final Color RED = new Color("红色");
    private static final Color Green = new Color("绿色");
    private static final Color BLUE = new Color("蓝色");
    private String title;
    private Color(String title) {
        this.title = title;
    }
    public static Color getInstance(String color){
        switch(color){
            case "red":return RED;
            case "green":return Green;
            case "blue":return BLUE;
        }
        return null;
    }
    public String toString(){
        return this.title;
    }
}
