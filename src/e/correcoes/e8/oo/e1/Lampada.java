
package e.correcoes.e8.oo.e1;

/**
 *
 * @author joseseie
 * @author Horcha Chambule
 * @author Abdul Rasac
 * @author Francisco Domalamo
 * @author Nicolas Muchate
 * @author Hassan Mutola
 * 
 */
public class Lampada {
    
    private String cor;
    private boolean estado;
    private String tipo;
    private double voltagem;
    private byte grauDeLuminosidade;

    // Construtores
   
    public Lampada(String cor, boolean estado, String tipo, double voltagem, byte grauDeLuminosidade) {
        this.cor = cor;
        this.estado = estado;
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.grauDeLuminosidade = grauDeLuminosidade;
    }

    public Lampada() {
    }

    
    // Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public byte getGrauDeLuminosidade() {
        return grauDeLuminosidade;
    }

    public void setGrauDeLuminosidade(byte grauDeLuminosidade) {
        this.grauDeLuminosidade = grauDeLuminosidade;
    }

    // Metodo toString ()
    @Override
    public String toString() {
        return "Lampada{" + "cor=" + cor + ", estado=" + estado + ", tipo=" + tipo + ", voltagem=" + voltagem + ", grauDeLuminosidade=" + grauDeLuminosidade + '}';
    }
    
    // Metodos adicionads
    
    public void ligar () {
        this.setEstado(true);
    }
    public void desligar () {
        this.setEstado(false);
    }
    
    
    
}
