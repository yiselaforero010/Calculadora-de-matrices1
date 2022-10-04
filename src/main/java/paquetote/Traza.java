/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetote;

/**
 *
 * @author PCdoctor
 */
public class Traza implements Interfacesita{

    @Override
    public String matricita(int a, int b) {
        int matriz[][]= new int[a][a];
        String imprimir="";
        int x =0;
        String r="";
        for (int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                matriz [i][j]=(int)(Math.random() *(50 - 0)+0);//Estamos creando la matriz
                imprimir = imprimir+" "+matriz[i][j];
            }//Guarda los numeros de la  matriz  
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if(i==j){
                    x=x+matriz[i][j];
                }
            }
        }
        r=x+"";
        return r;
    }    
}
