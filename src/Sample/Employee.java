package Sample;

public class Employee {
    private long id;
    private String name;
    private double salary;
    private double rate;
    public Employee(){};
    public Employee(long id,String name,double salary,double rate){
        this.id = id;
        this.name = name;
        this.salary =salary;
        this.rate = rate;
    }
    public double salaryIncvalue(){
        return this.salary*this.rate;
    }
    public double salaryIncResult(){
        return this.salary + this.salary*this.rate;

    }

    public String getInfo(){
        return "编号："+this.id+"  姓名:"+this.name+"  薪水:"+this.salary+"  增长率:"+this.rate;
    }
}
