package br.fastfood.teste;

import br.fastfood.model.Bebida;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBebida {

    @Test
    public void testGetNome() {
        // Arrange
        String expectedNome = "Cheeseburger";
        Bebida item = new Bebida(expectedNome, 10.50);
        // Act
        String actualNome = item.getNome();
        // Assert
        assertEquals(expectedNome, actualNome, "The name of the burger should match the expected value.");
    }

    @Test
    public void testGetPreco() {
        // Arrange
        double expectedPreco = 10.50;
        Bebida item = new Bebida("Cheeseburger", expectedPreco);
        // Act
        double actualPreco = item.getPreco();
        // Assert
        assertEquals(expectedPreco, actualPreco, "The price of the burger should match the expected value.");
    }

}