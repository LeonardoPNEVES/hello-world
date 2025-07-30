import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){

        System.out.println("Bem-vindo a minha tarefa da EBAC");

        Scanner scanner = new Scanner(System.in);
                           //nome


        System.out.println("Olá, Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome :" + nome);


                         //idade

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("idade: " + idade);


                       //CPF

        System.out.println("Digite seu CPF: ");
        long CPF = scanner.nextLong();
        System.out.println("CPF : " + CPF);


                       //peso

        System.out.println("Digite seu peso: ");
        byte peso = scanner.nextByte();
        System.out.println("Seu peso é: " + peso + " Kg");

                      //Altura

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Sua altura é: " + altura );





        System.out.println("Olá eu sou " + nome + " eu tenho " + idade + " meu cpf e: " + CPF + " eu peso: " + peso + " eu tenho " + altura + " de altura" );



    }
}
