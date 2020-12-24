package Car;

public enum Bodywork {
    SEDAN(0),
    HATCHBACK(1),
    PICAPE(2),
    BUGGY(3),
    CONVERSIVEL(4),
    MINIVAN(5),
    PERUA(6),
    CUPE(7),
    ESPORTIVO(8),
    VAN(9);

    private int value;

    Bodywork(int value){this.value = value;}

    public int getValue(){ return value;}


}
