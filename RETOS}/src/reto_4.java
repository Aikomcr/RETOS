import java.util.Scanner;//importa la libreria con la clase scanner 
 // se crea la clase 
public class reto_4
{
    public static void main(String args[]) {

        //Se declaran las variables a utilizar
        int numeroUsuario;
        String jugador;
        int numeroRandom = (int)(Math.random() * 3) + 1;
        final double Apuesta = 100000;
        double Acumulado = 0;  

        //Se instancia la clase scanner para capturas los datos que ingresa el juegador
        Scanner lectura = new Scanner(System.in);

                //Se solicita  el nombre del jugador
                System.out.println("Nombre del Jugador: ");
                System.out.print("Jugador: "); jugador = lectura.nextLine();
 
        //Se mencionan los tipos de juego
        System.out.print("Opciones de Juego:");
        //Se ingresan los datos solicitados 
        System.out.println("Piedra = 1, Papel = 2 y Tijeras = 3"); numeroUsuario = lectura.nextInt();         
 
        //Se usa el switch como condicional para crear varias sistuaciones
        switch ( numeroRandom )
        {
            //Se imprime la situacion de la computadora jugando con piedra
            case 1: System.out.println("Piedra");
                
                switch ( numeroUsuario )
                {
                   case 1: //las opciones que hay según los datos ingresados 

                   System.out.println("Empataste"); break;

                   case 2: 
                   System.out.println("ganaste"); break;

                   case 3: 
                   System.out.println("Perdiste $10.000");     
                    Acumulado = Apuesta - 10000; break;
                }
                break;
 
            case 2: System.out.println("Papel");
                
                switch ( numeroUsuario )
                {
                   case 1: 
                   System.out.println("Perdiste $10.000");     
                    Acumulado = Apuesta - 10000; break;

                   case 2: 
                   System.out.println("Empataste"); break;

                   case 3: 
                   System.out.println("Ganaste"); break;

                }
                break;
 
            case 3: System.out.println("Tijeras");
                
                switch ( numeroUsuario )
                {
                   case 1: 
                   System.out.println("Ganaste"); break;

                   case 2: 
                   System.out.println("Perdiste $10.000");     
                    Acumulado = Apuesta - 10000; break;

                   case 3: 
                   System.out.println("Empataste"); break;

                }
                break;
        }
// se imprime el resultado del juego 
        System.out.println("El jugador: "+jugador+" perdio y Termino con: "+Acumulado);
        // se limpia el buffr 
    lectura.close();
    }
}
   
