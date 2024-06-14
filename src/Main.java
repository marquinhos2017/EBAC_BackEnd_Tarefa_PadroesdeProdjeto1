public class Main {
    public static void clientCode(CarFactory factory) {
        Sedan sedan = factory.createSedan();
        SUV suv = factory.createSUV();

        System.out.println("Sedan: " + sedan.getModel());
        System.out.println("SUV: " + suv.getModel());
    }

    public static void main(String[] args) {
        System.out.println("Toyota Factory");
        CarFactory toyotaFactory = new ToyotaFactory();
        clientCode(toyotaFactory);

        System.out.println("\nFord Factory");
        CarFactory fordFactory = new FordFactory();
        clientCode(fordFactory);
    }
}
