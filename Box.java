class Box <T, K, U> {
    private T param1;
    private K param2;
    private U param3;

    public Box (T param1, K param2, U param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    public double getSum() {
        double sum = 0;

        if (param1 instanceof Number) {
            sum += ((Number) param1).doubleValue();
        }
        if (param2 instanceof Number) {
            sum += ((Number) param2).doubleValue();
        }
        if (param3 instanceof Number) {
            sum += ((Number) param3).doubleValue();
        }

        return sum;
    }
}
