package Util;

import Model.Costumer;
import javax.swing.JOptionPane;


public class ClientForm {
    
      public boolean ClientValidation(Costumer c){
          //Tentar incluir uma Design Patern
          
          
          //Incluir mais validações... Incluir focus.
          if(c.getClientAddress().isEmpty() || c.getClientAddress().equals("")){
              JOptionPane.showMessageDialog(null, "Preencha o endereço do cliente.");
          return false;
          }
          if(c.getClientName().isEmpty() || c.getClientName().equals("")){
              JOptionPane.showMessageDialog(null, "Preencha o nome do cliente.");
          return false;
          }
          if(c.getClientEmail().isEmpty() || c.getClientEmail().equals("")){
              JOptionPane.showMessageDialog(null, "Preencha o email do cliente.");
          return false;
          }
          if(c.getClientCode().isEmpty() || c.getClientCode().equals("")){
              JOptionPane.showMessageDialog(null, "Preencha o código do cliente.");
             return false; 
          }    
          
      return true;
      }
    
}
