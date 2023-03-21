import java.util.Scanner;//importa la libreria con la clase scanner 

public class reto_8 {

    public static void main(String[] args) {

        //Se declaran las variables a utilizar 
        int contador = 0;
        int maquina = 0;
        int intento = 0;

        //Se instancia la clase para que capture los datos ingresados 
        Scanner lectura = new Scanner(System.in);

        //se genera un numero random para adivinar
        maquina = (int) (Math.random()*100)+1;
        
        //se crea un iclo para hacer los 10 intentos
        for (int i = 0; i < 10; i++){

            //Se crea un contador para contar los intentos que ha hecho 
            contador = contador +1;

            //se pide un número 
            System.out.println("Ingrese un Numero");
            intento = lectura.nextInt();

            //se crea una  condicion que dice quien  gano el juego adivinando el número
            if(maquina==intento){
                System.out.println("Felicidades, Ganaste");
                System.out.println("Intentos: "+contador);
            //Se coloca break para cerrar el ciclo y terminar el juego
                break;

            //se imprime que el número es equivocado y dice que el numero es mas alto o bajo
            }else if(maquina > intento){
                System.out.println("No, el numero es mas alto que "+intento);
            }else if(maquina < intento){
                System.out.println("No, el numero es mas pequeño que "+intento);
            }
        }
                // se imprime quien  perdio en el juego 
                System.out.println("perdiste todas las oportunidades");
//se limpia el buffer 
                lectura.close();



    }
    
}
