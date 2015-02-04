

package arraylistcole;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Cole {
    private String nome;
    private int nota;

    ArrayList<Cole>alum= new ArrayList<Cole>();
    
    public Cole() {
    }

    public Cole(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Cole{" + "nome=" + nome + ", nota=" + nota + '}';
    }
    
    public static int menu(){
        int opcion= Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n"+
                                                           "1->crear lista\n"+ 
                                                           "2->mostrar\n"+    
                                                           "3->añadir elemento\n"+
                                                           "4-> borrar elemento\n"+
                                                           "5->ordenar\n"+
                                                           "6->salir"
                                                           ));
        return opcion;
    }
    public String pedirNombre(){
        String nom= JOptionPane.showInputDialog("nombre");
        return nom;
    }
    public int pedirNotas(){
        int not=Integer.parseInt(JOptionPane.showInputDialog("nombre"));
        return not;
    }
    public void crearArray(){
        String auxNombre;
        int auxNota;
        auxNombre=this.pedirNombre();
        while(auxNombre.compareToIgnoreCase("fin")!=0){
            auxNota=this.pedirNotas();
            alum.add(new Cole(auxNombre,auxNota));
            auxNombre=this.pedirNombre();
        }
            
        
    }
    public void mostrar(){
        for(Cole al:alum)
            JOptionPane.showMessageDialog(null, al.toString());
    }
}
