/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejerc6;

import java.util.Locale;
import java.util.Scanner;


public class Cafetera {
    
    private int capacidadMaxima;
    private int cantidadActual;
    
    public Cafetera(){
        
    }
    public void Cafetera(int capacidadMaxima, int cantidadActual){
       
        this.capacidadMaxima=capacidadMaxima;
        this.cantidadActual=cantidadActual;
        
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    public void llenarCafetera (){
        
        capacidadMaxima=cantidadActual;
        System.out.println("cafetera llena");
        
    }
    public void servirTaza (int tamaño){
        
        if (cantidadActual==0){
            System.out.println("no hay café");
        }
        else if (cantidadActual<=tamaño){
            
            tamaño=cantidadActual;
            cantidadActual=0;
            System.out.printf("la taza no se lleno por completo solo hasta %d de café\n",tamaño);
            
        }else{
            System.out.println("la taza se llenó completamente");
            cantidadActual=tamaño;
        }
        
    }
    
    public void vaciarCafetera (){
        cantidadActual=0;
        System.out.println("cafetera vacia");
    }
    
    public void agregarCafe (int cantidad){
        
        
        
        Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("ingrese la cantidad de café");
        
        cantidad=leer.nextInt();
        
        if ((cantidad+cantidadActual)>capacidadMaxima){
            
            cantidadActual=capacidadMaxima;
            System.out.println("sobró "+((cantidad+cantidadActual)-capacidadMaxima)+" de café");
        }else{
            System.out.println("café agregado");
            cantidadActual+=cantidad;
        }
        
    }
}
