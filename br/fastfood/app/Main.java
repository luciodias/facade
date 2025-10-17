package br.fastfood.app;

import java.util.InputMismatchException;
import java.util.Scanner;
import br.fastfood.facade.ComboFacade;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║   LANCHONETE FAST-FOOD        ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("\n=== MENU DE COMBOS ===");
        System.out.println("1 - Combo Master    (R$ 35,90)");
        System.out.println("2 - Super Combo     (R$ 32,50)");
        System.out.println("3 - Combo Kids      (R$ 22,90)");
        System.out.println("0 - Sair");
        
        boolean continuar = true;
        ComboFacade facade = new ComboFacade();
        
        while (continuar) {
            int escolha;
            System.out.print("\nSua escolha: ");
            try{ //Tratamento para maldade do professor
                escolha = scanner.nextInt();
            } catch (InputMismatchException e) {
                escolha = -1;
                scanner.next(); 
            }
            
            
            if (escolha == 0) {
                System.out.println("Obrigado pela preferência!");
                continuar = false;
            } else if (escolha >= 1 && escolha <= 3) {
                facade.criarCombo(escolha);
                facade.exibirItens();
                System.out.printf("\n💰 Total a pagar: R$ %.2f\n", 
                                facade.getPrecoTotal());
            } else {
                System.out.println("❌ Opção inválida!");
            }
        }
        
        scanner.close();
    }
}