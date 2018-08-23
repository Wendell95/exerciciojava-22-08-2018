/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class usuario {
  
    
    public static void main (String[]args){
    
    
    String n = JOptionPane.showInputDialog(null, "Digite o nome");

    String i = JOptionPane.showInputDialog(null, "Qual e a sua idade?");
            
    int ii = Integer.parseInt(i);
       

    
    if (ii >=18){
        JOptionPane.showMessageDialog(null, n+ " apto pra tentar dirigir ");
    }   
    else if (ii < 18){
        JOptionPane.showMessageDialog(null, n+ " você ainda não pode dirigir, você tem apenas " +ii+ " anos ");
        
        
        
        
        
    }}}
            

