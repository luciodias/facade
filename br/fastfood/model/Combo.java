package br.fastfood.model;

public class Combo {

    private ItemCombo burger;
    private ItemCombo bebida;
    private ItemCombo sobremesa;

    public Combo(ItemCombo burger, ItemCombo bebida, ItemCombo sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public ItemCombo getBurger() {
        return burger;
    }
    public ItemCombo getBebida() {
        return bebida;
    }
    public ItemCombo getSobremesa() {
        return sobremesa;
    }

    public double getPrecoTotal() {
        return burger.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }
    
}
