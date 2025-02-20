package biblioteca;

import java.util.List;

public class BibliotecaIterador implements Iterator<Livro> {
    private List<Livro> livros;
    private int index = 0;

    public BibliotecaIterador(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public boolean hasNext() {
        return index < livros.size();
    }

    @Override
    public Livro next() {
        Livro livro = livros.get(index);
        index++;
        return livro;
    }
}
