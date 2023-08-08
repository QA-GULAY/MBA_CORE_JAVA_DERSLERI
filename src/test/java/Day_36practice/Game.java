package Day_36practice;

public class Game {
   private String heroName;
   private int heroAge;
    private boolean heroLight;

    public Game(String heroName, int heroAge, boolean heroLight) {
        this.heroName = heroName;
        this.heroAge = heroAge;
        this.heroLight = heroLight;
    }

    public String getHeroName() {
        return heroName;
    }

    public int getHeroAge() {
        return heroAge;
    }

    public boolean isHeroLight() {
        return heroLight;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setHeroAge(int heroAge) {
        this.heroAge = heroAge;
    }

    public void setHeroLight(boolean heroLight) {
        this.heroLight = heroLight;
    }

   @Override
    public String toString() {
        return "Game{" +
                "heroName='" + heroName + '\'' +
                ", heroAge=" + heroAge +
                ", heroLight=" + heroLight +
                '}';
    }
}
