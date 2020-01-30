package testAbstract;

public class DatabaseMessage extends Message {
    @Override
    public String getConnectInfo() {
        return "数据库数据信息";
    }
}
