package factory;

import hamburguer.Hamburguer;

public interface Factory {
    public Hamburguer criarHamburguer(String tipo);
}
