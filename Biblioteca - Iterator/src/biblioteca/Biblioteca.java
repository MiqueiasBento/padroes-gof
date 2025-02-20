package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Adiciona um livro ao array
    public void addBook(Livro livro) {
        this.livros.add(livro);
    }

    // Retorna um iterador para percorrer os livros
    public Iterator<Livro> iterator() {
        return new BibliotecaIterador(livros);
    }
}
