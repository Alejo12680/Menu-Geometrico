
package Geomtria;

//Hija Figura Triangulos

import java.text.DecimalFormat;

public class Archivo4 extends Archivo5{
    
    private double base;
    private double altura;    
    
    //Constructor
    public Archivo4() {
    }

    public Archivo4(String nombre, String color,double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    //metodos    
    @Override
    public void calcularArea() {
        DecimalFormat df = new DecimalFormat("###.##");
        double area = (base*altura)/2;
        System.out.println("El Area de " + getNombre()+ " es " + df.format(area) + " cm2");
    }

    @Override
    public void calcularPerimetro() {
        DecimalFormat df = new DecimalFormat("###.##");
        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        double perimetro = hipotenusa+base+altura;
        System.out.println("El Perimetro de " + getNombre()+ " es " + df.format(perimetro) + " cm2\n");
    }

    @Override
    public void ladosDiferentes() {
       if (base != altura) {
            nombre = "ESCALENO";
            
            
        }
       else if (base == altura) {
            nombre = "EQUILATERO";
            
            
        }
    }

    
    //Getter and Setter

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("BASE = ").append(base);
        sb.append(" ALTURA = ").append(altura);
        sb.append('\n');
        return sb.toString();
    }
    
    
}
