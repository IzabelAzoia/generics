package comparableXcomparator.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

  private Set<Convidado> ConvidadoSet;

  public ConjuntoConvidados() {
    this.ConvidadoSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    ConvidadoSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    for(Convidado c : ConvidadoSet) {
        if(c.getCodigoConvite() == codigoConvite) {
            convidadoParaRemover = c;
            break;
        }
    }
    ConvidadoSet.remove(convidadoParaRemover);
  }

  public int contarConvidado() {
    return ConvidadoSet.size();
  }

  public void exibirConvidados() {
    System.out.println(ConvidadoSet);
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidado(s) dentro do Set Convidados");

    conjuntoConvidados.adicionarConvidado("Convidado 1", 01234);
    conjuntoConvidados.adicionarConvidado("Convidado 2", 01235);
    conjuntoConvidados.adicionarConvidado("Convidado 3", 01235);
    conjuntoConvidados.adicionarConvidado("Convidado 4", 01236);

    System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidado(s) dentro do Set Convidados");
    conjuntoConvidados.adicionarConvidado("Convidado 1", 01234);

    System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidado(s) dentro do Set Convidados");

    conjuntoConvidados.exibirConvidados();
  }
}
