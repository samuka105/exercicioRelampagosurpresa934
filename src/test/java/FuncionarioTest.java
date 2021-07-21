import exercicioRelampagoSupresa.Departamento;
import exercicioRelampagoSupresa.Escolaridade;
import exercicioRelampagoSupresa.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {

    @Test
    public void deveRetornarEscolaridade()
    {
        Funcionario funcionario = new Funcionario(new Escolaridade("Ensino Medio"), new Departamento());
        assertEquals("MG", cidade.getNomeEstado());

    }
}
