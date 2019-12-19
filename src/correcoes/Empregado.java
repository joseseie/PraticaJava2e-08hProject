package correcoes;

/**
 *
 * @author Fenias
 */
public class Empregado {
    public String nome;
    public String sobreNome;
    private double salMensal;

    public Empregado(String nome, String sobreNome, double salMensal) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salMensal = salMensal;
    }
    
    public Empregado(){
        
    }

    public double getSalMensal() {
        return salMensal;
    }

    public void setSalMensal(double salMensal) {
        this.salMensal = salMensal;
    }
    
}
