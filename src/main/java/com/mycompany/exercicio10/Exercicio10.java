/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio10;

import javax.swing.JOptionPane;
public class Exercicio10 {

    public static void main(String[] args) {
        int a, b , resultado;
               
               a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a"));
               b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b"));
               
               resultado = a + b;
                       
               if(resultado > 10){
                   JOptionPane.showMessageDialog(null,"O Resultado é:" + resultado);
               }
    
    }
}

