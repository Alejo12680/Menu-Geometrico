
package Geomtria;


//Hija figura Cuadrilatero
public class Archivo3 extends Archivo5{
    
    private double lado1;
    private double lado2;    
    
    //Constructor
    public Archivo3() {
    }

    public Archivo3(String nombre, String color,double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //metodos
    @Override
    public void calcularArea() {
        double area = lado1*lado2;
        System.out.println("El Area del " + getNombre() +" es "+area+ " cm2");
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = (lado1*2)+(lado2*2);
        System.out.println("El Perimetro de " + getNombre()+" es " + perimetro +" cm2\n");
    }

    @Override
    public void ladosDiferentes() {
        if (lado1 != lado2) {
            nombre = "RECTANGULO";
                       
        }
        else if (lado1 == lado2){
            nombre = "CUADRADO";
            
            
        }
        
    }

    //Getter and Setter

    public double getLado1() {
        return this.lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("LADO 1 = ").append(lado1);
        sb.append(" LADO 2 = ").append(lado2);
        sb.append('\n');
        return sb.toString();
    }
    
      
    
}
