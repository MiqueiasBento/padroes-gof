
public class SistemaUsuarios {
    public static void main(String[] args) {
        AlunosSingleton usuarios = AlunosSingleton.getInstancia();

        usuarios.adicionarAluno(new Aluno("Alice", "123", "Informática"));
        usuarios.adicionarAluno(new Aluno("Bob", "456", "Matemática"));
        usuarios.adicionarAluno(new Aluno("Charlie", "789", "Física"));

        // Listagem dos alunos
        System.out.println("Lista de aluno:");
        for (Aluno aluno : usuarios.getAlunos()) {
            System.out.println("- " + aluno);
        }

        // Instanciacao unica
        AlunosSingleton outraInstancia = AlunosSingleton.getInstancia();
        outraInstancia.adicionarAluno(new Aluno("David", "101", "Química"));

        System.out.println("\nLista com novo aluno:");
        for (Aluno aluno : outraInstancia.getAlunos()) {
            System.out.println("- " + aluno);
        }
    }
}
