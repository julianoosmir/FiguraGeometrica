import javax.swing.*;

public class Triangulo extends FiguraGeometrica{

    private int  area;

    @Override
    void calcularArea() {
        this.area = (this.getAltura() * this.getLargura())/2;
        JOptionPane.showMessageDialog(null,"area do triangulo : " + this.area);
    }
}
