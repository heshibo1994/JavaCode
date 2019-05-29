package Enum;

enum Color{
    red("红色"),green("绿色"),blue("蓝色");
    private String title;
    private Color(String title){
        this.title  = title;
    }
}
public class JavaDemo {
    public static void main(String[] args) {
        for (Color c:Color.values()){
            System.out.println(c.ordinal()+c.toString());
        }
    }
}
