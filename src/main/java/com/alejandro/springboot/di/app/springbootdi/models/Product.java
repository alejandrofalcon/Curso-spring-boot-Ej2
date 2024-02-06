package com.alejandro.springboot.di.app.springbootdi.models;

public class Product implements Cloneable {
 private Long id;
 private String name;
 private Long price;


public Product() {
}

public Product(Long id, String name, Long price) {
    this.id = id;
    this.name = name;
    this.price = price;
}

public void setId(Long id) {
    this.id = id;
}
public Long getId() {
    return id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public Long getPrice() {
    return price;
}
public void setPrice(Long price) {
    this.price = price;
}

@Override
public Object clone() {
    // TODO Auto-generated method stub
    try {
        return super.clone();
    } catch (CloneNotSupportedException e) {
        return new Product(this.getId(), this.getName(), getPrice());
    }
}


}
