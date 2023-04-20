package fabricas;

import personagens.SonicCharacter;
import personagens.SonicEnemy;

public interface SonicFactory {
    public SonicCharacter createCharacter();
    public SonicEnemy createEnemy();
}