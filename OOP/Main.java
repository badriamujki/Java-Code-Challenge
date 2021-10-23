public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Badria ", 20);

        hero.player();
        // Berjalan 16x
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();

        // Berlari 8x / run 8x
        hero.run();
        hero.run();
        hero.run();
        hero.run();
        hero.run();
        hero.run();
        hero.run();
        hero.run();

        // Makan 3x / eat 3x
        hero.eat();
        hero.eat();
        hero.eat();

        // Minum 2x / drink 2x
        hero.drink();
        hero.drink();

        // Berjalan 6x / walk 6x
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();
        hero.walk();

        // Melompat 4x / jump 4x
        hero.jump();
        hero.jump();
        hero.jump();
        hero.jump();

        // Duduk 1x / sit 1x
        hero.sit();

        // Menyerang 6x / attack 6x
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();

        // Status hero
        hero.player();

    }

}
