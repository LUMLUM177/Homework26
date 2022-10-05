public class Auto extends Cars implements Competing {

    public enum BodyType {
        SEDAN,
        HATCHBACK,
        COMPARTMENT,
        UNIVERSAL,
        OFF_ROAD_VEHICLE,
        CROSSOVER,
        PICKUP,
        VAN,
        MINIVAN;
    }

    private BodyType bodyType;

    public Auto(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public void startMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " начинает движение.");
    }

    public void finishMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " заканчивает движение.");
    }

    @Override
    public void determineTypeCar() {
        if (bodyType == null) {
            System.out.println("Данных по этому авто недостаточно.");
        } else {
            System.out.println("Тип кузова автомобиля: " + getBrand() + " " + getModel() + " - " + bodyType);
        }
    }

    public void pitStop() {
        System.out.println(this.getBrand() + " " + this.getModel() + " совершает пит-стоп!");
    }

    @Override
    public double getBestTimeLap() {
        System.out.println(this.getBrand() + " " + this.getModel() + " устанавливает лучшее время круга!");
        return 0;
    }

    @Override
    public double getMaxSpeed() {
        System.out.println(this.getBrand() + " " + this.getModel() + " развивает максимальную скорость!");
        return 0;
    }



}
