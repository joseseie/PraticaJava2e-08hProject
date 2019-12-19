package correcao13;

/**
 *
 * @author Fenias
 */
public class Pessoa {
    public String nome;
    private String endereco;
    private int anoDeNasc;

    public Pessoa(String nome, String endereco, int anoDeNasc) {
        this.nome = nome;
        this.endereco = endereco;
        this.anoDeNasc = anoDeNasc;
    }
    
    public Pessoa(){
        
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAnoDeNasc() {
        return anoDeNasc;
    }

    public void setAnoDeNasc(int anoDeNasc) {
        this.anoDeNasc = anoDeNasc;
    }
    
    
}
