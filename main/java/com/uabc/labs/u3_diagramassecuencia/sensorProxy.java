/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.u3_diagramassecuencia;

/**
 *
 * @author us
 */
public class sensorProxy {
    private TemperatureSensor ts;
    private lightSensor ls;
    public sensorProxy() {
        this.ts = new TemperatureSensor();
        this.ls  = new lightSensor();
        
    }
    public int updateDataTemp(){
    return ts.read();
                
    }
    public int updateDatalight(){
       
    return ls.read();
    }
    
}
