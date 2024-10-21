public class Rectangulo extends figura{
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        double area = base*altura;
        return 0;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = 2*(base+altura);
        return 0;
    }

    @Override
    void mostrarInfo() {
        System.out.println("Area total: "+ calcularArea() + "\n" + "Perimetro total: "+ calcularPerimetro() + "\n");
    }
}
