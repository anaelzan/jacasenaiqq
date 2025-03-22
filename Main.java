import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
//
//        int num = 150;
//        long num01 = 10l;
//        byte numNovo = 105;
//
//        String nome = "Ana";
//        System.out.println("meu nome é:"+ nome);
//
//        float num02= 10.5f;
//        double num03 = 10.5;
//                System.out.println(num02 + num03);
//        System.out.println(num02 - num03);
//        System.out.println(num*num03);
//        System.out.println(num/num03);
//        //--------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("Digite quatro caracteres:");
//        char char1 = scanner.next().charAt(0); // Lê o primeiro caractere
//        char char2 = scanner.next().charAt(0); // Lê o segundo caractere
//        char char3 = scanner.next().charAt(0); // Lê o terceiro caractere
//        char char4 = scanner.next().charAt(0); // Lê o quarto caractere
//
//        // Concatena e exibe os caracteres
//        System.out.println("Os caracteres digitados foram: " + char1 + char2 + char3+char4);
//        System.out.println(char1+char2+char3+char4);
//        scanner.close();
//
//
//        // Promoção Automática
//        int numeroInt = 17;
//        double numeroDouble = numeroInt; // Promoção automática
//        System.out.println(numeroInt); // Saída: 10
//        System.out.println(numeroDouble); // Saída: 10.0

//        // Casting Explícito
//        double numeroDoublenew = 123.456;
//        int numeroIntnew = (int) numeroDoublenew; // Casting explícito
//        System.out.println(numeroIntnew); // Saída: 123 (perda da parte decimal)

//        //3. Parsing de Strings
//        String numeroTexto = "56";
//        int numeroInt = Integer.parseInt(numeroTexto);
//        System.out.println(numeroInt); // Saída: 42
//
//        // Cuidados ao Trabalhar com Conversões
//        byte valor = 127;
//        valor++;
//        System.out.println(valor); // Saída: -128 (overflow)

        // conversão de tipos:

//        long valorLong= 150l;
//        byte valorByte= (byte) valorLong;
//        System.out.println("valor de long é:"+ valorLong);
//        System.out.println("valor convertido para byte:"+ valorByte);

// Atividade 4: Parsing de Strings

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String inputInt = scanner.nextLine();

        try {
            int numeroInt = Integer.parseInt(inputInt);
            System.out.println("Número inteiro convertido: " + numeroInt);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para inteiro: " + e.getMessage());
        }

        System.out.print("Digite um número decimal: ");
        String inputDouble = scanner.nextLine();

        try {
            double numeroDouble = Double.parseDouble(inputDouble);
            System.out.println("Número decimal convertido: " + numeroDouble);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para decimal: " + e.getMessage());
        }











    }
}