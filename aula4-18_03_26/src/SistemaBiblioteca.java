import java.io.IOException;
import java.util.Date;

public class SistemaBiblioteca {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("A Branca de Neve", "Matheus Vasques Santos", "123456");
        Livro livro2 = new Livro("O Pequeno Principe", "Mariana Souza França", "789101");

        Membro membro1 = new Membro("João Francisco Junior", 1, "junior@fiap.com.br");
        Membro membro2 = new Membro("Maria Fernandes Silva", 2, "maria@fiap.com.br");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.registrarMembro(membro1);
        biblioteca.registrarMembro(membro2);

        biblioteca.registrarEmprestimo(livro1, membro1);

        try{
            biblioteca.salvarDadosEmArquivo("biblioteca.txt");
            biblioteca.carregarDadosDeArquivo("biblioteca.txt");
        }catch (IOException e){
            e.printStackTrace();
        }

        biblioteca.devolverLivro(new Emprestimo(livro1, membro1, new Date()));
        biblioteca.removerLivro(livro2);
    }
}
 