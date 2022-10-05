public class Bus extends Cars implements Competing {

    public enum Capacity {
        VERY_SMALL(0,10),
        SMALL(10, 25),
        AVERAGE(40,50),
        LARGE(60,80),
        VERY_LARGE(100, 120);

        private int begin;
        private int end;

        Capacity(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }

        public int getBegin() {
            return begin;
        }

        public int getEnd() {
            return end;
        }
    }

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public void startMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " начинает движение.");
    }

    public void finishMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " заканчивает движение.");
    }

    @Override
    public void determineTypeCar() {
        if (capacity == null) {
            System.out.println("Данных по этому авто недостаточно.");
        } else {
            System.out.println("Автобус " + getBrand() + " " + getModel() +
                    " может перевозить от " + capacity.getBegin() + " до " + capacity.getEnd() +
                    " человек и относится к категории - " + capacity);
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