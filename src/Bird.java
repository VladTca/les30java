public class Bird implements Flyble {
    @Override
    public void fly() {
        System.out.println("Птица летит");
    }

    private double height;
    private double weight;
    private double wingspan;

    public Bird(double height, double weight, double wingspan) {
        this.height = height;
        this.weight = weight;
        this.wingspan = wingspan;
    }
}
