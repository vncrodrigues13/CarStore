package Motobike;
import Model.*;
import Model.Colors;
import java.util.List;
import java.util.LinkedList;
public class Motobike extends Model{
    private int MotorType;
    private Colors secundColor;
    private Brakes brakes;
    private Cooling cooling;
    private Category category;
    private GearsAmount gears;
    private LaunchType launch;
    private MotorType motorType;
    private Style style;
    private List<Optional> optionalList;

    public Motobike(String name, String brand, String board, int year, int kilometers, Colors color, State state, boolean paidIPVA,boolean uniqueOwner, boolean licensed, boolean factoryWarranty, int motorType, Colors secundColor,Brakes brakes, Cooling cooling, Category category, GearsAmount gears, LaunchType launch, MotorType motorType1, Style style, List<Optional> optionalList) {
        super(name, brand, board, year, kilometers, color, state, paidIPVA, uniqueOwner, licensed, factoryWarranty);
        MotorType = motorType;
        this.secundColor = secundColor;
        this.brakes = brakes;
        this.cooling = cooling;
        this.category = category;
        this.gears = gears;
        this.launch = launch;
        this.motorType = motorType1;
        this.style = style;
        this.optionalList = optionalList;
    }

    public int getMotorType() {
        return MotorType;
    }

    public void setMotorType(MotorType motorType) {
        this.motorType = motorType;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public List<Optional> getOptionalList() {
        return optionalList;
    }

    public void setOptionalList(List<Optional> optionalList) {
        this.optionalList = optionalList;
    }

    public void setMotorType(int motorType) {
        MotorType = motorType;
    }

    public Colors getSecundColor() {
        return secundColor;
    }

    public void setSecundColor(Colors secundColor) {
        this.secundColor = secundColor;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }

    public Cooling getCooling() {
        return cooling;
    }

    public void setCooling(Cooling cooling) {
        this.cooling = cooling;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public GearsAmount getGears() {
        return gears;
    }

    public void setGears(GearsAmount gears) {
        this.gears = gears;
    }

    public LaunchType getLaunch() {
        return launch;
    }

    public void setLaunch(LaunchType launch) {
        this.launch = launch;
    }
}
