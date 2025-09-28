class AmericanSystem {
    private double fahrenheit;
    private double feet;
    private double pounds;

    public AmericanSystem(double f, double ft, double lbs) {
        this.fahrenheit = f;
        this.feet = ft;
        this.pounds = lbs;
    }

    public double getFahrenheit() { return fahrenheit; }
    public double getFeet() { return feet; }
    public double getPounds() { return pounds; }
}