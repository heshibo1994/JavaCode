package Sample;

public class JavaDemo {
    public static void main(String[]args){
        Address ad = new Address("中国","上海","上海","嘉定","10010");
        System.out.println(ad.getInfo());

        Employee em = new Employee(20,"heshibo",1000,0.3);
        System.out.println(em.getInfo());
        System.out.println("增长额度:"+em.salaryIncvalue());
        System.out.println("最终工资:"+em.salaryIncResult());

        User u1 = new User("小包","xiaobao");
        System.out.println(u1.getInfo());
        User u2 = new User("大包","xiaobao");
        System.out.println(u2.getInfo());
    }

}
