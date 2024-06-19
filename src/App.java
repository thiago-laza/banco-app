import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine();

        System.out.print("Qual a sua idade: ");
        int idade = sc.nextInt();

        sc.close();

              
        if (idade < 18) {
            System.out.println("Infelizmente voce nao pode abrir uma conta.");
        }else{
            System.out.println("Bem vindo, " + nome + "!!");
            System.out.println("novo teste");
        }


    }
}
