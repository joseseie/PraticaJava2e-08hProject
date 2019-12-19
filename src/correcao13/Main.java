package correcao13;

/**
 *
 * @author Fenias
 */
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Main {
        
    Vector <Pessoa> x = new Vector<>();
    
        Scanner t = new Scanner(System.in);
        
    public void cadastrar(){
        Pessoa p;
        
        boolean preenche = false;
        
        do{
            if(preenche){
            p = new Pessoa();
            System.out.println("DIGITE O NOME: ");
            p.nome = t.next();
            System.out.println("DIGITE O INDERECO");
            p.setEndereco(t.next());
            System.out.println("DIGITE O ANO DE NASCIMENTO");
            p.setAnoDeNasc(t.nextInt());
            x.add(p);
            
          //  System.out.println("REGISTO FEITO COM SUCESSO! \n");
            }
        }while(preenche);
    }
    
    private void remover(){
        Pessoa h;
        
        System.out.println("DIGITE O NOME: ");
        String nome = t.nextLine();
        
        for (int i = 0; i < x.size(); i++) {
            h = (Pessoa) x.get(i);
            if(h.nome.equalsIgnoreCase(nome)){
                h.getEndereco();
                h.getAnoDeNasc();
 
                System.out.println("DESEJA MESMO REMOVE-LHO? \n Sim/Nao!");
                String resp= t.next();
                
               if(resp.equalsIgnoreCase("sim")){
                   x.removeElement(i);
               }
            }
        }
    }
    
    public void modificar(){
        Pessoa l;
        
        System.out.println("DIGITE O NOME: ");
        String nome = t.nextLine();
        
        for (int i = 0; i < x.size(); i++) {
            l = x.get(i);
            if(l.nome.equalsIgnoreCase(nome)){
                System.out.println("INTRODUZA O NOVO ENDERECO: ");
                l.setEndereco(nome);
                System.out.println("");
                
                System.out.println("INTRODUZA O ANO DE NASCIMENTO: ");
                l.setAnoDeNasc(t.nextInt());
                System.out.println("");
                
                x.setElementAt(l, i);
                
                System.out.println("ACTUALIZACAO FEITA COM SUCESSO");
            }
        }    
    }
    
    public void exibir(){
        Pessoa k;
        
        System.out.println("DIGITE O NOME: ");
        String nome = t.nextLine();
        
        for (int i = 0; i < x.size(); i++) {
            if(x.get(i).nome.equalsIgnoreCase(nome)){
                k = x.get(i);
                x.elementAt(i);
                k.getEndereco();
                k.getAnoDeNasc();
            }
        }    
    }
    
    public void escFich(){
        
        try{
            File f = new File("Pessoa.DAT");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(x);
            oos.close();
        }catch(Exception e){System.out.println("ERRO" + e.getMessage());}
    }
    
    public void leituraFIc(){
        
        try{
            File f = new File("Pessoa.DAT");
            FileInputStream fis= new FileInputStream(f);
            ObjectInputStream ois= new ObjectInputStream(fis);
            
            x = (Vector) ois.readObject();
            ois.close();
        }catch(Exception k){System.out.println("ERRO" + k.getMessage());}
    }
    
    public void Menu(){
        int g;
        
        do{
            System.out.println("1.CADASTRAR PESSOA: ");
            System.out.println("2.REMOVER PESSOA: ");
            System.out.println("3.MODIFICAR PESSOA: ");
            System.out.println("4.EXIBIR PESSOA: ");
            System.out.println("5.SAIR! ");
            
            g = t.nextInt();
            
            switch(g){
                case 1: cadastrar();escFich();break;
                case 2: remover();escFich();break;
                case 3: modificar();escFich();break;
                case 4: exibir();break;
                case 5: System.exit(0);
            }
        }while(true);
    }
    
    public Main(){
        leituraFIc();
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        m.Menu();
    }
}
