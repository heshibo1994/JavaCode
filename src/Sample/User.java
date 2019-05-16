package Sample;

public class User {
    private String uid;
    private String password;
    private  static int count  = 0;
    public User(){
        this("he","heshibo");
    }
    public User(String uid,String password){
        this.uid = uid;
        this.password = password;
        this.count +=1;
    }
    public static int getNum(){
        return User.count;
    }
    public String getInfo(){
        return "第"+this.count+"名用户 "+"名称："+this.uid+"  密码："+this.password;
    }
}
