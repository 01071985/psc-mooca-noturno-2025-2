import javax.swing.JOptionPane;

public class IfEncadeado {
    public static void main(String[] args) {
        double  nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno"));
        if (nota >= 7) {JOptionPane.showMessageDialog(null,"Nota " + nota + " Aprovado!");
    }
        else if (nota <= 5) {JOptionPane.showMessageDialog(null,"Nota " + nota + " Reprovado!");
    }
    else {JOptionPane.showMessageDialog(null,"Nota " + nota + " Recuperação!");
        
    }
    
}}

