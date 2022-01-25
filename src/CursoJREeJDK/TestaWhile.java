package CursoJREeJDK;

public class TestaWhile {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            // contador = contador + 1; mesma coisa da linha 9
            // contador += 1; mesma coisa da linha 10
            contador++;
        }
    }
}

