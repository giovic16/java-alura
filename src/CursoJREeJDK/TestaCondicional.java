package CursoJREeJDK;

public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 13;
        int quantidadePessoas = 3;
        if (idade >= 18) {
            System.out.println("Maior de 18 anos");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("Menor de idade, mas está acompanhado");
            } else {
                System.out.println("Menor de 18 anos");

            }
        }
    }
}
