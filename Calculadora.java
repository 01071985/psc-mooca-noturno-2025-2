import javax.swing.JOptionPane;

public class Calculadora {

            //public int soma(int a, int b){
               // int resultado;
                //resultado = a + b;
                //return resultado;
    //}
    String modelo;

    //Construtor
    public Calculadora(){
        modelo = "123";
    JOptionPane.showMessageDialog(null,"Calculadora Simples" + modelo);
    }
    public CalculadoraCientifica(){
        modelo = "456";
    JOptionPane.showMessageDialog(null,"Calculadora Cientifica" + modelo);
    }

    public double soma(double a, double b){
        double resultado = a + b;
       return resultado;
    }
        public double soma(double a, double b, double c){
        double resultado = a + b + c;
       return resultado;}


     //public int subtracao(int a, int b){
        //int resultado;
        //resultado = a - b;
        //return resultado;
        
    //}
    public double subtracao(double a, double b){
        double resultado = a - b;
       return resultado;

}
    //public int multiplicao(int a, int b){
        //int resultado;
        //resultado = a * b;
        //return resultado;
        
    //}
    public double multiplicacao(double a, double b){
        double resultado = a * b;
       return resultado;
  }

    //public int divisao(int a, int b){
       // int resultado;
      //  resultado = a / b;
     //   return resultado;
        
    //}
    public double divisao(double a, double b){
        double resultado = a / b;
       return resultado;

    }
}