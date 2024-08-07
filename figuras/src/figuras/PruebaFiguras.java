package figuras;

public class PruebaFiguras {
    public static void main(String[] args) {
        // Crear y probar un Círculo
        Circulo circulo = new Circulo(5);
        System.out.println("Círculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        
        // Crear y probar un Rectángulo
        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("\nRectángulo:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        
        // Crear y probar un Cuadrado
        Cuadrado cuadrado = new Cuadrado(3);
        System.out.println("\nCuadrado:");
        System.out.println("Área: " + cuadrado.calcularArea());
        System.out.println("Perímetro: " + cuadrado.calcularPerimetro());
        
        // Crear y probar un Triángulo Rectángulo
        TrianguloRectangulo triangulo = new TrianguloRectangulo(3, 4);
        System.out.println("\nTriángulo Rectángulo:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
        System.out.println("Tipo de Triángulo: " + triangulo.tipoDeTriangulo());
    }
}
