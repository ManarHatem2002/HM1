public class GameEntry {

    int score;

    public GameEntry(int score) {
        this.score = score;
    }



    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[5];
        A[4] = new GameEntry(500);

        GameEntry[] B = A.clone();

        A[4].score = 550;

        System.out.println(B[4].score); // Output: 550
    }
}

