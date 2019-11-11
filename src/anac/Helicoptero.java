package anac;

public class Helicoptero extends Aeronave {
    private String tipo;

    public Helicoptero(String tipo, String prefixo, String modelo, String nomeFabricante) {
        super(prefixo, modelo, nomeFabricante);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
