package org.example;


import java.util.Scanner;

public class ContaTerminal {
    //Criando as variáveis e Scanner
    static Scanner s = new Scanner(System.in);
    static int numero;
    static String agencia;
    static String cliente;
    static double saldo;

    //Método main
    public static void main(String[] args) {
        System.out.println("Olá, seja bem vindo ao banco.");
        System.out.println("Vamos criar a sua conta!");
        NumeroConta();
        NumeroAgencia();
        NomeCliente();
        SaldoConta();
        ContaCriada();
    }

    //Informando número da conta
    static void NumeroConta(){
        System.out.println("Por favor, informe o número da sua conta:");
        numero = s.nextInt();
    }
    //Informando número da agência
    static void NumeroAgencia(){
        System.out.println("Agora, informe o número da sua agência:");
        agencia = s.next();
    }

    //Informando nome do cliente
    static void NomeCliente(){
        System.out.println("Agora, informe o seu nome:");
        cliente = s.next();
        s.nextLine();
    }

    //Informando saldo atual
    static void SaldoConta(){
        System.out.println("Por fim, informe o saldo inicial da sua conta:");
        saldo = s.nextDouble();
        s.close();
    }

    //Mensagem de conta criada
    static void ContaCriada(){
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}