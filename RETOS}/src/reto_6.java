import java.util.Scanner;//importa la libreria con la clase scanner 
//se crea la clase 
public class reto_6 {
    public static void main(String[] args) throws Exception {// se crea el metodo que ejecuta el programa 

        //Se declaran variables utilizar 
        int maquina,perJugada;
        double Acumulado = 0;  
        String jugador;
        int contador = 0;
        final double Apuesta = 100000;
        //se crea las variable que tine las vidas del juegador 
        int vidaJugador = 3;
           

        //Se instancia la clase  scanner para cpturas los datos que inserta el usario 
        Scanner lectura = new Scanner(System.in);

        //Se pide el nombre del juegador 
        System.out.println("Nombre del Jugador: ");
        System.out.print("Jugador: "); jugador = lectura.nextLine();

        // se crea un Bucle para repetir varias veces el juego
        while(vidaJugador  > 0){

        // se imprimen las opciones de Juego
        System.out.println("Sello: 1, Cara: 2");
        
        //se hace Entrada de la jugada
        System.out.print("Jugada: "); perJugada = lectura.nextInt();

        //la maquina hce su juego 
        maquina = (int) (Math.random() *2)+1;

        //se crea un contador para decir cuantas veces jugo la persona
        contador = contador + 1;

        //Se usa el bucle Switch para tener varias situaciones
        switch (perJugada) {

            case 1: 

                //otro Switch para comparar la jugada anterior con la de la maquina
                switch (maquina){
                    case 1: System.out.println("Ganaste $10.000"); 
                    Acumulado = Apuesta + 10000; break;
                    case 2: System.out.println("Perdiste $10.000");     
                    Acumulado = Apuesta - 10000;
                    //Se quita una vida al jugador porque perdio
                    vidaJugador = vidaJugador - 1; break;
                    default: System.out.println("Invalido");break;
                        
                }break;
                case 2:
    
                    switch (maquina){
                        case 1:  System.out.println("Perdiste $10.000");     
                        Acumulado = Apuesta - 10000;
                        vidaJugador = vidaJugador - 1; break;
                        case 2: System.out.println("Ganaste $10.000"); 
                        Acumulado = Apuesta + 10000; break; 
                        default: System.out.println("Invalido");
                            break;
                    }break;                    
        }

    }
// se impirme el resultado del juego 
        System.out.println("El jugador: "+jugador+" perdio todas sus vidas en "+contador+" intentos y Termino con: "+Acumulado);
// se limpia el buffer 
        lectura.close();

    }
}
