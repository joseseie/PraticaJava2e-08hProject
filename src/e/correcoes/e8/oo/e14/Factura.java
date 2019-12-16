
package e.correcoes.e8.oo.e14;

/**
 *
 * @author joseseie
 * @author Horcha Chambule
 * @author Abdul Rasac
 * @author Micaela Freitas
 * @author Nicolas Muchate
 * @author Hassan Mutola
 * @author Iben Enky
 */
public class Factura {
 
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Factura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTotalFatura () {
        
        int qtd = this.quantidade > 0 ? this.quantidade : 0;
        double preco = this.preco > 0 ? this.preco : 0.0;
        
        return qtd * preco;
    }

    @Override
    public String toString() {
        return "Factura{" + "numero=" + numero + ", descricao=" + descricao + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }
   
    
   

    
    
}
