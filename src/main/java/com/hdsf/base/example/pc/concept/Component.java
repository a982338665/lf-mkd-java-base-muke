package com.hdsf.base.example.pc.concept;

/**
 * 抽象类组件
 */
public abstract class Component {

    private  double price;//单位元
    private String name;

    public Component(String name ,double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String description(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name:{")
                .append(name)
                .append("};price:{")
                .append(price)
                .append("};");
        return stringBuilder.toString();
    }



}
