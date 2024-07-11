package comparableXcomparator.list.exemploDeList;
 
import java.util.ArrayList;
import java.util.Collections;

public class Main {
      public static void main(String[] args) {
          System.out.println("-----------------------------");
          ArrayList<Livro> livros = new ArrayList<Livro>() {
            {
                add(new Livro("Java- Guia do Programador: Atualizado para java 16", "Peter Jandl", 2021));
                add(new Livro("Desenvolvimento Real de Software: Um guia de projetos para fundamentos", "Raoul-Gabriel Urma e Richard Warburton", 2021));
                add(new Livro("Microsserviços Prontos Para a Produção: Construindo Sistemas Padronizados", "Susan J. Fowler", 2017));
                add(new Livro("Entendendo algoritmos: Um Guia Ilustrado para Programadores e Outros", "Aditya Y. Bhargava", 2017));
                add(new Livro("Kotlin em A;cão", "Dmitry Jemerov e Svetlana Isakova", 2017));
            }
          };

          System.out.println("Livros após a ordenação natural (Titulo): ");
          Collections.sort(livros);
          for(Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " +
                              livro.getAutor() + " - " +
                              livro.getAno());
          }

          System.out.println("--------------------------");

          System.out.println("Livros após a ordenação pr ano: ");
          Collections.sort(livros, new CompararAno());
          for(Livro livro : livros) {
            System.out.println(livro.getAno() + " - " +
                               livro.getTitulo() + " - " +
                               livro.getAutor());
          }
          
          System.out.println("--------------------------");
          Collections.sort(livros, new CompararAutor());
          for(Livro livro : livros) {
            System.out.println(livro.getAutor() + " - " +
                               livro.getAno() + " - " +
                               livro.getTitulo());
          }          
         
          System.out.println("--------------------------");

          Collections.sort(livros, new CompararAnoAutorTitulo());
          for(Livro livro : livros) {
            System.out.println(livro.getAno() + " - " +
                               livro.getAutor() + " - " +
                               livro.getTitulo());
          }

      }
}
