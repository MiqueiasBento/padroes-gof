package observer;

import java.util.*;

public class Disciplina implements Sujeito {
    private String nomeDisciplina;
    private Map<String, Double> notas;
    private List<Observer> observadores = new ArrayList<>();

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new HashMap<>();
    }

    @Override
    public void adicionarObserver(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificar() {
        for (Observer o : observadores) {
            o.update(this);
        }
    }

    // Getters e Setters
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Double getNota(String nomeAluno) {
        return notas.get(nomeAluno);
    }

    // Metodo de interesse para notificar
    public void setNota(String nomeAluno, Double nota) {
        notas.put(nomeAluno, nota);
        notificar();
    }

    public List<Observer> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observer> observadores) {
        this.observadores = observadores;
    }

    @Override
    public String toString() {
        return nomeDisciplina;
    }
}
