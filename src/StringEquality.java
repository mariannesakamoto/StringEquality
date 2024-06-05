import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um nome
        System.out.println("Digite um nome: ");
        String nome = scanner.nextLine();

        // Verifica se o nome é "Moe" sem usar ==
        if (nome.equals("Moe")) {
            System.out.println("Voce e o rei do rock and roll");
        } else {
            System.out.println("Voce nao e o rei");
        }
    }
}