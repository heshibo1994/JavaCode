package Interface;

public class Factory {
    public static Ifood getInstance(String className){
        if ("bread".equals(className)){
            return new Bread();
        }else if ("milk".equals(className)){
            return new Milk();
        }else{
            return null;
        }
    }
}
