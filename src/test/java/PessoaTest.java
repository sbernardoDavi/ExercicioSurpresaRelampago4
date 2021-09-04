import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarNomePessoa(){
        Pessoa pessoa = new Pessoa("Davi");

        assertNotNull(pessoa.getNome());
    }

    @Test
    void naoDeveRetornarExceçãoNomePessoaNulo(){
        try {
            Pessoa pessoa = new Pessoa(null);
            fail();
        }
        catch(NullPointerException e) {
            assertNotNull("Nome obrigatório", e.getMessage());
        }
    }
}