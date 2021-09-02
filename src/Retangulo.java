import javax.swing.*;

public class Retangulo extends FiguraGeometrica{
    private int area;

    @Override
    void calcularArea() {
        this.area = (this.getAltura() * this.getLargura());
        JOptionPane.showMessageDialog(null,"area do retangulo : " + this.area);
    }
}
