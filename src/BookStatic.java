public class BookStatic {
    private String name;
    private static int id = 0;
    public BookStatic(String name){
        this.name =name;
        id = id+1;
        System.out.println("第"+id+"本书");
    }

}
