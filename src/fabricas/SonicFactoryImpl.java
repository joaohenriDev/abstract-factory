package fabricas;

import personagens.Sonic;
import personagens.SonicCharacter;
import personagens.SonicEnemy;
import personagens.inimigos.Eggman;

// Fábrica concreta para o Sonic
public class SonicFactoryImpl implements SonicFactory {
    public SonicCharacter createCharacter() {
        return new Sonic();
    }
    public SonicEnemy createEnemy() {
        return new Eggman();
    }
}
