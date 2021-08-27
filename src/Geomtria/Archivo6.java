
package Geomtria;

import java.util.ArrayList;
import java.util.Scanner;

public class Archivo6 {
    static ArrayList<Archivo5> figuras = new ArrayList<Archivo5>();
    
    static Scanner consola = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opc = 0;
        
        do {
            System.out.println("*** MENU GEOMETRICO ***");
            System.out.println("01. Creacion de Figura Geometrica");
            System.out.println("02. Informacion de la Figura");
            System.out.println("03. Area y Perimetro");
            System.out.println("04. Salir");
            System.out.println("Escoge una Opción: ");
            opc = consola.nextInt();
            
            switch(opc){
                case 1:
                    Menu();  
                    break;
                case 2:
                    if (figuras.isEmpty()) {
                        System.out.println("No hay figuras disponibles !!!\n");
                        
                    }
                    else{
                        for (Archivo5 arg : figuras) {
                        arg.ladosDiferentes();                        
                        }
                        System.out.println(figuras.toString());
                    }
                    
                    
                    break;
                case 3:
                    
                    for (Archivo5 variable : figuras) {
                        variable.ladosDiferentes();
                        variable.calcularArea();
                        variable.calcularPerimetro();                        
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;                    
                default:
                    System.out.println("Digita la Opcion Correcta!!!\n");
                    break;
                
            }
            
            
        } while (opc!=4);
        
    }
    //Metodos Auxiliares
    public static void Menu(){
        int opc=0;
        double radio;
        String color;
        double lado1;
        double lado2;
        double base;
        double altura;
        String nombre = null;
        
        do {
            System.out.println("Crear Figura");
            System.out.println("01. Circulo");
            System.out.println("02. Cuadrado");
            System.out.println("03. Triangulo");
            System.out.println("04. Salir..");
            opc = consola.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("Digita el Radio del Circulo: ");
                    radio = consola.nextDouble();
                    Archivo2 circulo = new Archivo2(radio);
                    figuras.add(circulo);
                    break;
                case 2:
                    //nombre = "CUADRADO";
                    System.out.println("Digita el Lado 1: ");
                    lado1 = consola.nextDouble();
                    System.out.println("Digita el Lado 2: ");
                    lado2 = consola.nextDouble();
                    System.out.println("Digita un Color: ");
                    consola.nextLine();
                    color = consola.nextLine();
                    Archivo3 cuadrado = new Archivo3(nombre,color,lado1,lado2);
                    figuras.add(cuadrado);
                    break;
                case 3:
                    //nombre = "TRIANGULO";
                    System.out.println("Digita la base: ");
                    base = consola.nextDouble();
                    System.out.println("Digita la altura: ");
                    altura = consola.nextDouble();
                    System.out.println("Digita un Color: ");
                    consola.nextLine();
                    color = consola.nextLine();
                    Archivo4 triangulo = new Archivo4(nombre,color,base,altura);
                    figuras.add(triangulo);
                    break;
                case 4:
                    System.out.println("Saliendo...\n");
                    break;
                default:
                    System.out.println("Digita la opcion correcta !!!\n");
                    break;
            }
            
        } while (opc!=4);
        
    }
    
}
