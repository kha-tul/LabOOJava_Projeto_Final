package one.digitalinovation.laboojava.negocio;

import one.digitalinovation.laboojava.basedados.Banco;
import one.digitalinovation.laboojava.entidade.Cliente;
import one.digitalinovation.laboojava.entidade.Produto;

import java.util.Optional;

/**
 * Classe para manipular a entidade {@link Cliente}.
 * @author thiago leite
 */
public class ClienteNegocio {

    /**
     * {@inheritDoc}.
     */
    private Banco bancoDados;

    /**
     * Construtor.
     * @param banco Banco de dados para ter acesso aos clientes cadastrados
     */
    public ClienteNegocio(Banco banco) {
        this.bancoDados = banco;
    }

    /**
     * Consulta o cliente pelo seu CPF.
     * @param cpf CPF de um cliente
     * @return O cliente que possuir o CPF passado.
     */
    public Optional<Cliente> consultar(String cpf) {

        if (bancoDados.getCliente().getCpf().equals(cpf)) {
            return Optional.of(bancoDados.getCliente());
        } else {
            return Optional.empty();
        }
    }

    //TODO Fazer a exclusão de cliente

    public void excluir(String excluirCliente) {

        int clienteExclusao = -1;
        for (int i = 0; i < bancoDados.getCliente().length; i++) {

            Cliente cliente = bancoDados.getCliente()[i];
            if (cliente.getExcluir().equals(excluirCliente)) {
                clienteExclusao = i;
                break;
            }
        }

        if (produtoExclusao != -1) {
            bancoDados.removerProduto(produtoExclusao);
            System.out.println("Produto excluído com sucesso.");
        } else {
            System.out.println("Produto inexistente.");
        }
    }


    //TODO Fazer a inclusão de cliente

}
