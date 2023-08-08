package Day_36practice;

public class Main_Game {
    public static void main(String[] args) {
        Game game=new Game( "SuperQA",1,true);
        System.out.println(game.getHeroName());
        game.setHeroAge(2);
        System.out.println(game);
    }
}
