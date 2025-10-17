package br.fastfood.teste;

import br.fastfood.model.Sobremesa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSobremesa {

    @Test
    public void testGetNome() {
        // Arrange
        String expectedNome = "Cheeseburger";
        Sobremesa item = new Sobremesa(expectedNome, 10.50);
        // Act
        String actualNome = item.getNome();
        // Assert
        assertEquals(expectedNome, actualNome, "The name of the Sobremesa should match the expected value.");
    }

    @Test
    public void testGetPreco() {
        // Arrange
        double expectedPreco = 10.50;
        Sobremesa item = new Sobremesa("Cheeseburger", expectedPreco);
        // Act
        double actualPreco = item.getPreco();
        // Assert
        assertEquals(expectedPreco, actualPreco, "The price of the Sobremesa should match the expected value.");
    }

}