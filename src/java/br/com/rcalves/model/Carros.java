package br.com.rcalves.model;

import java.util.ArrayList;
import java.util.List;

public class Carros {
    private List<String> carros;
    
    public Carros(){
        carros = new ArrayList<String>();
    }

    /**
     * @return the carros
     */
    public List<String> getCarros(String tipo) {
        
        if(tipo.equals("nacional")){
            carros.add("Chevrolet");
            carros.add("Fiat");
            carros.add("VW");
        }else{
            carros.add("Ferrari");
            carros.add("Lamborghini");
            carros.add("BMW");
        }
        
        return carros;
    }
    
    
    
    
}
