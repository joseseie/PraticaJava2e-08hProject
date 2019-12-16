
package e.correcoes.e8.oo.e14;

import java.util.Scanner;

/**
 *
 * @author joseseie
 */
public class FaturaTeste {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        // Leitura
        String numero = s.nextLine();
        
        String desc = s.nextLine();
        
        int qtd = s.nextInt();
        
        double preco = s.nextDouble();
        
        
        // inicializacao
        Factura f1 = new Factura(numero, desc, qtd, preco);
        
        
        // testes
        double totalFac = f1.getTotalFatura();
        
        System.out.println("Valor total da factura: " + totalFac);
        
        System.out.println("Factura: " + f1.toString());
        
    }
    
}
