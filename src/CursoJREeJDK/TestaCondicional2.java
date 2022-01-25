package CursoJREeJDK;

public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 19;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        System.out.println("Está acompanhado? " + acompanhado);

        if (idade >= 18 && acompanhado) { // && = E - || = OU
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Menor de 18 anos, não pode entrar");
        }
    }
}

