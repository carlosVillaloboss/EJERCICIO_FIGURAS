package figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazFiguras {

    private JFrame frame;
    private JTextField txtRadioCirculo;
    private JTextField txtBaseRectangulo;
    private JTextField txtAlturaRectangulo;
    private JTextField txtLadoCuadrado;
    private JTextField txtBaseTriangulo;
    private JTextField txtAlturaTriangulo;
    private JTextArea txtResultado;

    public InterfazFiguras() {
        // Configurar la ventana principal
        frame = new JFrame("Figuras Geométricas");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 2, 10, 10));

        // Crear componentes para Círculo
        JLabel lblRadioCirculo = new JLabel("Radio del Círculo:");
        txtRadioCirculo = new JTextField();

        // Crear componentes para Rectángulo
        JLabel lblBaseRectangulo = new JLabel("Base del Rectángulo:");
        JLabel lblAlturaRectangulo = new JLabel("Altura del Rectángulo:");
        txtBaseRectangulo = new JTextField();
        txtAlturaRectangulo = new JTextField();

        // Crear componentes para Cuadrado
        JLabel lblLadoCuadrado = new JLabel("Lado del Cuadrado:");
        txtLadoCuadrado = new JTextField();

        // Crear componentes para Triángulo Rectángulo
        JLabel lblBaseTriangulo = new JLabel("Base del Triángulo:");
        JLabel lblAlturaTriangulo = new JLabel("Altura del Triángulo:");
        txtBaseTriangulo = new JTextField();
        txtAlturaTriangulo = new JTextField();

        // Botón para calcular
        JButton btnCalcular = new JButton("Calcular");

        // Área de texto para mostrar resultados
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtResultado);

        // Agregar componentes al panel
        frame.add(lblRadioCirculo);
        frame.add(txtRadioCirculo);
        frame.add(lblBaseRectangulo);
        frame.add(txtBaseRectangulo);
        frame.add(lblAlturaRectangulo);
        frame.add(txtAlturaRectangulo);
        frame.add(lblLadoCuadrado);
        frame.add(txtLadoCuadrado);
        frame.add(lblBaseTriangulo);
        frame.add(txtBaseTriangulo);
        frame.add(lblAlturaTriangulo);
        frame.add(txtAlturaTriangulo);
        frame.add(btnCalcular);
        frame.add(scrollPane);

        // Configurar acción del botón
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularYMostrar();
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }

    private void calcularYMostrar() {
        try {
            // Obtener datos del Círculo
            double radio = Double.parseDouble(txtRadioCirculo.getText());
            Circulo circulo = new Circulo(radio);
            String resultadoCirculo = "Círculo:\n" +
                    "Área: " + circulo.calcularArea() + "\n" +
                    "Perímetro: " + circulo.calcularPerimetro() + "\n";

            // Obtener datos del Rectángulo
            double baseRectangulo = Double.parseDouble(txtBaseRectangulo.getText());
            double alturaRectangulo = Double.parseDouble(txtAlturaRectangulo.getText());
            Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
            String resultadoRectangulo = "Rectángulo:\n" +
                    "Área: " + rectangulo.calcularArea() + "\n" +
                    "Perímetro: " + rectangulo.calcularPerimetro() + "\n";

            // Obtener datos del Cuadrado
            double ladoCuadrado = Double.parseDouble(txtLadoCuadrado.getText());
            Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
            String resultadoCuadrado = "Cuadrado:\n" +
                    "Área: " + cuadrado.calcularArea() + "\n" +
                    "Perímetro: " + cuadrado.calcularPerimetro() + "\n";

            // Obtener datos del Triángulo Rectángulo
            double baseTriangulo = Double.parseDouble(txtBaseTriangulo.getText());
            double alturaTriangulo = Double.parseDouble(txtAlturaTriangulo.getText());
            TrianguloRectangulo triangulo = new TrianguloRectangulo(baseTriangulo, alturaTriangulo);
            String resultadoTriangulo = "Triángulo Rectángulo:\n" +
                    "Área: " + triangulo.calcularArea() + "\n" +
                    "Perímetro: " + triangulo.calcularPerimetro() + "\n" +
                    "Hipotenusa: " + triangulo.calcularHipotenusa() + "\n" +
                    "Tipo de Triángulo: " + triangulo.tipoDeTriangulo() + "\n";

            // Mostrar todos los resultados
            txtResultado.setText(resultadoCirculo + resultadoRectangulo + resultadoCuadrado + resultadoTriangulo);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor, ingrese valores válidos.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfazFiguras());
    }
}
