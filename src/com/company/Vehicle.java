package com.company;
import java.util.Date;
import java.util.Scanner;

public abstract class Vehicle {
    private String vin;
    private String name;
    private Date built;
    private Wheeldrive wheeldrive;
    private NumDoors numDoors;
    private double price;

    protected String maker, model, color;
    private int year;


    public String getVin() { return vin; }

    public void setVin(String _Vin) { this.vin = _Vin; }

    public void setName(String _name) {
        this.name = _name;
    }

    public String getName() {
        return name;
    }

    public Date getBuiltDate() { return built;}

    public void setBuiltDate(Date _built){
        built=_built;
    }

    public Wheeldrive getWheeldrive() { return wheeldrive;}

    public void setWheeldrive(Wheeldrive _wheeldrive){ wheeldrive =_wheeldrive;}

    public NumDoors getNumDoors() { return numDoors;}

    public void setNumDoors(NumDoors _numDoors){ numDoors =_numDoors;}

    public String getModel() {
        return model;
    }

    public void setModel(String _Model) {
        this.model = _Model;
    }

    public String getMaker() { return maker; }

    public void setMaker(String _Maker) {
        this.maker = _Maker;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String _Color) {
        this.color = _Color;
    }

    public int getYear() { return year; }

    public void setYear(int _carYear) {
        this.year = _carYear;
    }

    public double getPrice() { return price; }

    public void setPrice(double _price) { this.price = _price; }


    public NumDoors setDoors() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of doors ('two' / 'four'): ");
        numDoors = NumDoors.valueOf(input.next().toLowerCase());
        // add if statement for cash payment to calculate change
        return numDoors;
    }



//public abstract void addCarToInventory(Car car1);
}
