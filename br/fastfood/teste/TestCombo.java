package br.fastfood.teste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import br.fastfood.model.Bebida;
import br.fastfood.model.Burger;
import br.fastfood.model.Combo;
import br.fastfood.model.Sobremesa;

public class TestCombo {
    Burger burger = new Burger("Big Cheddar", 18.00);
    Bebida bebida = new Bebida("Coca-Cola", 8.00);
    Sobremesa sobremesa = new Sobremesa("Sundae", 9.90);

    @Test
    public void testComboCreation() {
        Combo combo = new Combo(burger, bebida, sobremesa);
        assertNotNull(combo);
        assertEquals(burger, combo.getBurger());
        assertEquals(bebida, combo.getBebida());
        assertEquals(sobremesa, combo.getSobremesa());
    }

    @Test
    public void testComboPriceCalculation() {
        Combo combo = new Combo(burger, bebida, sobremesa);
        assertEquals(35.90, combo.getPrecoTotal());
    }
}