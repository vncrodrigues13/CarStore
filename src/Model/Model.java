package Model;

public abstract class Model {
    private String name;
    private String brand;
    private String board;
    private String vehicleRegister;
    private int year;
    private int kilometers;
    private Colors color;
    private State state;    //estado do carro -> novo ou usado
    private boolean paidIPVA;   //ipva pago
    private boolean uniqueOwner; //unico dono
    private boolean licensed;   //licenceado
    private boolean factoryWarranty;    //garantia de fábrica


    public Model(String name, String brand, String board, int year, int kilometers, Colors color,
                 State state, boolean paidIPVA, boolean uniqueOwner, boolean licensed, boolean factoryWarranty) {
        setName(name);
        setBrand(brand);
        setBoard(board);
        setYear(year);
        setKilometers(kilometers);
        setColor(color);
        setState(state);
        setPaidIPVA(paidIPVA);
        setUniqueOwner(uniqueOwner);
        setLicensed(licensed);
        setFactoryWarranty(factoryWarranty);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isPaidIPVA() {
        return paidIPVA;
    }

    public void setPaidIPVA(boolean paidIPVA) {
        this.paidIPVA = paidIPVA;
    }

    public boolean isUniqueOwner() {
        return uniqueOwner;
    }

    public void setUniqueOwner(boolean uniqueOwner) {
        this.uniqueOwner = uniqueOwner;
    }

    public boolean isLicensed() {
        return licensed;
    }

    public void setLicensed(boolean licensed) {
        this.licensed = licensed;
    }

    public boolean isFactoryWarranty() {
        return factoryWarranty;
    }

    public void setFactoryWarranty(boolean factoryWarranty) {
        this.factoryWarranty = factoryWarranty;
    }

    public void setVehicleRegister(String vehicleRegister){
        this.vehicleRegister = vehicleRegister;
    }

    public String getVehicleRegister(){
        return this.vehicleRegister;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", board='" + board + '\'' +
                ", year=" + year +
                ", kilometers=" + kilometers +
                ", color=" + color +
                ", state=" + state +
                ", paidIPVA=" + paidIPVA +
                ", uniqueOwner=" + uniqueOwner +
                ", licensed=" + licensed +
                ", factoryWarranty=" + factoryWarranty +
                '}';
    }
}
