

package arraylistcole;

/**
 *
 * @author Administrador
 */
public class ArrayListCole {

    public static void main(String[] args) {
        Cole obx=new Cole();
        int op;
        do{
          op=Cole.menu();
                  switch(op){
                      case 1:obx.crearArray();
                          break;
                      case 2:obx.mostrar();
                          break;
                      case 3:añadir();
                          break;
                      case 4:borrar();
                          break;
                      case 5:ordenar();
                          break;  
                      case 6:System.exit(0);
                          break;    
                  }
        }while (op!=6);
        
        
        
    }

}
