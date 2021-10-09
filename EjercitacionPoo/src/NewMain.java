
import com.sun.xml.internal.txw2.TXW;
import java.awt.Component;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class NewMain {

  
    public static void main(String[] args) {
      String pass = "root";
    String dialogpass="";
   
    JPasswordField contraseña = new JPasswordField();
//    JOptionPane.showConfirmDialog(null, contraseña, "Ingrese contraseña", JOptionPane.OK_CANCEL_OPTION);
    
    do{
       
if(JOptionPane.showConfirmDialog(null, contraseña, "Ingrese contraseña", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
    dialogpass = new String(contraseña.getPassword());
         if (dialogpass.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "La contraseña se encuentra vacia");
           
    } else if (dialogpass.equals(pass)) {
            System.out.println("Entraste");

        } else {
            if(JOptionPane.showConfirmDialog(null, contraseña, "Contraseña Incorrecta: Escriba nuevamente la contraseña", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
    dialogpass = new String(contraseña.getPassword());}
            if (dialogpass.equals(pass)) {
                 System.out.println("Entraste");

            } else {
                  JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
            }
        }
}else System.out.println("Ha apretado la opción Cancelar");
        
    } while (dialogpass.equals(pass)==false);
        
 
    }
    
  
}
    
