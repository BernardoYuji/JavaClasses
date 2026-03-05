public class Livro {
    public String titulo; // Mudamos para public
    public String autor;
    public int estoque;

    public Livro(String titulo, String autor, int estoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.estoque = estoque;
    }

    public void adicionarEstoque(int qtd) {
        this.estoque += qtd;
    }
}

public class Membro {
    public String nome; // Mudamos para public
    public String id;
    public String email;

    public Membro(String nome, String id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
    }
}

public class Emprestimo {
    public Livro livro;   // Tipo é a Classe Livro
    public Membro membro; // Tipo é a Classe Membro
    public String dataEmprestimo;

    public Emprestimo(Livro livro, Membro membro, String dataEmprestimo) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public void imprimirRecibo() {
        // Acesso direto aos atributos públicos
        System.out.println("Livro: " + livro.titulo);
        System.out.println("Membro: " + membro.nome);
        System.out.println("Data: " + dataEmprestimo);
    }
}