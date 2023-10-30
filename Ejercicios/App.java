import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner lector = new Scanner(System.in);

       PC miPC = new PC(); //Creando un objeto de tipo PC
                           //Instanciando un objeto de la clase PC
                           //Se utiliza el metodo constructor de la clase
                           //El operador new reserva espacio en memoria para guardar el objeto
                           
        PC miSegundaPC = new PC();

        System.out.print("Marca de la tercera PC:");
        String marca = lector.next();

        PC miTerceraPC = new PC(marca); 
        PC miCuartaPc = new PC("Dell", 2);            
       
        
        // System.out.print("Cuantos GB de almacenamiento tiene la PC?");
        // miPC.almacenamiento = lector.nextDouble();

        // System.out.print("Cuantos discos duros tiene la PC?");
        // miPC.cantidadDiscos = lector.nextInt();

        // System.out.println("Cuantos GB de almacenamiento tiene la Ram de la Pc?");
        // miPC.cantidadRam = lector.nextDouble();


        // miPC.estaEncendida = false;
        // miPC.marca = "Asus";
        // miPC.tamañoMonitor = 17.3;
        // miPC.tieneMouse = true;
        // miPC.tieneTeclado = true;
        // miPC.velocidadCPU = 3.2;
        // miPC.velocidadRam = 3600.00;




        lector.close();
    }
}
