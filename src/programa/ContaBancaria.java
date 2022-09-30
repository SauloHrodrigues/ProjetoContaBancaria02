package programa;

import entidades.ContaBanco;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        //System.out.println("Opção retornada = "+menuPrincipal());
        Scanner input = new Scanner(System.in);
        int opcao=-1;
        do {
            switch (menuPrincipal(input)) {
                case 0:
                    opcao = 0;
                    break;
                case 1:
                    //System.out.println("abrir conta (Implementar)");
                    abrirConta(input);
                    break;
                case 2:
                    System.out.println("Consultar conta (Implementar)");

                    break;
                case 3:
                    System.out.println("Consultar Saldo (Implementar)");
                    break;
                case 4:
                    System.out.println("fechar conta (Implementar)");
                    break;
                case 5:
                    System.out.println("realizar depósito (Implementar)");
                    break;
                case 6:
                    System.out.println("Realizar saque (Implementar)");
                    break;
                default:
                    System.out.println("testando o default");
            }

        }while (opcao!=0);

        input.close();
    }
    public static int menuPrincipal(Scanner input){

        System.out.println("=======================================");
        System.out.println("MENU - AGENCIA BANCÁRIA");
        System.out.println("=======================================");
        System.out.println("1 - Abrir Conta:");
        System.out.println("2 - Consultar Status da Conta:");
        System.out.println("3 - Consultar Saldo da Conta:");
        System.out.println("4 - Fechar Conta:");
        System.out.println("5 - Realizar depósito em Conta:");
        System.out.println("0 - Sair do Programa:");
        System.out.print("Digite a opção desejada: ");
        int opcao = input.nextInt();
        return opcao;
    }
    public static void abrirConta(Scanner input){
        System.out.println("------------------------------");
        System.out.println("----- ABRIR CONTA ------------");
        System.out.println("------------------------------");
        System.out.println("");
    }
}
