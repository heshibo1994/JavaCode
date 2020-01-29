package testReference;

import java.time.chrono.MinguoEra;

public class JavaDemo {
    public static void main(String[] args) {
//        // 声明对象并设置彼此的关系
//        Person person = new Person("keran",24);
//        Person childA = new Person("a",20);
//        Person childB = new Person("b",21);
//        childA.setCar(new Car("cara",2));
//        childB.setCar(new Car("carb",3));
//        Car car = new Car("SUV",30);
//        person.setCar(car);
//        person.setChildren(new Person[]{childA,childB});
//        car.setPerson(person);
//        // 根据关系获取数据
//        System.out.println(person.getCar().toString());
//        System.out.println(car.getPerson().toString());
//        for(Person p : person.getChildren()){
//            System.out.println(p.toString());
//            System.out.println(p.getCar().toString());
//        }
        Member memberA = new Member("alibaba","mema");
        Member memberB = new Member("baidu","memb");
        Role roleA = new Role(1l,"系统配置");
        Role roleB = new Role(2l,"备份管理");
        Role roleC = new Role(3l,"人事管理");
        Privilege priA = new Privilege(1000l,"系统初始化");
        Privilege priB = new Privilege(1001l,"系统还原");
        Privilege priC = new Privilege(1002l,"系统环境修改");
        Privilege priD = new Privilege(2000l,"备份员工数据");
        Privilege priE = new Privilege(2001l,"备份部门数据");
        Privilege priF = new Privilege(2002l,"备份公文数据");
        Privilege priG = new Privilege(3000l,"增加员工");
        Privilege priH = new Privilege(3001l,"编辑员工");
        Privilege priI = new Privilege(3002l,"浏览员工");
        Privilege priJ = new Privilege(3003l,"员工离职");
        //增加角色和权限的对应关系
        roleA.setPrivileges(new Privilege[]{priA,priB,priC});
        roleB.setPrivileges(new Privilege[]{priD,priE,priF});
        roleC.setPrivileges(new Privilege[]{priG,priH,priI,priJ});
        //增加权限与角色对应
        priA.setRole(roleA);
        priB.setRole(roleA);
        priC.setRole(roleA);
        priD.setRole(roleB);
        priE.setRole(roleB);
        priF.setRole(roleB);
        priG.setRole(roleC);
        priH.setRole(roleC);
        priI.setRole(roleC);
        priJ.setRole(roleC);
        //增加用户与角色的对应关系
        memberA.setRoles(new Role[]{roleA,roleB});
        memberB.setRoles(new Role[]{roleA,roleB,roleC});
        roleA.setMembers(new Member[]{memberA,memberB});
        roleB.setMembers(new Member[]{memberA,memberB});
        roleC.setMembers(new Member[]{memberB});
        //输出信息
        System.out.println(memberB.toString());
        for (Role r : memberB.getRoles()){
            System.out.println(r.toString());
            for (Privilege p:r.getPrivileges()){
                System.out.println(p.toString());
            }
        }






    }
}
