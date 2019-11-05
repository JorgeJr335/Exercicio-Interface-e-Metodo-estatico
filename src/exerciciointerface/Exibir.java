
package exerciciointerface;

public class Exibir {
    Professor p;
    Coordenador c;
    
    public static void professor(Professor p){
        System.out.println("Professor "+p.getNome());
        System.out.println("da disciplina "+p.getDisciplina()+"");
    }
    public static void coordenador(Coordenador c){
        System.out.println("Coordenador "+c.nome);
        System.out.println("da escola "+c.escola);
    }
}
