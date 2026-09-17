package org.alessandra;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IdentifierTest {

    private Identifier identifier;

    @BeforeEach
    void setUp() {
        identifier = new Identifier();
    }

    @Test
    @DisplayName("Classe (1)(4)(6) - identificador válido comum")
    void testIdentificadorValidoComum() {
        boolean resultado = identifier.validateIdentifier("maria");
        assertTrue(resultado);
    }

    @Test
    @DisplayName("Classe (5) - não inicia com letra")
    void testNaoIniciaComLetra() {
        boolean resultado = identifier.validateIdentifier("1111");
        assertFalse(resultado);
    }
        

    @Test
    @DisplayName("Classe (2) - comprimento zero (string vazia)")
    void testComprimentoZero() {
        boolean resultado = identifier.validateIdentifier("");
        assertFalse(resultado);
    }

    @Test
    @DisplayName("Classe (7) - contém caractere inválido (não letra/dígito)")
    void testCaractereInvalido() {
        boolean resultado = identifier.validateIdentifier("a#1");
        assertFalse(resultado);
    }


    @Test
    @DisplayName("Limite inferior válido - t=1")
    void testLimiteInferiorValido() {
        boolean resultado = identifier.validateIdentifier("a");
        assertTrue(resultado);
    }

    @Test
    @DisplayName("Limite superior válido - t=6")
    void testLimiteSuperiorValido() {
        boolean resultado = identifier.validateIdentifier("cba456");
        assertTrue(resultado);
    }

    @Test
    @DisplayName("Limite logo acima do máximo - t=7")
    void testLimiteAcimaDoMaximo() {
        boolean resultado = identifier.validateIdentifier("cba4569");
        assertFalse(resultado);
    }
}