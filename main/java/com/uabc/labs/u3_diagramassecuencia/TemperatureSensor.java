/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.u3_diagramassecuencia;

import java.util.Random;

/**
 *
 * @author Hector Duran
 */
public class TemperatureSensor {
    private Random rd;
    public TemperatureSensor() {
        this.rd = new Random();
    }
    public int read(){
         int rinteger = rd.nextInt(29-15) + 15;
         return rinteger;
    }
    
}
