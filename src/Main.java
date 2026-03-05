import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        var  scanner = new Scanner(System.in);

        // Solicita o nome:
        System.out.println("Olá qual o seu nome?");
        var nome = scanner.nextLine();

        //Solicita a idade:
        System.out.println("Olá qual a sua idade?");
        var idade = scanner.nextInt();

        //Indica o nome e a idade:
        System.out.printf("OLá %s você tem %s anos!",nome, idade);

    }
}