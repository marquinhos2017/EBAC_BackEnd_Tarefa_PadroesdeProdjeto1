// Fábrica concreta para Toyota
class ToyotaFactory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public SUV createSUV() {
        return new ToyotaSUV();
    }
}

// Fábrica concreta para Ford
class FordFactory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public SUV createSUV() {
        return new FordSUV();
    }
}
