/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rcalves.model;

/**
 * @author fagnerdin
 */
public class Calculo {
     private int num;
     private int den;
     private double res;
    
     public Calculo(){
     }

     public double soma(int n1, int n2){
         this.res = n1 + n2;         
         return this.res;
     }
     
     
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public double getRes() {
        return  res;
    }
    
    public void setRes(double res) {
        this.res = res;
    }
            
}
