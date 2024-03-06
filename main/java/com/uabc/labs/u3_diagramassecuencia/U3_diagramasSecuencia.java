/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uabc.labs.u3_diagramassecuencia;

import java.util.Scanner;

/**
 *
 * @author Hector Duran
 */
public class U3_diagramasSecuencia {

    public static void main(String[] args) {
        System.out.println("ingrese una de las siguientes opciones \n medicion de sensores(1) \n inscripcion de estudiantes(2) \n salir(3)");
        Scanner sc = new Scanner(System.in);
        int opc = sc.nextInt();
        switch(opc){
            case 1:
            dashboard d1 = new dashboard();
            break;
            case 2:
                inscripcion i1 = new inscripcion();
                break;
            case 3:
                break;
        }
        
    }
}
