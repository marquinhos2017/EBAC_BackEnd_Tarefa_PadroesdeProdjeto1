// Produtos concretos para Toyota
class ToyotaSedan implements Sedan {
    @Override
    public String getModel() {
        return "Toyota Camry";
    }
}

class ToyotaSUV implements SUV {
    @Override
    public String getModel() {
        return "Toyota Highlander";
    }
}

// Produtos concretos para Ford
class FordSedan implements Sedan {
    @Override
    public String getModel() {
        return "Ford Fusion";
    }
}

class FordSUV implements SUV {
    @Override
    public String getModel() {
        return "Ford Explorer";
    }
}
