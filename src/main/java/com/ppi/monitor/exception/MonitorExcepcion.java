/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.exception;

/**
 *
 * @author paulaj
 */
public class MonitorExcepcion extends RuntimeException{
    
    private static final long serialVersionUID = 1L;
    
    public MonitorExcepcion (String message){
        super(message);
    }
    
    public MonitorExcepcion (String message,Throwable e){
        super (message, e);
    }
}
