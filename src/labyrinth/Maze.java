package labyrinth;

public class Maze {
    int[][] mazeArray = {};
    char wall, play, freeSpace, treasure;
    Player player;

    public Maze(int[][] mazeArray, char wall, char play, char freeSpace, char treasure, Player player) {
        this.mazeArray = mazeArray;
        this.wall = wall;
        this.play = play;
        this.freeSpace = freeSpace;
        this.treasure = treasure;
        this.player = player;
    }

    void printMaze() {
        for (int i = 0; i < mazeArray.length; i++) {
            for (int j = 0; j < mazeArray[i].length; j++) {
                System.out.println("tbd");
            }
            System.out.println();
        }
    }

    char getCharacter(int mazeValue) {
        switch (mazeValue) {
            case 0: return freeSpace;
            case 1: return wall;
            case 2: return play;
            case 3: return treasure;
        }
        return 'x';
    }
    public static void main(String[] args) {
        int[][] mazeArray = {
               {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 2, 1, 3, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1},
        };

        Player p1 = new Player("PP");
        Maze mayo = new Maze(mazeArray, '#', '0', ' ' , '+', p1);
    }
}
