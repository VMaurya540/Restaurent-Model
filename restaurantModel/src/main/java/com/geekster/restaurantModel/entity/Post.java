package com.geekster.restaurantModel.entity;

public class Post {

    int id ;
    String restoName;
    String restoMenu;
    String address;
    long moNumber;
    int  toatalStaff;
    int price;

    public Post(int id, String restoName, String restoMenu, String address, long moNumber, int toatalStaff, int price) {
        this.id = id;
        this.restoName = restoName;
        this.restoMenu = restoMenu;
        this.address = address;
        this.moNumber = moNumber;
        this.toatalStaff = toatalStaff;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id, Post posts) {
        this.id = id;
    }

    public String getRestoName() {
        return restoName;
    }

    public void setRestoName(String restoName) {
        this.restoName = restoName;
    }

    public String getRestoMenu() {
        return restoMenu;
    }

    public void setRestoMenu(String restoMenu) {
        this.restoMenu = restoMenu;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMoNumber() {
        return moNumber;
    }

    public void setMoNumber(long moNumber) {
        this.moNumber = moNumber;
    }

    public int getToatalStaff() {
        return toatalStaff;
    }

    public void setToatalStaff(int toatalStaff) {
        this.toatalStaff = toatalStaff;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", restoName='" + restoName + '\'' +
                ", restoMenu='" + restoMenu + '\'' +
                ", address='" + address + '\'' +
                ", moNumber=" + moNumber +
                ", toatalStaff=" + toatalStaff +
                ", price=" + price +
                '}';
    }
}
