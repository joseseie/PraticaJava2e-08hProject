
package e.correcoes.e8.oo.e1;

/**
 *
 * @author joseseie
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Lampada lampada1 = new Lampada("Vermelha", true, "Fluorescente", 45, (byte) 95);
        Lampada lampada2 = new Lampada("Vermelha", true, "Fluorescente", 45, (byte) 95);
        
        lampada1.toString();
        lampada2.toString();
        
        
        lampada1.ligar();
        lampada2.desligar();
        
        lampada1.temMesmaVoltagem(lampada2);
        lampada1.saoIguais(lampada2);
        
        lampada1.aumentarOuReduzirLuminosidade('+');
        lampada1.aumentarOuReduzirLuminosidade('+');
        lampada1.aumentarOuReduzirLuminosidade('+');
        
    }
    
}
