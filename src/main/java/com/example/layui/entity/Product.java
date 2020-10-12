package com.example.layui.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Product {

  @TableId(value = "id",type = IdType.AUTO)
  private long id;
  private String name;
  private String description;
  private double price;
  private long stock;
  private long categoryleveloneId;
  private long categoryleveltwoId;
  private long categorylevelthreeId;
  private String fileName;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }


  public long getCategoryleveloneId() {
    return categoryleveloneId;
  }

  public void setCategoryleveloneId(long categoryleveloneId) {
    this.categoryleveloneId = categoryleveloneId;
  }


  public long getCategoryleveltwoId() {
    return categoryleveltwoId;
  }

  public void setCategoryleveltwoId(long categoryleveltwoId) {
    this.categoryleveltwoId = categoryleveltwoId;
  }


  public long getCategorylevelthreeId() {

    return categorylevelthreeId;
  }

  public void setCategorylevelthreeId(long categorylevelthreeId) {

    this.categorylevelthreeId = categorylevelthreeId;
  }


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

}
