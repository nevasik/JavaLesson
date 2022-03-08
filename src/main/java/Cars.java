import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static void main(String[] args) {
        List<String> cars1 = new ArrayList<>();
        cars1.add("бмв");
        cars1.add("мерседес");
        cars1.add("лексус");
        cars1.add("хонда");
        cars1.add("тайота");
        cars1.add("форд");
        cars1.add("киа");
        cars1.add("хаюндай");

        CarsBand carsBand1 = new CarsBand("Best cars", 2020, cars1);

        List<String> cars2 = new ArrayList<>();
        cars2.add("альфа-ромео");
        cars2.add("лада");
        cars2.add("ситроен");
        cars2.add("рэнж ровер");
        cars2.add("пежо");
        cars2.add("опель");
        cars2.add("порж");
        cars2.add("шкода");

        CarsBand carsBand2 = new CarsBand("Don't best", 2020, cars2);

        carsBand1.printCars();
        carsBand2.printCars();

        CarsBand.transfersCars(carsBand1, carsBand2);

        carsBand1.printCars();
        carsBand2.printCars();
    }
}
