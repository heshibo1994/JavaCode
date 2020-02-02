package testEnum;

public class JavaDemo {
    public static void main(String[] args) {
        Color c = Color.RED;
        System.out.println(c);

        for (Color color: Color.values()){
            //System.out.println(color);
            System.out.println(color.name()+","+color.ordinal()+" "+color.toStrint());
        }


    }
}
