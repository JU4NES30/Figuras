public class Circulo extends figura{
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        double area = 3.14 * (radio*radio);
        return 0;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = 3.14 * 2 * radio;
        return 0;
    }

    @Override
    void mostrarInfo() {
        System.out.println("Area total: "+ calcularArea() + "\n" + "Perimetro total: "+ calcularPerimetro() + "\n");

    }
}
