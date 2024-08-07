package figuras;

public class TrianguloRectangulo {
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public String tipoDeTriangulo() {
        double hipotenusa = calcularHipotenusa();
        if (base == altura && base == hipotenusa) {
            return "Equilátero";
        } else if (base == altura || base == hipotenusa || altura == hipotenusa) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
