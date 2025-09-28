class Adapter implements MetricSystem {
    private AmericanSystem american;

    public Adapter(AmericanSystem american) {
        this.american = american;
    }

    public double getCelsius() {
        return (american.getFahrenheit() - 32) * 5/9;
    }

    public double getMeters() {
        return american.getFeet() * 0.3048;
    }

    public double getKilograms() {
        return american.getPounds() * 0.453592;
    }
}