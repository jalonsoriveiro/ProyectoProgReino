
  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progpreject;
import Reino.*;
/**
 *
 * @author Yo
 */
public class ProgPreject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Reino.valores obx = new Reino.valores();
        Reino.metodos met = new Reino.metodos();
        obx.toString();
        met.Fin();
        met.invertirMateriales();
        
        System.out.println(" s");
        obx.toString();*/
       
       metodos obj = new metodos();
       opciones opt = new opciones();
      // obj.toString();
      // obj.invertirMateriales();
      // obj.toString();
      // obj.recaudarImpuestos();
      // obj.toString();
    
       opciones opciones = new opciones();
      // int opcion=opciones.mostrarMenu();
      opt.jugar();
    }
    
}