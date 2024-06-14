// Interface dos produtos
interface Sedan {
    String getModel();
}

interface SUV {
    String getModel();
}

// Interface da fábrica
interface CarFactory {
    Sedan createSedan();
    SUV createSUV();
}
