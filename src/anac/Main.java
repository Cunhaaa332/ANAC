package anac;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Aeronave> aeronaves = new ArrayList<>();
        ArrayList<Aeroporto> aeroportos = new ArrayList<>();
        ArrayList<Voo> voos = new ArrayList<>();
        
        Aeronave a1 = new Aviao(70, "GOL", "GL-A67", "BOING", "Ricardo Eletro");
        Aeronave a2 = new Aviao(30, "AZUL", "AZ-A30", "JATO", "Multilazer");
        Aeronave a3 = new Helicoptero("Taxi Aereo", "HL-78B", "AAAAA", "Razer");
        a1.incluiAeronave(aeronaves);
        a2.incluiAeronave(aeronaves);
        a3.incluiAeronave(aeronaves);

        Cidade c1 = new Cidade("Sao Paulo", 12000);
        Cidade c2 = new Cidade("Rio de janeiro", 5000);
        Cidade c3 = new Cidade("Bahia", 12000);
        
        Aeroporto ae1 = new Aeroporto("Santos Drummond", "SDU","Internacional",c1);
        Aeroporto ae2 = new Aeroporto("Guarulhos", "GIG","Internacional",c2);
        Aeroporto ae3 = new Aeroporto("Magalhaes", "SSA","Internacional",c2);
        ae1.inclui(aeroportos);
        ae2.inclui(aeroportos);
        ae3.inclui(aeroportos);
        
        Voo v1 = new Voo(6445, 80, "23/12/2019", "15:50", "19:50",a1,ae2,ae1);
        Voo v2 = new Voo(6887, 30, "23/12/2019", "18:00", "20:00",a2,ae1,ae3);
        Voo vooss = new Voo();
        
        v1.incluir(voos);
        v2.incluir(voos);
        
        ae1.aeroportoParteVooAdd(ae3);
        ae3.aeroportoParteVooAdd(ae2);
        
        
        System.out.println(a1.getPrefixo());
        System.out.println("----------------------------------------------------------------");
        v1.atributosVoo(voos,6445);
        System.out.println("----------------------------------------------------------------");
        v2.excluir(voos,6887);
        v2.atributosVoo(voos,6887);
        System.out.println("----------------------------------------------------------------");
        
        
        vooss.incluirVoos(voos,6887, 30, "23/12/2019", "18:00", "20:00",a3,ae1,ae2);
        vooss.incluirVoos(voos,6445, 80, "20/07/2019", "15:50", "19:50",a1,ae2,ae1);
        vooss.excluir(voos,6887);
        vooss.atributosVoo(voos,6887);
        System.out.println("----------------------------------------------------------------");
        vooss.atributosVoo(voos,6445);
        vooss.editar(voos,6445, 10, "24/12/2019", "17:00", "23:00", a2, ae2, ae3);
        System.out.println("----------------------------------------------------------------");
        
        
        ae1.numeroVooAE(voos, c2, c1);
        System.out.println("----------------------------------------------------------------");
        ae1.mudaStatus("Nacional");
        System.out.println(ae1.equals(ae3));
        System.out.println(ae3.possuiRota(ae1));
        
        System.out.println(ae1.retornaNome(aeroportos,"SDU"));
        
        System.out.println(c1.equals(c3));
        c1.adicionarCidadesFronteira(c3);
        c2.adicionarCidadesFronteira(c3);
        System.out.println(c1.fazFronteira(c3));
        c1.fronteiraEmComum(c2);
        
        
        
        
        
        
       
    }
}
