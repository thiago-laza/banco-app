import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine();
        sc.close();

        System.out.println("Bem vindo, " + nome + "!");
    }
}
