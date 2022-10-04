/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetote;

import javax.swing.JOptionPane;

public class Determinante implements Interfacesita {
    @Override
    public String matricita(int a, int b) {
        int matriz[][]= new int [a][a];
        int matrizota[][]=new int[5][3];
        String imprimir="";
        if(a==3){            
            for (int i=0; i<a; i++){
                for(int j=0; j<a; j++){
                    matriz [i][j]=(int)(Math.random() *(50 - 0)+0);//Estamos creando la matriz
                    imprimir = imprimir+" "+matriz[i][j];
                }//Guarda los numeros de la  matriz  
            }
            for (int i=0; i<5; i++){
                for(int j=0; j<3; j++){
                    if(a>i){
                        matrizota[i][j]=matriz[i][j];
                    }
                    else{
                        matrizota[i][j]=matriz[i-3][j];
                    }
                }
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        
                    }
                }
            }
        }       
        else{
            JOptionPane.showMessageDialog(null, "La matriz no es de dimensiones 3x3");
        }
        return imprimir;
    
    }
}
