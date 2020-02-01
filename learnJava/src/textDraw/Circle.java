package textDraw;

public class Circle implements IGraphical{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void paint() {
        System.out.println("画圆");
    }
}
