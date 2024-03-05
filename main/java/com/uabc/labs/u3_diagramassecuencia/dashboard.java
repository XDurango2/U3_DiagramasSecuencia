/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.u3_diagramassecuencia;

import java.util.Scanner;

/**
 *
 * @author Hector Duran
 */
public class dashboard {
    private sensorProxy sp;
    public dashboard() {
        menu();
    }
    public void menu() {
    Scanner sc = new Scanner(System.in);
    int opc = 1;  // Inicializar opc fuera del bucle para evitar problemas

    while (opc != 3) {
        System.out.println("Bienvenido, ingrese una de las siguientes opciones:");
        System.out.println("Desplegar sensores (1)\nVer datos (2)\n salir(3)");
        opc = sc.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Sensores activados");
                this.sp = new sensorProxy();
                break;
            case 2:
                    int exit1= 0;
                    while(exit1!=1){
                        System.out.print("\rTemperatura: " + sp.updateDataTemp());
                        System.out.println("\rLuz: " + sp.updateDatalight());
                        System.out.println("si desea salir, presione 1:");
                    exit1=sc.nextInt();
                    }
                break;
            case 3:
                System.out.println("saliendo, espere");
                break;
            default:
                System.out.println("Opción incorrecta, saliendo");
                opc = 3;  // Reiniciar opc para que el bucle principal no se rompa
                break;
        }
    }
}

                
    }

    

