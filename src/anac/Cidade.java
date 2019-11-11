package anac;

import java.util.ArrayList;

public class Cidade {
    private String nomeCidade;
    private double dimensaoCidade;
     ArrayList<Cidade> fronteira = new ArrayList<>();

    public Cidade(String nomeCidade, double dimensaoCidade) {
        this.nomeCidade = nomeCidade;
        this.dimensaoCidade = dimensaoCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }
    
    public double getDimensaoCidade() {
        return dimensaoCidade;
    }
    
    public boolean equals (Cidade c){
        boolean pos = false;

         if ((dimensaoCidade == c.dimensaoCidade) && (nomeCidade.equals(c.nomeCidade))){
               pos = true;
           }
           return pos;
    }
    
    public void adicionarCidadesFronteira(Cidade c){
        if (fronteira.size() < 40){
        fronteira.add(new Cidade(c.nomeCidade, c.dimensaoCidade));
        }
        else{
            System.out.println("Apenas 40 fronteiras");
        }
    }
    
    public boolean fazFronteira (Cidade c){
        boolean front = false;
        
        for (int i = 0; i < fronteira.size(); i++) {
            if (fronteira.get(i).equals(c)) {
                front = true;
            }
       }
        return front;
    }
    
    public void fronteiraEmComum (Cidade outra) {
        ArrayList<Cidade> front = new ArrayList<>();

        for (int i = 0; i < fronteira.size(); i++) {
             for (int a = 0; a < outra.fronteira.size(); a++) {
                if (fronteira.get(i).equals(outra.fronteira.get(a))) {
                    front.add(fronteira.get(i));
                 }
             }
        }
            System.out.println(front);
    }
    
    @Override
    public String toString(){
        return "\nNome da cidade: " + nomeCidade + "\nDimensao: " + dimensaoCidade;
    }
}
