public class Dept {
    private long deptno;
    private String deptname;
    private String loc;
    public Dept(){};
    public Dept(long deptno,String name,String loc){
        this.deptname = deptname;
        this.deptno = deptno;
        this.loc = loc;
    }
    public String getInfo(){
        return "部门信息："+"部门编号: "+this.deptno+"部门名称: "+this.deptname+"部门位置: "+this.loc;
    }
    public void setDeptno(long deptno){
        this.deptno = deptno;
    }
    public void setDeptname(String deptname){
        this.deptname = deptname;
    }
    public void setLoc(String loc){
        this.loc = loc;
    }
    public long getDeptno(){
        return this.deptno;
    }
    public String getDeptname(){
        return this.deptname;
    }
    public String getLoc(){
        return this.loc;
    }

}
