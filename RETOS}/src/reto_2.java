import java.util.Scanner;

public class reto_2 {//se crea la clase 

    //se crea el metodo main para poder ejecutar el programa 
    public static void main(String[] args) {
        

         //la clase scanner es la que captura los datos que digita la enfermera 
            Scanner lectura = new Scanner(System.in);
          //se delcarana las variables a usar   
            String nomEnfermera, nomMama, nomBebe;
            int mesesBebe;
            Double pesoBebe, vacuna;
           
         //se imprime la solicitud de datos para que la enferma los ingrese 
        System.out.println("Por favor ingrese los siguientes datos del bebe");

          //se imprime el mensaje para que pueda ingresar los datos 
            System.out.println("Ingrese los siguientes datos");
          
            System.out.print(" Enfermera que lo atendio: "); 
                nomEnfermera = lectura.nextLine();//convirte los datos 

            System.out.print(" Nombre de la madre: "); 
                nomMama = lectura.nextLine();

            System.out.print(" Nombre del paciente: "); 
                nomBebe = lectura.nextLine();

            System.out.print(" Peso del bebe: "); 
            
                pesoBebe =(lectura.nextDouble());//convirte los datos de tipo string a double 
            System.out.print(" Meses de Nacido del Bebe: "); 
                mesesBebe =(lectura.nextInt());//convierte los datos de tipo string a tipo enteros 

            // se realiza la operacion para calcular cuanta dosis se le debe  de aplicar d la vacuna al bebe 
            vacuna = ((pesoBebe + 10) / (mesesBebe *  10) * 8);

             //se imprime los datos ingresados junto al total de dosis que se le debe aplicar al bebe 
            System.out.println("El nombre de le enfermera es : "+nomEnfermera);
            System.out.println("El nombre de la mamá es : "+nomMama);
            System.out.println("El nombre del bebe es: "+nomBebe);

            System.out.println("se tiene que aplicar en dosis al bebe: "+vacuna+" ml");
            //se limpia el buffer  
            lectura.close();
    }
}
