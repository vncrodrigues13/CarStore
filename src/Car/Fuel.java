package Car;

public enum Fuel {
    GASOLINE(0),
    ALCOOL(1),
    DIESEL(2),
    FLEX(3),
    ELETRIC(4),
    HYBRID(5),
    GNV(6);

    private final int value;

    Fuel(int value){this.value = value;}

    public int getValue(){return this.value;}
}
