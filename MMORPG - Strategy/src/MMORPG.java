import armas.Arma;
import armas.EspadaLeve;
import armas.EspadaPesada;
import armas.Martelo;

public class MMORPG {
    public static void main(String[] args) {
        Guerreira guerreira = new Guerreira("Diane");

        Arma espadaLeve = new EspadaLeve();
        Arma espadaPesada = new EspadaPesada();
        Arma martelo = new Martelo();

        guerreira.escolherArma(espadaLeve);
        guerreira.ataque();

        guerreira.escolherArma(espadaPesada);
        guerreira.ataque();

        guerreira.escolherArma(martelo);
        guerreira.ataque();
    }
}