public class Duck extends Bird{
    public Duck(double height, double weight, double wingspan) {
        super(height, weight, wingspan);
    }

    @Override
    public void fly() {
        System.out.println("Утка летит, она птица");
    }
}
