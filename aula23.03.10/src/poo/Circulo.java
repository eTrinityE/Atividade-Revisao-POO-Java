package poo;

public class Circulo {
    int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double circunferencia() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        String Result = "Area: " + area() + " Circunferência: " + circunferencia();
        return Result;
    }

}
