package com.mycompany.calculadora_01;

/**
 *
 * @author David
 */
import javax.swing.JOptionPane;
public class Calculadora_01 {

    public static void main(String[] args) {
        //opcion solicitada por el ususario
        String opcion;
        opcion = JOptionPane.showInputDialog("Seleccione la operacion deseada:"
                + "\n1 - Suma:"
                + "\n2 - Resta:"
                + "\n3 - Multiplicación:"
                + "\n4 - División:"
                + "\n5 Potencia:"
                + "\n6 - Raíz Cuadrada");
        
        int opt;
        opt = Integer.parseInt(opcion);
        
        if(opt == 1){
            String n1;
            String n2;
            n1 = JOptionPane.showInputDialog("Digite primer numero:");
            n2 = JOptionPane.showInputDialog("Digite segundo numero:");
            
         double numero1 = Double.parseDouble(n1);
         double numero2 = Double.parseDouble(n2);
         
         double resultado = numero1 + numero2;
         String msg;
         msg = "El resultado de la operación es: "+resultado;
         JOptionPane.showMessageDialog(null, msg);
        
        }
        if(opt == 2){
            String n1;
            String n2;
            n1 = JOptionPane.showInputDialog("Digite primer numero:");
            n2 = JOptionPane.showInputDialog("Digite segundo numero:");
            
         double numero1 = Double.parseDouble(n1);
         double numero2 = Double.parseDouble(n2);
         
         double resultado = numero1 - numero2;
         String msg;
         msg = "El resultado de la operación es: "+resultado;
         JOptionPane.showMessageDialog(null, msg);
        }
        if(opt == 3){
            String n1;
            String n2;
            n1 = JOptionPane.showInputDialog("Digite primer numero:");
            n2 = JOptionPane.showInputDialog("Digite segundo numero:");
            
         double numero1 = Double.parseDouble(n1);
         double numero2 = Double.parseDouble(n2);
         
         double resultado = numero1 * numero2;
         String msg;
         msg = "El resultado de la operación es: "+resultado;
         JOptionPane.showMessageDialog(null, msg);
        }
    if(opt == 4){
            String n1;
            String n2;
            n1 = JOptionPane.showInputDialog("Digite primer numero:");
            n2 = JOptionPane.showInputDialog("Digite segundo numero:");
            
         double numero1 = Double.parseDouble(n1);
         double numero2 = Double.parseDouble(n2);
         
         double resultado = numero1 / numero2;
         String msg;
         msg = "El resultado de la operación es: "+resultado;
         JOptionPane.showMessageDialog(null, msg);
    }
   if(opt == 5){
            String n1;
            String n2;
            n1 = JOptionPane.showInputDialog("Digite primer numero:");
            n2 = JOptionPane.showInputDialog("Digite segundo numero:");
            
         double numero1 = Double.parseDouble(n1);
         double numero2 = Double.parseDouble(n2);
         
         double resultado = numero1 + numero2;
         String msg;
         msg = "El resultado de la operación es: "+resultado;
         JOptionPane.showMessageDialog(null, msg);}
    
    if(opt == 6){
            int n1;
            
            n1 = JOptionPane.showInputDialog("Digite el numero para obtener la raiz:");
            
            
         double numero1, raiz;
         
         cap = new Scanner (System.in);
         numero1 = cap.nextDouble();
         
         raiz = Math.sqrt(numero1)
         

      
         String msg;
         msg = "El resultado de la operación es: "+numero1+"es +raiz";
         JOptionPane.showMessageDialog(null, msg);}
    }
}
    
