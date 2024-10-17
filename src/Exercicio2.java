public class Exercicio2 {

    public static void main(String[] args) {

        String txtInserido = "Luciana";
        String txtFormatado = txtInserido.toUpperCase();
        int contador = 0;

        if (txtFormatado.contains("A")) {

            for (char letra : txtFormatado.toCharArray()) {
                if (letra == 'A') {
                    contador++;
                }
            }
            System.out.println("Encontrado a letra 'A' no texto " + contador + " vezes.");

        } else {
            System.out.println("Nenhuma letra 'A' foi encontrada");
        }
    }
}

