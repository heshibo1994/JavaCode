package textDraw;

public class Factory {
    public static IGraphical getInstance(String className){
        if("triangle".equals(className)){
            return new Triangle(new Point(1,0),new Point(2,3),new Point(3,4));
        }else if ("circle".equals(className)){
            return new Circle(2);
        }else{
            return null;
        }

    }
}
