package fabricas;

import personagens.Shadow;
import personagens.SonicCharacter;
import personagens.SonicEnemy;
import personagens.inimigos.MetalSonic;

// Fábrica concreta para o Shadow
public class ShadowFactoryImpl implements SonicFactory {
    public SonicCharacter createCharacter() {
        return new Shadow();
    }
    public SonicEnemy createEnemy() {
        return new MetalSonic();
    }
}
