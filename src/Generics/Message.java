package Generics;

class Message <T>{
    private T content;
    public void setContent(T content){
        this.content = content;
    }
    public T getContent(){
        return this.content;
    }
}
