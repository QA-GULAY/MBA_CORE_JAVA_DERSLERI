package Day_36practice;

public class Main_Album {
    public static void main(String[] args) {
        Album album=new Album("Summer Vibes","Sunny Artist",2023,"pop");
        System.out.println(album.getArtistName());
        album.setReleaseYear(2024);
        album.setGenre("Electronic");
        System.out.println(album.toString());
    }
}
