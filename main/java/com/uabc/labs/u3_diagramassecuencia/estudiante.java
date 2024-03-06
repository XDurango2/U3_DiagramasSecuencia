/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.u3_diagramassecuencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author us
 */
public class estudiante {
    private int matricula;
    private String nombre;
    private List<curso> cursosInscritos;

    public estudiante(int matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.cursosInscritos=new ArrayList<>();
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public List<curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(List<curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }
    public void agregarCurso(curso cursoNuevo){
        cursosInscritos.add(cursoNuevo);
    }
    public void removerCursos(curso cursoARemover){
        cursosInscritos.remove(cursoARemover);
    }

    @Override
    public String toString() {
        return "estudiante{" + "matricula=" + matricula + ", nombre=" + nombre + '}';
    }
    
    
    
}
