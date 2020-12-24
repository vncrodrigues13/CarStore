import Car.*;
import Model.Colors;
import Model.State;

public class test {
    public static void main(String[] args) {

        Car carro = new Car("Civic",
                "Honda",
                "PFY7461",
                2020,
                0,
                Colors.WHITE,
                State.NEW,
                true,
                true,
                true,
                true,
                true,
                null,
                Fuel.GASOLINE,
                Bodywork.ESPORTIVO
                );

        System.out.println(carro.toString());
    }
}
