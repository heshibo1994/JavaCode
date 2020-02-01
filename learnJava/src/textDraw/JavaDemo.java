package textDraw;

public class JavaDemo {
    public static void main(String[] args) {
        IGraphical iga = Factory.getInstance("triangle");
        iga.paint();
    }
}
