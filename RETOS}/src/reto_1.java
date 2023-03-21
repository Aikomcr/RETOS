import java.util.Scanner;// importa la libreria con la clase scanner 

public class reto_1{// crea la clase 
    public static void main(String[] args) {// se crea el metodo main el que ejecuta el programa 
        
        Scanner lectura = new Scanner(System.in);//la clase scanner es el que captura los datos que la abuela digita o inserta 
        double gfahren, gCenti, gkelvin;// se declaran las variables a utilizar 

        System.out.println("Favor Ingresar los grados Fahrenheit");//se imprime el mensaje a la abuela requiriendo los datos 
        gfahren = lectura.nextDouble();//convierte los datos tipo string a double 

        gCenti = (gfahren - 32) / 1.8;//se realiza la operación para convertir los grados fahrengeit a grados centigrados 
        
        gkelvin = ((gfahren - 32)/1.8) + 273.15;// se ralizs la operacion para convertir los grados centigradso a grados kelvin 

     //se imprime el resultado mostrando un mensaje a la bauela 
       System.out.println("Los grados Fahrengrit en centigrados son : "+gCenti+" y en grados Kelvin son: "+gkelvin);
     // se limpia el buffer 
       lectura.close();
    }
    
}