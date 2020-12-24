package Car;
import Model.*;
import java.util.List;

public class Car extends Model {
    private boolean armored;    //blindado
    private List<Optional> optinalsList; //lista de opcionais
    private Fuel fuel;      //tipo do combustivel
    private Bodywork bodywork;  //tipo da carroceria

    public Car(String name, String brand, String board, int year, int kilometers, Colors color, State state,
               boolean paidIPVA, boolean uniqueOwner, boolean licensed, boolean factoryWarranty, boolean armored, List<Optional> optinalsList, Fuel fuel, Bodywork bodywork) {
        super(name, brand, board, year, kilometers, color, state, paidIPVA, uniqueOwner, licensed, factoryWarranty);
        this.armored = armored;
        this.optinalsList = optinalsList;
        this.fuel = fuel;
        this.bodywork = bodywork;
    }

    public boolean isArmored() {
        return armored;
    }

    public void setArmored(boolean armored) {
        this.armored = armored;
    }

    public List<Optional> getOptinalsList() {
        return optinalsList;
    }

    public void setOptinalsList(List<Optional> optinalsList) {
        this.optinalsList = optinalsList;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Bodywork getBodywork() {
        return bodywork;
    }

    public void setBodywork(Bodywork bodywork) {
        this.bodywork = bodywork;
    }
}
