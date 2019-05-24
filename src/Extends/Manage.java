package Extends;

class Manage extends Employee{
    private String job;
    private double income;
    public Manage(){}

    public Manage(String name, int age, String sex, String job, double income) {
        super(name, age, sex);
        this.job = job;
        this.income = income;
    }
    public String getInfo(){
        return super.getInfo()+"，job=" + job  + ", income=" + income;
    }
}
