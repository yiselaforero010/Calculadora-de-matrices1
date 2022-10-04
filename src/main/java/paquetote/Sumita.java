
package paquetote;

public class Sumita implements Interfacesita {

    @Override
    public String matricita(int a, int b) {
        int matrizota[][]= new int [a][a];
        String imprimir="";//para que la matriz se vea de forma cuadrada
        for (int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                matrizota [i][j]=(int)(Math.random() *(50 - 0)+0);//Estamos creando la matriz
                imprimir = imprimir+" "+matrizota[i][j]; //Guarda los numeros de la  matriz  
            }
            imprimir=imprimir+"\n";//Salto de linea al terminar la anterior instruccion 
        }
        imprimir=imprimir+"\n";
        for (int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                matrizota [i][j]= matrizota [i][j]+b;
                imprimir = imprimir+" "+matrizota[i][j];  
            }
            imprimir=imprimir+"\n";
        }
        return imprimir;        
    }
    
}
 


