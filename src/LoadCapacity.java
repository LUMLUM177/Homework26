
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