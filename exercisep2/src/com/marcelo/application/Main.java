package com.marcelo.application;

import com.marcelo.modelos.Conta;
import com.marcelo.modelos.ContaCorrente;
import com.marcelo.modelos.ContaPoupanca;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    random
    
    public static void main(String[] args) {
        Conta conta = new ContaPoupanca();
        Conta contaCorrente = new ContaCorrente();
        
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Limite (Conta Corrente)");
            System.out.println("6. Render Juros (Conta Poupança)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1 -> depositar(conta);
                case 2 -> sacar(conta);
                case 3 -> transferir(conta, contaCorrente);
                case 4 -> consultarSaldo(conta);
                case 5 -> consultarLimite((ContaCorrente) contaCorrente);
                case 6 -> renderJuros((ContaPoupanca) conta);
                case 0 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
    
    private static void depositar(Conta conta) {
        System.out.print("Informe o valor para depósito: ");
        BigDecimal valor = scanner.nextBigDecimal();
        if (conta.depositar(valor)) {
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Falha no depósito.");
        }
    }

    private static void sacar(Conta conta) {
        System.out.print("Informe o valor para saque: ");
        BigDecimal valor = scanner.nextBigDecimal();
        if (conta.sacar(valor)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Falha no saque.");
        }
    }

    private static void transferir(Conta contaOrigem, Conta contaDestino) {
        System.out.print("Informe o valor para transferência: ");
        BigDecimal valor = scanner.nextBigDecimal();
        if (contaOrigem.transferir(valor, contaDestino)) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Falha na transferência.");
        }
    }

    private static void consultarSaldo(Conta conta) {
        System.out.println("Saldo atual: " + conta.consultarSaldo());
    }

    private static void consultarLimite(ContaCorrente contaCorrente) {
        System.out.println("Limite disponível: " + contaCorrente.consultarLimite());
    }

    private static void renderJuros(ContaPoupanca contaPoupanca) {
        BigDecimal juros = contaPoupanca.renderJuros();
        System.out.println("Juros aplicados: " + juros);
        System.out.println("Novo saldo após rendimento: " + contaPoupanca.consultarSaldo());
    }
}