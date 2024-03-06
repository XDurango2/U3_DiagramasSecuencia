/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.u3_diagramassecuencia;

import java.util.HashMap;

/**
 *
 * @author Hector Duran
 */
public class curso {
    private int numeroCurso;
    private String nombre;
    private double horaInicio;
    private double horaFinal;
    private int lugares;
    private HashMap<Integer,estudiante> alumnos;

    public curso(String nombre, double horaInicio, double horaFinal, int lugares,int numeroCurso) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.lugares = lugares;
        this.numeroCurso=numeroCurso;
        this.alumnos = new HashMap<>(lugares);
    }
    
    public boolean agregarEstudiante(estudiante estudiante) {
        if (lugares > 0) {
            estudiante.agregarCurso(this);
            this.alumnos.put(estudiante.getMatricula(), estudiante);
            lugares--;
            System.out.println(estudiante + " inscrito en " + this.nombre);
            return true;
        } else {
            System.out.println("Error: grupo vacío, no se puede inscribir a " + estudiante);
            return false;
        }
    }
    public boolean removerEstudiante(estudiante e1) {
        estudiante estudianteRemovido = alumnos.remove(e1.getMatricula());

        if (estudianteRemovido != null) {
            lugares++;
            System.out.println(estudianteRemovido + " removido de " + this.nombre);
            return true;
        } else {
            System.out.println("Error: No se encontró el estudiante con la matricula: " + e1.getMatricula());
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getHoraInicio() {
        return horaInicio;
    }

    public double getHoraFinal() {
        return horaFinal;
    }

    public int getLugares() {
        return lugares;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("curso{");
        sb.append("nombre=").append(nombre);
        sb.append(", horaInicio=").append(horaInicio);
        sb.append(", horaFinal=").append(horaFinal);
        sb.append(", lugares=").append(lugares);
        sb.append('}');
        return sb.toString();
    }

    
    
}
