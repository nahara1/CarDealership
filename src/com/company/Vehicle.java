package com.company;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <h1>Vehicle</h1>
 *<p>
 * The Car class is a child class of the Vehicle class.
 * It contains methods that add, remove, and search for cars
 * in the dealership inventory.
 *</p>
 *
 */

public abstract class Vehicle {
    /**
     * Vehicle Identification Number
     */
    private String vin;

    /**
     * Vehicle name
     */
    private String name;

    /**
     * date
     */
    private Date built;

    /**
     * wheeldrive
     */
    private Wheeldrive wheeldrive;

    /**
     * Vehicle number of doors
     */
    protected NumDoors numDoors;

    /**
     * Vehicle price
     */
    protected double price;

    /**
     * Dealership unique identification number
     */
    protected int dealershipID;

    /**
     * Vehicle maker, model, and color
     */

    protected String maker, model, color;

    /**
     * year
     */
    protected int year;


    /**
     * Vehicle price getter
     * @return price
     */

    public double getPrice() { return price; }

    /**
     * Vehicle price setter
     * @param _price Price
     */

    public void setPrice(double _price) { this.price = _price; }

    /**
     * VIN getter
     * @return VIN
     */

    public String getVin() { return vin; }

    /**
     * VIN setter
     * @param _Vin VIN
     */

    public void setVin(String _Vin) { this.vin = _Vin; }


    /**
     * Vehicle name setter
     * @param _name name
     */
    public void setName(String _name) {
        this.name = _name;
    }

    /**
     * Vehicle name getter
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     * Vehicle build date getter
     * @return built date
     */
    public Date getBuiltDate() { return built; }

    /**
     * Vehicle built date setter
     * @param _built built date
     */

    public void setBuiltDate(Date _built){
        built=_built;
    }


    /**
     * Wheeldrive getter
     * @return wheeldrive
     */
    public Wheeldrive getWheeldrive() { return wheeldrive; }

    /**
     * Wheeldrive setter
     * @param _wheeldrive wheeldrive
     */

    public void setWheeldrive(Wheeldrive _wheeldrive){ wheeldrive =_wheeldrive;}

    /**
     * Number of doors getter
     * @return
     */
    public NumDoors getNumDoors() { return numDoors;}

    /**
     * Number of doors setter
     * @param _numDoors number of doors
     */
    public void setNumDoors(NumDoors _numDoors){ numDoors =_numDoors;}


    /**
     * Model getter
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * Model setter
     * @param _Model model
     */
    public void setModel(String _Model) {
        this.model = _Model;
    }

    /**
     * Maker getter
     * @return maker
     */

    public String getMaker() { return maker; }

    /**
     * Maker setter
     * @param _Maker maker
     */
    public void setMaker(String _Maker) {
        this.maker = _Maker;
    }

    /**
     * Color getter
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Color setter
     * @param _Color color
     */

    public void setColor(String _Color) {
        this.color = _Color;
    }

    public int getYear() { return year; }

    public void setYear(int _carYear) { this.year = _carYear; }

    public void setNumOfDoors(NumDoors _numDoors) { this.numDoors = _numDoors; }

    public NumDoors getNumOfDoors(NumDoors _numDoors) { return numDoors; }

    public void setDealershipID(int _dealershipID) { this.dealershipID = _dealershipID; }

    public int getDealershipID() { return dealershipID; }

    public NumDoors setNumOfDoors() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of doors ('two' / 'four'): ");
        numDoors = NumDoors.valueOf(input.next().toLowerCase());
        return numDoors;
    }

   //public abstract void addCarToInventory(Car car1);
}
