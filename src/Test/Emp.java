package Test;

public class Emp {
    private  long empo;     //工号
    private  String name;   //姓名
    private  String dept;   //部门
    private  double salary; //工资
    public Emp(){
        this(1000,"无名氏",null,0.0);
    }

    public Emp(long empo){
        this(empo,"新员工","未定",0.0);
    }

    public Emp(long empo,String name,String dept){
        this(empo,name,dept,2500);
    }

    public Emp(long empo,String name,String dept,double salary){
        this.empo = empo;
        this.name = name ;
        this.dept = dept;
        this.salary = salary;
    }

    public String getInfo(){
        return "工号："+empo+" 姓名："+name+" 部门: "+dept+" 工资："+salary;
    }

}
