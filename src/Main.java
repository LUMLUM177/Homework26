import java.util.Arrays;

public class Main {
    public static void printInfoByAuto(Auto auto) {
        System.out.println("Информация о легковом автомобиле:" +
                " марка " + auto.getBrand() +
                ", модель " + auto.getModel() +
                ", мощность двигателя " + auto.getEngineVolume() +
                " литров. Тип кузова - " + auto.getBodyType());
    }

    public static void printInfoByBus(Bus bus) {
        System.out.println("Информация о автобусе:" +
                " марка " + bus.getBrand() +
                ", модель " + bus.getModel() +
                ", мощность двигателя " + bus.getEngineVolume() +
                " литров. Тип вместимости - " + bus.getCapacity());
    }

    public static void printInfoByTrucks(Trucks trucks) {
        System.out.println("Информация о грузовом автомобиле:" +
                " марка " + trucks.getBrand() +
                ", модель " + trucks.getModel() +
                ", мощность двигателя " + trucks.getEngineVolume() +
                " литров. Тип грузоподъёмности - " + trucks.getLoadCapacity());
    }

    public static void main(String[] args) {

        Auto audi = new Auto("Audi", "A8", 2.7, BodyType.SEDAN);
        Auto hyundai = new Auto("Hyundai", "Ferrato", 2.3, BodyType.COMPARTMENT);
        Auto lada = new Auto("Lada", "Grande", 1.6, BodyType.CROSSOVER);
        Auto ford = new Auto("Ford", "Focus", -5.0, BodyType.OFF_ROAD_VEHICLE);

        Trucks kamaz = new Trucks("Камаз", "А 30", 18.0, LoadCapacity.N1);
        Trucks sable = new Trucks("Соболь", "М 333", 11.0, LoadCapacity.N2);
        Trucks gazelle = new Trucks("Газель", "Г 3", 9.0, LoadCapacity.N2);
        Trucks zil = new Trucks("ЗИЛ", "З 100", 17.0, LoadCapacity.N3);

        Bus lion = new Bus("Lion", "City", 10, Capacity.VERY_SMALL);
        Bus city = new Bus("СитиРитм", "10", 9, Capacity.VERY_SMALL);
        Bus cursor = new Bus("ЛиАЗ", "4292", 8, Capacity.AVERAGE);
        Bus mercedez = new Bus("Mercedez-Benz", "Sprinter II", 7, Capacity.SMALL);

        printInfoByAuto(audi);
        printInfoByAuto(hyundai);
        printInfoByAuto(lada);
        printInfoByAuto(ford);

        System.out.println();
        printInfoByBus(lion);
        printInfoByBus(city);
        printInfoByBus(cursor);
        printInfoByBus(mercedez);

        System.out.println();
        audi.determineTypeCar();
        hyundai.determineTypeCar();
        mercedez.determineTypeCar();
        cursor.determineTypeCar();
        zil.determineTypeCar();
        kamaz.determineTypeCar();


    }
}