package oop;

public class SongTest {
    public static void main(String[] args) {
        Song songNew = new Song();
        songNew.name = "Інді я";
        songNew.author = "Tartak";
        songNew.yearOfRelease = 2015;
        songNew.rating = 12.5;
        songNew.printInfo();
    }
}
