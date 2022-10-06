
public enum Capacity {
    VERY_SMALL(0, 10),
    SMALL(10, 25),
    AVERAGE(40, 50),
    LARGE(60, 80),
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
