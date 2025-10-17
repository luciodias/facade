package br.fastfood.facade;

import br.fastfood.model.Combo;
import br.fastfood.model.Burger;
import br.fastfood.model.Bebida;
import br.fastfood.model.Sobremesa;

public class ComboFacade {
    private Combo combo;

    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                // Big Cheddar (R$ 18.00) + Coca-Cola (R$ 8.00) + Sundae (R$ 9.90)
                this.combo = new Combo(
                    new Burger("Big Cheddar", 18.00) ,
                    new Bebida("Coca-Cola", 8.00),  
                    new Sobremesa("Sundae", 9.90)
                );
                break;
            case 2:
                // Mega Bacon (R$ 16.00) + Guaraná (R$ 7.50) + Torta de Maçã (R$ 9.00)
                this.combo = new Combo(
                    new Burger("Mega Bacon", 16.00) ,
                    new Bebida("Guaraná", 7.50),  
                    new Sobremesa("Torta de Maçã", 9.90)
                );
                break;
            case 3:
                // Mini Burger (R$ 12.00) + Suco Laranja (R$ 6.00) + Sorvete (R$ 4.90)
                this.combo = new Combo(
                    new Burger("Mini Burger", 12.00) ,
                    new Bebida("Suco Laranja", 6.00),  
                    new Sobremesa("Sorvete", 4.90)
                );
                break;
            default:
                System.out.println("Código de combo inválido!");
                break;
        }
    }
    
    /**
     * Exibe todos os itens do combo
     */
    public void exibirItens() {
        if (combo == null) {
            System.out.println("Nenhum combo criado ainda!");
            return;
        }
        
        System.out.println("\n=== Detalhes do Pedido ===");
        System.out.println(
            this.combo.getBurger() + "\n" +
            this.combo.getBebida() + "\n" +
            this.combo.getSobremesa()
        );
        
        System.out.println("==========================");
    }

    /**
     * Retorna o preço total do combo
     * @return preço total
     */
    public double getPrecoTotal() {
        return this.combo.getPrecoTotal();
    }
}