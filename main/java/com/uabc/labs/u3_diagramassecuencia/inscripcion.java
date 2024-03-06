/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.u3_diagramassecuencia;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hector Duran
 */
public class inscripcion {
    HashMap<String,curso> inscripcion;
    HashMap<Integer,estudiante> alumnos = new HashMap<>();

    public inscripcion() {
        this.inscripcion = new HashMap<>();
        this.alumnos = new HashMap<>();
        createCursos();
        registroAlumnos();
        inscribir();
    }
    
    public void createCursos(){
        String[] nombres = {"Algebra","POO","Electronica","calculo"};
        double[] horaInicio = {11.0,12.0,13.0,14.0,15.0};
        double[] horafinal = {12.0,13.0,14.0,15.0,16.0};
        Random rd = new Random();
        for(int k=0;k<nombres.length;k++){
            curso c1 = new curso(nombres[k],horaInicio[k],horafinal[k],30,rd.nextInt(2000));
            inscripcion.put(nombres[k], c1);
        }
        
    }
    public boolean inscribirAlumno(String curso,estudiante e1){
        return inscripcion.get(curso).agregarEstudiante(e1);
    }
    public boolean bajaAlumno(String curso,estudiante e1){
        return inscripcion.get((String)curso).removerEstudiante(e1);
    }
    public void registroAlumnos(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1  =new Scanner(System.in);
        System.out.println("ingrese datos del alumno: \n matricula:");
        int matricula = sc.nextInt();
        System.out.println("nombre:");
        String nombre = sc1.nextLine();
        estudiante e1 = new estudiante(matricula,nombre);
        alumnos.put(matricula, e1);
    }
    public void inscribir(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("ingrese matricula:");
        int mat = sc.nextInt();
        System.out.println("ingrese una de las opciones: inscripcion(1) \n baja(2) \n salir(3)");
        int opc = sc.nextInt();
        while(opc!=3){
            switch(opc){
                case 1:
                    System.out.println("ingrese el nombre de la materia:");
                    String materia = sc1.nextLine();
                    inscribirAlumno(materia,alumnos.get(mat));
                    break;
                case 2:
                    System.out.println("ingrese el nombre de la materia:");
                    materia = sc1.nextLine();
                    bajaAlumno(materia,alumnos.get(mat));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("error: opcion invalida, intente nuevamente");
                    break;
                
                    
            }
            System.out.println("ingrese una de las opciones: inscripcion(1) \n baja(2) \n salir(3)");
            opc = sc.nextInt();
        }
    }
}
