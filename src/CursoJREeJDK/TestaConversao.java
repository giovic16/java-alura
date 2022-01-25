package CursoJREeJDK;

public class TestaConversao {
    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario; // converte o valor da váriavel real em inteiro
        System.out.println(valor);

        long numeroGrande = 1092841268940l; // long imprime valores de até 64bits
        System.out.println(numeroGrande);

        short numeroPequeno = 1234; // short imprime valores de até 16bits
        System.out.println(numeroPequeno);

        byte b = 127; // byte menor que short
        System.out.println(b);

        double valor1 = 0.1;
        double valor2 = 0.2;
        System.out.println(valor1 + valor2);


    }
}
