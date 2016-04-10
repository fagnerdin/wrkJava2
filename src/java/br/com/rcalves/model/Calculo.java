/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rcalves.model;

import java.text.DecimalFormat;
import javafx.scene.control.Alert;

/**
 * @author fagnerdin
 */
public class Calculo {
     private double num;
     private double den;
     private double res;
    
     public Calculo(){
     }

     public String divisao(String n1, String n2){  
        DecimalFormat decFormat = new DecimalFormat("#.##");         
        
        if(n1.contains(",") || n2.contains(",")){
            return "<p style='color: red;'>Utilize ponto ao invés de virgula...</p>";
        }
        
         if( Double.parseDouble(n1) == 0){
             return "tente outro numero";             
         }else{
         
                this.setNum(Double.parseDouble(n1));
                this.setDen(Double.parseDouble(n2));        

                this.setRes(this.getNum() / this.getDen());

                String strString = 
                        "<p>O resultado de <b>" + decFormat.format(this.getNum()) + "</b> dividido por <b>" +  decFormat.format(this.getDen()) + "</b>" 
                        + " é <b>" + String.valueOf(decFormat.format(this.getRes())) + "</b></p>";

                return strString;
         }
     }
     
     
    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getDen() {
        return den;
    }

    public void setDen(double den) {
        this.den = den;
    }

    public double getRes() {
        return  res;
    }
    
    public void setRes(double res) {
        this.res = res;
    }

}
