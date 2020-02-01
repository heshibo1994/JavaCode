package textDraw;

public class Triangle implements IGraphical {
    private Point x;
    private Point y;
    private Point z;
    public Triangle(Point x,Point y,Point z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void paint() {
        System.out.println("画三条边");
    }
}
