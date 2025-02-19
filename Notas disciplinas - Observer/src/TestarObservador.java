import observer.Aluno;
import observer.Coordenadora;
import observer.Disciplina;
import observer.Observer;

public class TestarObservador {
    public static void main(String[] args) {
        // Os observadores
        Observer coordenadora = new Coordenadora("Maria");
        Observer aluno1 = new Aluno("Joaquim");
        Observer aluno2 = new Aluno("Carlos");
        Observer aluno3 = new Aluno("João");

        // O sujeito, ou seja,  a disciplina
        Disciplina disciplina = new Disciplina("Programação");
        disciplina.adicionarObserver(coordenadora);
        disciplina.adicionarObserver(aluno1);
        disciplina.adicionarObserver(aluno2);
        disciplina.adicionarObserver(aluno3);

        // Teste da notificação, atualizando notas
        disciplina.setNota("Joaquim", 8.0);
        disciplina.setNota("Carlos", 9.0);
        disciplina.setNota("João", 10.0);
    }
}