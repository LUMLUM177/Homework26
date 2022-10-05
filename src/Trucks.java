public class Trucks extends Cars implements Competing {

    public enum LoadCapacity {
        N1(0.1, 3.5),
        N2(3.5, 12D),
        N3(12D, 30D);

        private final double begin;
        private final double end;

        LoadCapacity(double begin, double end) {
            this.begin = begin;
            this.end = end;
        }

        public double getBegin() {
            return begin;
        }

        public double getEnd() {
            return end;
        }
    }

    private LoadCapacity loadCapacity;

    public Trucks(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;

    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void startMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " начинает движение.");
    }

    public void finishMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " заканчивает движение.");
    }

    @Override
    public void determineTypeCar() {
        if (loadCapacity == null) {
            System.out.println("Данных по этому авто недостаточно.");
        } else {
            System.out.println("Автобус " + getBrand() + " " + getModel() +
                    " имеет грузоподъёмность от " + loadCapacity.getBegin() + " до " + loadCapacity.getEnd() +
                    " килограмм и относится к категории - " + loadCapacity);
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