package Abstract;

abstract class Message {
    private String type;
    public  abstract String getConnectInfo();
    public void setType(String type){
        this.type = type;
    }
    public  String getType(){
        return this.type;
    }


}
