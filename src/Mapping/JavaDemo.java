package Mapping;

public class JavaDemo {
    public static void main(String[] args) {
        Dept dept = new Dept(10,"财务部","上海");
        Emp emp1 = new Emp(324,"he","clerk",2000,0.0);
        Emp emp2 = new Emp(325,"shi","coder",3000,0.0);
        Emp emp3 = new Emp(100,"bo","boss",8000,0.0);
        emp1.setDept(dept);
        emp2.setDept(dept);
        emp3.setDept(dept);
        emp1.setMgr(emp3);
        emp2.setMgr(emp3);
        dept.setEmps(new Emp[]{emp1,emp2,emp3});
        System.out.println(dept.getInfo());
        for (Emp i :dept.getEmps()){
            System.out.println(i.getInfo());
            System.out.println("该员工老板信息：");
            if (i.getMgr()!=null)
                System.out.println(i.getMgr().getInfo());
            System.out.println("===================================================");
        }



    }
}
