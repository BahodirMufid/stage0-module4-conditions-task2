package school.mjc.stage0.conditions.task2;

public class CoinFlip {

    public static void main(String[] args) {
        throwCoin(1000);
    }
    public static void throwCoin(int from1UpTo1000) {

        if (from1UpTo1000<=499){
            System.out.print("Eagle\n");
        } else if (from1UpTo1000>=500) {
            System.out.print("Tail\n");
        }
    }
}
