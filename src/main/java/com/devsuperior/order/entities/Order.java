package com.devsuperior.order.entities;

public class Order {

    private Integer code;
    private Double basic;
    private Double discount;

    //Empty Constructor
    public Order() {
    }

    //Constructor
    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    //Getters
    public Integer getCode() {
        return code;
    }

    public Double getBasic() {
        return basic;
    }

    public Double getDiscount() {
        return discount;
    }

    //Setters
    public void setCode(Integer code) {
        this.code = code;
    }

    public void setBasic() {
        this.basic = basic;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
