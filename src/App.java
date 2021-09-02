import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        menu();
    }

    static void menu(){
        int valor = apenaNumeros("escolha 1 para quandrado ou 2 para triangulo");
        switch (valor){
            case 1:
                calcularReatangulo();
                break;
            case 2:
                calcularTraigulo();
                break;
            default:
                break;
        }
        int denovo = apenaNumeros("tecle 0 para repetir");
        if(denovo == 0){
            menu();
        }

    }

    static void calcularTraigulo(){
        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(apenaNumeros("altura"));
        triangulo.setLargura(apenaNumeros("largura"));
        triangulo.calcularArea();
    }

    static void calcularReatangulo() {
        Retangulo r = new Retangulo();
        r.setAltura(apenaNumeros("altura"));
        r.setLargura(apenaNumeros("largura"));
        r.calcularArea();

    }

    static int apenaNumeros(String mensagem) {
        Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^]");
        String input = JOptionPane.showInputDialog(mensagem);
        Matcher m = p.matcher(input);
        if (m.find()) {
            JOptionPane.showMessageDialog(null, "apenas numeros");
            return apenaNumeros(mensagem);
        } else {
            int valor = Integer.parseInt(input);
            return valor;
        }
    }


}
