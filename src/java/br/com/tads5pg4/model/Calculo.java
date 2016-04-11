/*
 * 
 */
package br.com.tads5pg4.model;

import java.text.DecimalFormat;

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
        
        // testa vazio
        if(n1.isEmpty()||n2.isEmpty()){
            return "<p style='color: red;'>Faltou digitar o(s) numero(s)...</p>";
        }
        
        // testa se ta com virgula
        if(n1.contains(",") || n2.contains(",")){
            return "<p style='color: red;'>Utilize ponto ao invés de virgula...</p>";
        }
        
        // testa conversao double
         try {
            this.setNum(Double.parseDouble(n1));
            this.setDen(Double.parseDouble(n2));        
         } catch (Exception e) {
             return "<p style='color: red;'>Ops... tem certeza que digitou apenas numeros?</p><br />";
         }
        
         // verifica divisor zero
         if(this.getDen() == 0){
             return "<p style='color: red;'>Dividendo nao pode ser zero, amigo...</p>";
         }else{
         

        // seta resultado     
        this.setRes(this.getNum() / this.getDen());

        // monta resposta
        String strString = 
                "<p>O resultado de <b>" + decFormat.format(this.getNum()) + "</b> dividido por <b>" +  decFormat.format(this.getDen()) + "</b>" 
                + " é igual à <b><i>" + String.valueOf(decFormat.format(this.getRes())) + "</i></b></p>"
                + "<strong>" + decFormat.format(this.getNum()) + " ÷ " + decFormat.format(this.getDen()) + " = " + String.valueOf(decFormat.format(this.getRes())) + "</strong>"
                + "<br />"
                + "<br /><b>CLASSIFICAÇÃO</b>"
                + "<br /> " + verificaFracao()
                + "<br /> " + checkPrimo()
                + "<br /> "
                + "<br /> <b>RELATIVOS</b><BR />" 
                + construirRelatividade();

        // retorna resposta
        return strString;
         }
     }
     
     
    public String verificaFracao(){
                
        String resVer = "";
        
        double n1 = this.getNum();
        double n2 = this.getDen();
        
        if(n1==1&&n2>0){
            resVer = "Unitaria - ";
        }
                
        if(n1%n2==0){return resVer + "Aparente";}
        if(n1 >= n2){return resVer + "Imprópria";}
        if(n1 < n2){return resVer + "Própria";}
        
        return resVer;
    }
    
    // verifica se é primo
    public String checkPrimo(){
        
        double n1 = this.getNum();
        double n2 = this.getDen();
        
        int y = 2;
        int x = 2;
        
        for(y=2;y < n1;y++){if(n1%y==0){return "";}}        
        for(x=2;x < n2;x++){if(n2%x==0){return "";}}
        
        return "Irredutível";
    }
    
    // relativos
    public String construirRelatividade(){
        DecimalFormat decFormat = new DecimalFormat("#.##");         
        
        String N = "<BR />";
        String rltvdde = "..." + N;
        
        int i;

        for(i=2;i<10;i++){
            rltvdde += decFormat.format(this.getNum()* i)  + " ÷ " + decFormat.format(this.getDen() * i) + N;
        }
        
        return rltvdde + "...";
    }
     
    public double getNum(){
        return num;
    }

    public void setNum(double num){
        this.num = num;
    }

    public double getDen(){
        return den;
    }

    public void setDen(double den){
        this.den = den;
    }

    public double getRes(){
        return  res;
    }
    
    public void setRes(double res){
        this.res = res;
    }

}
