
package exerciciointerface;

public class Principal {
    
    public static void main(String[] args) {
        Professor p = new Professor();
        p.setNome("Rodolfo");
        p.setDisciplina("TPI-2");
        p.abrirSala();
        
        Coordenador c = new Coordenador();
        c.nome = "Cláudio";
        c.escola = "ETEC Peruíbe";
        c.abrirSala();
        
        
        
        
    }
    
}
