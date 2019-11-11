package anac;

import java.util.ArrayList;

public class Voo {
    private int nVoo, nVagas;
    private String dPartida, hPartida, hChegada;
    private Aeronave numeroAviao;
    private Aeroporto aeSaida, aeChegada;
    

    public Voo(){
        
    }
    
    public Voo(int nVoo, int nVagas, String dPartida, String hPartida, String hChegada, Aeronave numeroAviao, Aeroporto aeSaida, Aeroporto aeChegada) {
        this.nVoo = nVoo;
        this.nVagas = nVagas;
        this.dPartida = dPartida;
        this.hPartida = hPartida;
        this.hChegada = hChegada;
        this.numeroAviao = numeroAviao;
        this.aeSaida = aeSaida;
        this.aeChegada = aeChegada;
   }

    public int getnVoo() {
        return nVoo;
    }

    public void getC(Aeroporto a){
        
    }
    
    public void setnVoo(int nVoo) {
        this.nVoo = nVoo;
    }

    public int getnVagas() {
        return nVagas;
    }

    public void setnVagas(int nVagas) {
        this.nVagas = nVagas;
    }

    public String getdPartida() {
        return dPartida;
    }

    public void setdPartida(String dPartida) {
        this.dPartida = dPartida;
    }

    public String gethPartida() {
        return hPartida;
    }

    public void sethPartida(String hPartida) {
        this.hPartida = hPartida;
    }

    public String gethChegada() {
        return hChegada;
    }

    public void sethChegada(String hChegada) {
        this.hChegada = hChegada;
    }

    public Aeronave getNumeroAviao() {
        return numeroAviao;
    }

    public void setNumeroAviao(Aeronave numeroAviao) {
        this.numeroAviao = numeroAviao;
    }

    public Aeroporto getaeSaida() {
        return aeSaida;
    }

    public void setaeSaida(Aeroporto aeSaida) {
        this.aeSaida = aeSaida;
    }

    public Aeroporto getaeChegada() {
        return aeChegada;
    }

    public void setaeChegada(Aeroporto aeChegada) {
        this.aeChegada = aeChegada;
    }
    
    public void excluir (ArrayList<Voo> voos, int nVoo){
        int pos = pesquisaN(voos, nVoo);
        
        if (voos.isEmpty()) {
            System.out.println("Sem voos");
            return;
        }
        
        if (pos == -1) {
            System.out.println("Erro: voo não encontrado");
            return;
        }
        voos.remove(pos);
    }
    
    public int pesquisaN(ArrayList<Voo> voos, int nVoo) {
        int pos = -1;
        
        for (int i = 0; i < voos.size(); i++) {
            if (voos.get(i).getnVoo() == nVoo) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public void editar (ArrayList<Voo> voos,int nVoo, int novoNVagas, String novoDPartida, String novoHPartida, String novoHChegada, Aeronave a, Aeroporto aeSaida, Aeroporto aeChegada){
        if (voos.isEmpty()) {
            System.out.println("Sem voos");
            return;
        }
        int pos = pesquisaN(voos, nVoo);
        if (pos == -1) {
            System.out.println("Erro: voo não encontrado");
        }
        voos.get(pos).setnVagas(novoNVagas);
        voos.get(pos).setdPartida(novoDPartida);
        voos.get(pos).sethPartida(novoHPartida);
        voos.get(pos).sethChegada(novoHChegada);
        voos.get(pos).setNumeroAviao(a);
        voos.get(pos).setaeSaida(aeSaida);
        voos.get(pos).setaeChegada(aeChegada);
        
    }
    
    public void incluir(ArrayList<Voo> voos){
        if (numeroAviao.getClass() == Aviao.class){
            for (int i = 0; i < voos.size(); i++){
                if (dPartida.equals(voos.get(i).getdPartida())){
                    System.out.println("Erro!! 2 Voos em 1 dia!!");
                    return;
                }
            }
            voos.add(new Voo(nVoo,nVagas,dPartida,hPartida,hChegada,numeroAviao,aeSaida,aeChegada));
        }
        else{
        voos.add(new Voo(nVoo,nVagas,dPartida,hPartida,hChegada,numeroAviao,aeSaida,aeChegada));
        }
    }
    
    public void incluirVoos(ArrayList<Voo> voos,int nVoo, int nVagas, String dPartida, String hPartida, String hChegada, Aeronave numeroAviao, Aeroporto aeSaida, Aeroporto aeChegada) {
        if (numeroAviao.getClass() == Aviao.class){
            for (int i = 0; i < voos.size(); i++){
                if (dPartida.equals(voos.get(i).getdPartida())){
                    System.out.println("Erro!! 2 Voos em 1 dia!!");
                    return;
                }
            }
            voos.add(new Voo(nVoo,nVagas,dPartida,hPartida,hChegada,numeroAviao,aeSaida,aeChegada));
        }
        else{
        voos.add(new Voo(nVoo,nVagas,dPartida,hPartida,hChegada,numeroAviao,aeSaida,aeChegada));
        }
    }
    
    public void atributosVoo(ArrayList<Voo> voos, int nVoo){
        int pos = pesquisaN(voos, nVoo);
        if (voos.isEmpty()) {
            System.out.println("Sem voos");
            return;
        }
        if (pos == - 1) {
            System.out.println("Erro: voo não encontrado");    
        }
        Aviao a;
        System.out.println(voos.toString());
    }
    @Override
    public String toString(){
        String s = "Numero voo: " + getnVoo() + " \nNumero vagas: " + getnVagas() 
                + "\nData partida: " + getdPartida() + " \nHora partida: " 
                + gethPartida() + " \nHora chegada : " + gethChegada() + " \nCodigo da aeronave : " 
                + getNumeroAviao() + " \nAeroporto de saida : " 
                + getaeSaida() + " \nAeroporto de chegada : " 
                + getaeChegada();
        return s;
    }
}
