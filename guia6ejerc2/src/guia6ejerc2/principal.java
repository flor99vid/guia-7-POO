/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio)
 */
package guia6ejerc2;


public class principal {

    
    public static void main(String[] args) {
        
        Circunferencia circunferencia = new Circunferencia();
        
        circunferencia.establecerradio(20);
        System.out.println(circunferencia.obternerradio());
        
        circunferencia.area();
        circunferencia.perimetro();
       Circunferencia circunferencia1=new Circunferencia();
       
       circunferencia1.crearCircunferencia();
       
       circunferencia1.area();
       circunferencia1.perimetro();
        
    }
    
}
