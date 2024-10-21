public class Triangulo extends figura {
    double base;
    double aultura;
    double lado1;
    double lado2;
    double lado3;

    public Triangulo(double base, double aultura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.aultura = aultura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAultura() {
        return aultura;
    }

    public void setAultura(double aultura) {
        this.aultura = aultura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }


    @Override
    double calcularArea() {
        double area = (base*aultura)/2;
        return 0;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = lado1+lado2+lado3;
        return 0;
    }

    @Override
    void mostrarInfo() {
        System.out.println("Area total: "+ calcularArea() + "\n" + "Perimetro total: "+ calcularPerimetro() + "\n");

    }
}
