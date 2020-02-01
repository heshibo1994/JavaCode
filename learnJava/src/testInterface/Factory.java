package testInterface;

public class Factory {
    public static IFood getInstace(String classNmae){
        if ("bread".equals(classNmae)){
            return new Break();
        }else{
            return null;
        }
    }
}
