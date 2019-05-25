package Mapping;

public class Dept {
    private long deptno;
    private String name;
    private String loc;
    private Emp [] emps;
    public Dept(long deptno,String name,String loc){
        this.deptno =deptno;
        this.name = name;
        this.loc = loc;
    }

    public void setEmps(Emp[] emps) {
        this.emps = emps;
    }

    public Emp[] getEmps() {
        return emps;
    }


    public String getInfo(){
        return "部门编号"+this.deptno+"  部门名称: "+this.name+"  部门位置: "+this.loc;
    }


}
