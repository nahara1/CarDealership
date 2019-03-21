package com.company;
import java.util.Date;

public abstract class Vehicle implements Iterable<Vehicle> {
    private String vin;
    private String name;
    private Date built;
    private Wheeldrive wheeldrive;
    private NumDoors numDoors;


    /*
    public static int Quantity=0;





    Vehicle() {
        Quantity++;
    }
    */



    public String getVin() {

        return vin;
    }
    public void setVin(String _Vin) {

        this.vin = _Vin;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public String getName() {
        return name;
    }
    public Date getBuiltDate() {
        return built;}

    public void setBuiltDate(Date _built){
        built=_built;
    }

    public Wheeldrive getWheeldrive() {
        return wheeldrive;}

    public void setWheeldrive(Wheeldrive _wheeldrive){
        wheeldrive =_wheeldrive;}

    public NumDoors getNumDoors() {
        return numDoors;}

    public void setNumDoors(NumDoors _numDoors){
        numDoors =_numDoors;}


    public abstract void addCarToInventory(Car car1);
}
