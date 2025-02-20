import java.util.ArrayList;
import java.util.List;

public class AlunosSingleton {
    private static AlunosSingleton instance;
    private List<Aluno> alunos = new ArrayList<>();

    private AlunosSingleton() {
    }

    public static AlunosSingleton getInstancia() {
        if (instance == null) {
            instance = new AlunosSingleton();
        }
        return instance;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public List<Aluno> getAlunos() {
        return this.alunos;
    }
}
