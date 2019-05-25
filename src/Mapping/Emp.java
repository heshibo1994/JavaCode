package Mapping;

public class Emp {
    private long empno;
    private String ename;
    private String job;
    private double sal;
    private double comm;
    private Dept dept;//部门
    private Emp mgr;//领导


    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setMgr(Emp mgr) {
        this.mgr = mgr;
    }

    public Dept getDept() {
        return dept;
    }

    public Emp getMgr() {
        return mgr;
    }

    public Emp(long empno, String ename, String job, double sal, double comm) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
    }


    public String getInfo() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                ", comm=" + comm +
                '}';
    }
}
