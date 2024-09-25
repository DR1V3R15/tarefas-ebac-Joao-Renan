import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Map;

/**
 * @author João Renan
 *
 * Exercício Ebac Módulo 23
 *
 */

public class TestJUnitMod23 {
    @Test
    public void testSepararHomensEMulheres() {
        String input = "João-M,Vivian-F,Maria-F,Pedro-M";
        Map<String, List<String>> listas = App.separarHomensEMulheres(input);

        List<String> listaDeMulheres = listas.get("mulheres");

        for (String nome : listaDeMulheres) {
            assertFalse(nome.endsWith("-M"), "A lista de mulheres contém um homem: " + nome);
        }

        assertEquals(2, listaDeMulheres.size());
        assertTrue(listaDeMulheres.contains("Vivian"));
        assertTrue(listaDeMulheres.contains("Maria"));
    }
}
