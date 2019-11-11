package anac;

import java.util.ArrayList;

public class Aeronave {
    protected String prefixo;
    protected String modelo;
    protected String nomeFabricante;

    public Aeronave(String prefixo, String modelo, String nomeFabricante) {
        this.prefixo = prefixo;
        this.modelo = modelo;
        this.nomeFabricante = nomeFabricante;
    }
    
    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }
    
    public void incluiAeronave (ArrayList<Aeronave> aeronaves){
        aeronaves.add(new Aeronave(prefixo, modelo, nomeFabricante));
    }
    
    @Override
    public String toString(){
        return prefixo;
    }
    
    
}
