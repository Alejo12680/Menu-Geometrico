
package Geomtria;

import static java.lang.Math.pow;
import java.text.DecimalFormat;

//Hija Figura Circunferencia
public class Archivo2 extends Archivo5{
    
    private double radio;
    
    //Constructor
    public Archivo2() {
    }

    public Archivo2(double radio) {
        this.radio = radio;
    }

    
    //metodos 
    @Override
    public void calcularArea() {
        DecimalFormat df = new DecimalFormat("###.##");
        double area = Math.PI*pow(radio,2);
        System.out.println("El Area del circulo es "+ df.format(area)+" cm2");
    }

    @Override
    public void calcularPerimetro() {
        DecimalFormat df = new DecimalFormat("###.##");
        double perimetro = 2*Math.PI*radio;
        System.out.println("El Perimetro del circulo es "+ df.format(perimetro)+" cm2\n");
    }

    //Getter and Setter

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NOMBRE = CIRCULO");
        sb.append(", RADIO = ").append(radio);
        sb.append('\n');
        return sb.toString();
    }
    
   
    
}
