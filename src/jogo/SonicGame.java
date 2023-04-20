package jogo;

import fabricas.ShadowFactoryImpl;
import fabricas.SonicFactory;
import fabricas.SonicFactoryImpl;
import personagens.SonicCharacter;
import personagens.SonicEnemy;

// Exemplo de uso
public class SonicGame {
    public static void main(String[] args) {
        // Cria a fábrica do Sonic
        SonicFactory sonicFactory = new SonicFactoryImpl();

        // Cria o personagem e o inimigo do Sonic
        SonicCharacter sonic = sonicFactory.createCharacter();
        SonicEnemy eggman = sonicFactory.createEnemy();

        // Move o personagem e ataca o inimigo
        sonic.move();
        eggman.attack();

        // Cria a fábrica do Shadow
        SonicFactory shadowFactory = new ShadowFactoryImpl();

        // Cria o personagem e o inimigo do Shadow
        SonicCharacter shadow = shadowFactory.createCharacter();
        SonicEnemy metalSonic = shadowFactory.createEnemy();

        // Move o personagem e ataca o inimigo
        shadow.move();
        metalSonic.attack();
    }
}
