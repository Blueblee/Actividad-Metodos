/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrometodos;

import java.util.Scanner;

/**
 **
 * @author Alumno
 */
public class AreaPerimetroMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir metodos
        // Definir variables
        double base, altura, ladoTi, lado2Ti;
        int num, num2 = 0;
     
        Scanner teclado = new Scanner (System.in);
        //Menú
        /*
        *Triangulo - hacer otra opcion con el tipo de triangulo 
        *Equilatero, isosceles o escaleno
        *Rectangulo
        */
        System.out.println("Seleccione una opción \n" + "1.Triángulo \n" + "2.Rectámgulo");
             //selección de opción
         num = teclado.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("Seleccione el tipo de triángulo");
                System.out.println("1.Equilatero");
                System.out.println("2.Isosceles");
                System.out.println("3.Escaleno");
                num2 = teclado.nextInt();
                    switch (num2) {
                        case 1:
                            System.out.println("Introduzca el valor de la base");
                            base = teclado.nextInt();
                            System.out.println("Introduzva el valor de la altura");
                            altura = teclado.nextInt();
                            //realizar operación
                            String mensaje;
                            mensaje= "El valor del área es: " + doAreaTi(base,altura) + "\n";
                            mensaje += "El valor del perimetro es: " + doPeriTiEqui(base);
                            System.out.println(mensaje);
                            break;
                        case 2:
                            System.out.println("Introduzca el valor de la base");
                            base = teclado.nextInt();
                            System.out.println("Introduzva el valor de la altura");
                            altura = teclado.nextInt();
                            System.out.println("Introduzca el valor de un lado");
                            ladoTi = teclado.nextInt();
                            //Realizar operación
                            mensaje= "El valor del área es: " + doAreaTi(base,altura) + "\n";
                            mensaje += "El valor del perimetro es: " + doPeriTiIsos (base, ladoTi);
                            System.out.println(mensaje);
                            break;
                        case 3:
                            System.out.println("Introduzca el valor de la base");
                            base = teclado.nextInt();
                            System.out.println("Introduzva el valor de la altura");
                            altura = teclado.nextInt();
                            System.out.println("Introduzca el valor de un lado");
                            ladoTi = teclado.nextInt();
                            System.out.println("Introduzca el valor del segundo lado");
                            lado2Ti = teclado.nextInt();
                            //Realizar operacion
                            mensaje= "El valor del área es: " + doAreaTi(base,altura) + "\n";
                            mensaje += "El valor del perimetro es: " + doPeriTiEsca (base, ladoTi, lado2Ti);
                            System.out.println(mensaje);
                            break;
                        default:
                            System.out.println("Opción no valida");
                            break;
                    }
                break;
            case 2:
                System.out.println("Introduzca el valor de la base");
                base = teclado.nextInt();
                System.out.println("Introduzva el valor de la altura");
                altura = teclado.nextInt();
                //realizar operación
                String mensaje;
                mensaje= "El valor del área es: " + doAreaRe(base,altura) + "\n";
                mensaje += "El valor del perimetro es: " + doPeriRe(base,altura);
                System.out.println(mensaje);
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
    }
    //Metodo calcular area triangulo a= b* h/2
    public static double doAreaTi (double base,double altura){
        return (base * altura) /2;
    }
    //Metodo calcula perimetro triangulo equilatero
    public static double doPeriTiEqui (double base){
        return base * 3;
    }
    //Metodo calcula perimetro triangulo isoseles
    public static double doPeriTiIsos (double base, double ladoTi){
        return 2 * ladoTi + base ;
    }
    //Metodo calcula perimetro triangulo escaleno
    public static double doPeriTiEsca (double base, double ladoTi, double lado2Ti){
        return base + ladoTi + lado2Ti;
    }
    //Metodo calcula area rectangulo
    public static double doAreaRe (double base, double altura){
        return base * altura;
    }
    //Metodo calcula perimetro del rectngulo
    public static double doPeriRe (double base, double altura){
        return (base + altura) * 2;
    }
}
