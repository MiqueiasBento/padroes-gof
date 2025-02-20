import biblioteca.Biblioteca;
import biblioteca.Iterator;
import biblioteca.Livro;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addBook(new Livro("Clean Code", "Robert C. Martin"));
        biblioteca.addBook(new Livro("Refactoring", "Martin Fowler"));
        biblioteca.addBook(new Livro("Design Patterns", "Erich Gamma"));

        Iterator<Livro> iterator = biblioteca.iterator();

        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            System.out.println(livro);
        }
    }
}