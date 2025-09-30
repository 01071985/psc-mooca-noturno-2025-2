import javax.swing.JOptionPane;

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
    for(int i=0; i<5; i++){
        int op = Integer.parseInt(JOptionPane.showInputDialog("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão"));
        double operando1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o primeiro operando?"));
        double operando2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o segundo operando?"));
        double resultado;
        

        if (op == 1) {
            resultado = calc.soma(operando1, operando2);
            JOptionPane.showMessageDialog(null, "O resultado da soma é: " + resultado);
        } else {
            if (op == 2) {
                resultado = calc.subtracao(operando1, operando2);
                JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + resultado);
            } else {
                if (op == 3) {
                    resultado = calc.multiplicao(operando1, operando2);
                    JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + resultado);
                } else {
                    if (op == 4) {
                        resultado = calc.divisao(operando1, operando2);
                        JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Operação inválida!");
                    }
        }            }
                    }
       
    }
}}

