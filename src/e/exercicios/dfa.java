package e.exercicios;

/**
 *
 * @author Fenias
 */
public class dfa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int leu = 15;
       switch (leu)
        {
           case 1:
               System.out.println("Nao é o leu!");
               ;break;
           case 3:
                 System.out.println("Nao é ele!");
                ;break;
           case 15:
                 System.out.println("E o leu!"); 
                ;break;
           default: System.out.println("Deveria ser ele");     
        }
    }
    
}
