package testEnum;

import testString.StringDemo;

public enum Color {
    RED("red"),GREEN("greeb"),YELLOW("yellow");
    private String title;
    private Color(String title){
        this.title = title;
    }
    public String toStrint(){
        return this.title;
    }
}
