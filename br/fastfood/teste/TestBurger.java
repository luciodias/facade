package br.fastfood.teste;

import br.fastfood.model.Burger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBurger {

    @Test
    public void testGetNome() {
        // Arrange
        String expectedNome = "Cheeseburger";
        Burger burger = new Burger(expectedNome, 10.50);

        // Act
        String actualNome = burger.getNome();

        // Assert
        assertEquals(expectedNome, actualNome, "The name of the burger should match the expected value.");
    }
}