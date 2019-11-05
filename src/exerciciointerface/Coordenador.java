
package exerciciointerface;


public class Coordenador implements ControleSala {
    String nome;
    String escola;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public void abrirSala() {
        System.out.println(nome+" abriu a sala");
    }
    
    
}
