public class PC{
    //Una clase vacia no sirve para nada
    //Hay que agregarles estados (atributos) y comportamientos
    //A las variables y metodos de una clase se les conoce como miembros de una clase
    //Para aplicar la encapsulacion (ocultamiento de informacion) hay que usar el modificador de acceso private


private String marca;
private double cantidadRam;
private int cantidadDiscos;
private double almacenamiento;
private double tamañoMonitor;
private double velocidadCPU;
private double velocidadRam;
private boolean tieneMouse;
private boolean tieneTeclado;
private boolean estaEncendida;
//Metodo constructor

public PC(){  //Metodo constructor por defecto (Sin parametros)
              //El proposito del metodo constructor es poder

    System.out.println("Se creo un objeto constructor por defecto");
}

public PC(String marca){
    this.marca= marca;
    System.out.println("Se creo un objeto utilizando el constructor con parametro marca");
}

public PC(String marca, int cantidadDiscos){
    this.marca = marca;
    this.cantidadDiscos = cantidadDiscos;
    System.out.println("Se creo el objeto PC de merca " + this.marca + ".");
    System.out.println("Esta PC cuenta con " + this.cantidadDiscos + " discos.");
}

}