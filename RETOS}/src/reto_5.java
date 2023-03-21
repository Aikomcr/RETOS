import java.util.Scanner;//importa la libreria con la clase scanner 
// se crea la clase 
public class reto_5 {

    public static void main(String[] args) {

        //Se declaran variables a utiliar 
        int productos = 0;
        double precioProducto = 0;
        double Impuesto = 0;
        String vendedor, comprador;
        double totalCompra = 0;;
        int i = 0;
        int documento;
        int contador = 0;
        double Acumulador = 0;

        try (//se instancia clases scanner que captura los datos que inserta el usuario 
        Scanner lectura = new Scanner(System.in)) {
            //se solicita  el nombre del vendedor
            System.out.println("Nombre del Cajero: "); 
            vendedor = lectura.nextLine();

            //se solictian los datos del comprador
             System.out.println("ingrese sus datos por favor");
                System.out.println("Nombre: "); 
                comprador = lectura.nextLine();
                System.out.println("documento: "); 
                documento = lectura.nextInt();
                System.out.println("productos: "); 
                productos = lectura.nextInt();

        // se crea un bucle for para pedir (n) cantidad de datos         
        for (i = 0; i < productos; i++){

            System.out.println("Precio del producto");

                precioProducto = lectura.nextDouble();

                //se almacenan los datos que se ingresan en las variables
                Acumulador = Acumulador + precioProducto;

                //cuenta las veces que se repita el bucle
                contador = contador + 1;

        }

        //se hace el procedimiento de calcular el iva 
        Impuesto = Acumulador * 0.19;

        //Se saca la operacion final y el total
        totalCompra = Acumulador + Impuesto;

                //Se imprimen los resultados de la compra 
                System.out.println("Hola, "+comprador+" Su documento es: "+documento);
                System.out.println("Compro "+contador+" productos y da "+totalCompra+" pesos");
                System.out.println("Su vendedor fue "+vendedor);
//se limpia el buffer 
                lectura.close();
        }
        }

    }

    


                
    
            

    
    

