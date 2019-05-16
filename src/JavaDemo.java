public class JavaDemo{
    public static void main(String[]args){
        Person p = new Person("he",21);
        p.tell();
        //p.setName("he");
        p.setAge(19);
        p.tell();
        PersonThis pt = new PersonThis("he",21);

        Emp emp = new Emp(9,"何士波","新零售",2000.0);
        System.out.println(emp.getInfo());

        PersonStatic ps1 = new PersonStatic("heshibo",19);
        PersonStatic ps2 = new PersonStatic("boshihe",20);
        ps1.getInfo();
        ps2.getInfo();
        PersonStatic.country = "中国";
        ps1.getInfo();
        ps2.getInfo();

        BookStatic bs1 = new BookStatic("java");
        BookStatic bs2 = new BookStatic("Pyrhon");

    }
}