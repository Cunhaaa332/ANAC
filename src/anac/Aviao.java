
package anac;

public class Aviao extends Aeronave {
    private int qdtAssentos;
    private String nomeEmpresa;

    public Aviao(int qdtAssentos, String nomeEmpresa, String prefixo, String modelo, String nomeFabricante) {
        super(prefixo,modelo, nomeFabricante);
        this.qdtAssentos = qdtAssentos;
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getQdtAssentos() {
        return qdtAssentos;
    }

    public void setQdtAssentos(int qdtAssentos) {
        this.qdtAssentos = qdtAssentos;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    
    
}
