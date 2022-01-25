package CursoJREeJDK;

public class TestaEscopo {
    public static void main(String[] args) {
        int idade = 19;
        int quantidadePessoas = 3;
        //boolean acompanhado = quantidadePessoas >= 2;

        boolean acompanhado;
        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("Está acompanhado? " + acompanhado);

        if (idade >= 18 && acompanhado) { // && = E - || = OU
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Menor de 18 anos, não pode entrar");
        }
    }
}
