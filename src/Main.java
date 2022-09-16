public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHp(300);
        boss.setDamage(50);
        boss.setZashita("magic");
        System.out.println("uronBoss: " + boss.getDamage() + " /jizn'Bossa: " + boss.getHp() + " /zashitaBossa: "
                + boss.getZashita() );
        Hero [] team = creatHeroes ();
        for (Hero hero : team) {
            System.out.println("Jizn': " + hero.getHeroHp() + "/Uron: " + hero.getHeroDamage() + "/Zawita" + " " +
                    hero.getHeroMega() );
        }

    }
        public static Hero [] creatHeroes() {
        Hero Antimag = new Hero(150, 100, "Physical");
        Hero Riki = new Hero(120, 800);
        Hero Slark = new Hero(130, 80, "Magic");
        Hero [] team = {Antimag, Riki, Slark};
        return team;
    }

}