package anac;

import java.util.ArrayList;

public class Aeroporto {
    private String nomeAeroporto,codigoAeroporto, interOuNaci;
    private Cidade cidade;
    
    ArrayList<Aeronave> aeronavesPousadas = new ArrayList<>();
    ArrayList<Aeroporto> aeroportosParteVoo = new ArrayList<>();
    ArrayList<Aeroporto> aeroportosVemVoo = new ArrayList<>();
    

    public Aeroporto(String nomeAeroporto, String codigoAeroporto, String interOuNaci, Cidade cidade) {
        this.nomeAeroporto = nomeAeroporto;
        this.codigoAeroporto = codigoAeroporto;
        this.interOuNaci = interOuNaci;
        this.cidade = cidade;
    }

    public String getInterOuNaci() {
        return interOuNaci;
    }

    public void setInterOuNaci(String interOuNaci) {
        this.interOuNaci = interOuNaci;
    }

    public String getNomeAeroporto() {
        return nomeAeroporto;
    }

    public void setNomeAeroporto(String nomeAeroporto) {
        this.nomeAeroporto = nomeAeroporto;
    }

    public String getCodigoAeroporto() {
        return codigoAeroporto;
    }

    public void setCodigoAeroporto(String codigoAeroporto) {
        this.codigoAeroporto = codigoAeroporto;
    }
    
    public Cidade getCidade() {
        return cidade;
    }
    
    @Override
    public String toString(){
        return codigoAeroporto + " - " + nomeAeroporto + " / " + interOuNaci; 
    }
    
    public void mudaStatus(String novoStatus){
        setInterOuNaci(novoStatus);
    }
    
    public void inclui (ArrayList<Aeroporto> aeroportos){
        aeroportos.add(new Aeroporto(nomeAeroporto,codigoAeroporto,interOuNaci,cidade));
    }
    
     public void aeroportoParteVooAdd(Aeroporto ae){
        aeroportosParteVoo.add(new Aeroporto(ae.nomeAeroporto,ae.codigoAeroporto,ae.interOuNaci,ae.cidade));
    }
     
     public void aeroportoVemVooAdd(Aeroporto ae){
        aeroportosParteVoo.add(new Aeroporto(ae.nomeAeroporto,ae.codigoAeroporto,ae.interOuNaci,ae.cidade));
    }
     
    public boolean possuiRota(Aeroporto aeroportosChegada) {
        boolean possui = false;

                for (int i = 0; i < aeroportosParteVoo.size(); i++) {
            if (aeroportosParteVoo.get(i).equals(aeroportosChegada)) {
                possui = true;
            }
            else{ 
                for (int j = 0; j < aeroportosVemVoo.size(); j++) {
                if (aeroportosChegada.aeroportosVemVoo.get(j).equals(aeroportosParteVoo.get(i))); {
                        possui = true;
                    }
                }
            }
        }
        return possui;
    }
    
    public boolean equals (Aeroporto a){
        boolean pos = false;
        
        if (codigoAeroporto.equals(a.codigoAeroporto)){
            pos = true;
        }
        return pos;
    }
    
    public void incluirAeronavesPousadas(Aeronave a){
        if (aeronavesPousadas.size() < 100){
        aeronavesPousadas.add(new Aeronave(a.prefixo, a.modelo, a.nomeFabricante));
        }
        else{
            System.out.println("Apenas 100 aeronaves");
        }
    }
    
    public String retornaNome(ArrayList<Aeroporto> aeroportos, String codigo){
        String nome = null; 
        for (int i = 0; i < aeroportos.size(); i++) {
             if (aeroportos.get(i).getCodigoAeroporto().equals(codigo)){
                 nome = aeroportos.get(i).getNomeAeroporto();
             }
         }
        return nome;
    }
    
    public boolean aeronaveNoPatio(String prefixo){
        int pos = -1;
        boolean confirmaPouso = false;
        
        for (int i = 0; i < aeronavesPousadas.size(); i++) {
            if (aeronavesPousadas.get(i).getPrefixo().equals(prefixo)) {
                pos = i;
                confirmaPouso = true;
            }
        }
        return confirmaPouso;
    }

     public void numeroVooAE(ArrayList<Voo> voos,Cidade cidadeO, Cidade cidadeD){
        String origem = cidadeO.getNomeCidade();
        String destino = cidadeD.getNomeCidade();
        String data = null;
        int NUMERO = 0;
        
        for (int i = 0; i < voos.size(); i++) {
            if (voos.get(i).getaeSaida().getCidade().getNomeCidade().equals(origem) && 
                voos.get(i).getaeChegada().getCidade().getNomeCidade().equals(destino)) {
                NUMERO = voos.get(i).getnVoo();
                data = voos.get(i).getdPartida();
            }
        }
         System.out.println("Número do voo: " + NUMERO + "\nData da Partida: " + data);
    }
   
}
