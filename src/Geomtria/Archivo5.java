
package Geomtria;

//Padre de FigurasGeometricas
public class Archivo5 implements Archivo1{
    protected String nombre;
    protected String color;

    //Constructor
    public Archivo5() {
    }

    public Archivo5(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    
    //Metodos interface
    @Override
    public void calcularArea() {
        System.out.println("");
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("");
    }

    @Override
    public void ladosDiferentes() {
        System.out.println("");
    }

  
    //Getter and Setter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NOMBRE = ").append(nombre);
        sb.append(", COLOR = ").append(color);
        sb.append(' ');
        return sb.toString();
    }
    
    
    
    
    
    
}
