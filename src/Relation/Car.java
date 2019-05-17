package Relation;

public class Car {
    private String name;
    private double price;
    private Person per;
    public Car(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void setName(String n){ this.name = n; }
    public void setPrice(double p){ this.price = p; }
    public void setPer(Person per){this.per = per;}
    public Person getPer(){
        return this.per;
    }
    public String getInfo() {
        return "名称:" + this.name + " 价格：" + this.price;
    }
}