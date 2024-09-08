package classes;
import interfage.*;
import data.*;
import images.*;
public class Car {
    protected String Model;
    protected String Type;
    protected boolean Status;
    protected String CarColor;
    protected String HourlyRate;
    protected String Location;
    public Car(){}
    public Car(String Model,String Type,boolean Status,String Color,String HourlyRate,String Location){
        this.Model=Model;
        this.Type=Type;
        this.Status=Status;
        this.CarColor=Color;
        this.HourlyRate=HourlyRate;
        this.Location=Location;
    }
    public void AddingCar(){
        
    }
}
