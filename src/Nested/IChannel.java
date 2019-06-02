package Nested;

interface IChannel {//定义接口
    public void send(IMessage msg);
    interface IMessage{//内部接口
        public String getConnect();
    }





}
