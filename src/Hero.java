public class Hero {
         private int heroHp;
        private int heroDamage;
        private String heroMega;

        public Hero (int heroHp, int heroDamage, String heroMega) {

            this.heroHp = heroHp;
            this.heroDamage = heroDamage;
            this.heroMega = heroMega;
        }

        public int getHeroHp () {
            return this.heroHp;
        }
        public int getHeroDamage () {
            return this.heroDamage;
        }
        public String getHeroMega () {
            return this.heroMega;
        }

        Hero(int heroHp, int heroDamage) {

            this.heroHp = heroHp;
            this.heroDamage = heroDamage;
        }

    }

