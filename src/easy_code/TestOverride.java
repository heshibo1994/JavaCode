package easy_code;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class TestOverride {

}

class Father{
    protected Number dosomething(int a ,Integer b,Obiect c) throws SQLException{
        System.out.println("father doingsomething");
        return new Integer(7);
    }
}
class Son extends Father{
    /**
     权限没有缩小   protected到public
     返回值是父类的子类，Number到Integer
     抛出异常也是父类的子类SQLException到SQLClientInfoException
     参数类型和个数保持一致
     必须加注解Override
     */
    @Override
    protected Integer dosomething(int a ,Integer b,Obiect c) throws SQLClientInfoException {
        if (a==0){
            throw new SQLClientInfoException();
        }
        return new Integer(17);
    }
}