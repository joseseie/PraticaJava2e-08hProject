
package e.exercicios;

/**
 *
 * @author joseseie
 * @author Iben Enky
 * @author Nicolas Muchate
 * @author Hassan Mutola
 * 
 * 
 */
public class Exercicios6 {            
    public static void main(String[] args) {
        
        // Exercícios. Atenção, depois de resolver todos os erros nesta classe. Execute a mesma para ver se está tudo a funcionar como deve ser.
        
        //01)
        for (int i =0; i < 10; i++) {
             int ii = 0;
        }
        
        // 02)
        for  (int i =0; i< 10; i++) {
             int j = 0;
             int dar = 0;
        }
        
        // 03) 
        int mes = 0;
        switch(mes) {
            case 1:
              // code block
              break;
            case 2:
              // code block
              break;
            default:
              // code block
        }
        
       //04)
       switch (mes)
        {
             case 3:
             //Java code
             ;
             case 4:
             //Java code
             ;
             default:
             //Java code
             ;
        }
        
        // 05)
        if (20 > 18) {
           System.out.println("20 is greater than 18");
        }
        
        // 06)
        int x= 20;
        int y = 18;
        if (x > y) {
          System.out.println("x is greater than y");
        }
        
        // 07) 
        if (true) {
           // block of code to be executed if the condition is true
        } else {
           // block of code to be executed if the condition is false
        }
        
        // 08)
        int time = 22;
        if (time < 10) {
          System.out.println("Good morning.");
        } else if (time < 20) {
          System.out.println("Good day.");
        } else {
          System.out.print("Good evening.");
        }
        // Outputs "Good evening."
        
        // 09)
        int i = 0;
        while (i < 5) {
          System.out.println(i);
          i++;
        }
       
        while(i > 5) {
          System.out.println(i);
          i--;
        }
        int k = 0;
        while (k<5) {
            //code block to be executed
            System.out.println("Olá Mundo!!"); 
            k++;
        }
        
        // 10)
        do {
            System.err.println("Cuidado o computador vai estragar!!!");
        }
        while (k<5);
        
        // 11) Coloque o que falta
        if(i < 6) {
            System.out.println(i); 

          ;
        }
        
        // 12) Indique a condição de paragem
        for (int j = 0; j < 10; j++) {
            if (i == 5) {   

                break; //parar o loop
            }
            System.out.println(i);
          }
        
        // 13) 
        System.out.println ("" + (0 + 10));
        System.out.println ("" +( 10 - 10));
        System.out.println ("" + (4 * 50));
        System.out.println ("" + (30 /11));
        System.out.println ("Eu tenho 15 anos");
        System.out.println ("" + (30* 3));
        System.out.println ("" + (310* 121));
        System.out.println (""+ (3 == 112));
    }
    
}
