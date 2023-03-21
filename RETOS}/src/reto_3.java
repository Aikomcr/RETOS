import java.util.Scanner;//importa la libreria con la clase scanner 
// se crea la clase 
public class reto_3 {
    public static void main(String[] args) throws Exception {

        //Se declaran variables a utilizar 
        int maquina,perJugada;
        double Acumulado = 0;  
        String jugador;
        final double Apuesta = 100000;
           

        //Se instancia la clase  sacnner para que capture los fatos ingresados 
        Scanner lectura = new Scanner(System.in);

        //Se solicta el nombre del jugador
        System.out.println("Nombre del Jugador: ");
        System.out.print("Jugador: "); jugador = lectura.nextLine();

        //se imprime las opciones que hay en el juego 
        System.out.println("Sello: 1, Cara: 2");
        
        //se imprime la entrada del juego 
        System.out.print("Jugada: "); perJugada = lectura.nextInt();

        //la  mquina relaiza el juego 
        maquina = (int) (Math.random() *2)+1;

        //Se usa un ciclo  Switch para tener varias situaciones
        switch (perJugada) {

            case 1: 

                //otro ciclo Switch para comparar la jugada anterior con la de la maquina
                switch (maquina){
                    case 1: System.out.println("Ganaste $10.000"); 
                    Acumulado = Apuesta + 10000; break;
                    case 2: System.out.println("Perdiste $10.000");     
                    Acumulado = Apuesta - 10000;break;
                    default: System.out.println("Invalido");break;
                        
                }break;
                case 2:
    
                    switch (maquina){
                        case 1:  System.out.println("Perdiste $10.000");     
                        Acumulado = Apuesta - 10000;break;
                        case 2: System.out.println("Ganaste $10.000"); 
                        Acumulado = Apuesta + 10000; break; 
                        default: System.out.println("Invalido");
                            break;
                    }break;                    
        }
// se imrpime el resultado del juego
        System.out.println("El jugador: "+jugador+" Termino con: "+Acumulado);
// se limpia el buffer 
        lectura.close();

    }
}
