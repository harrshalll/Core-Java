public class LoopScope {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
       // System.out.println(i);--->cannot use outside loop block because it initialized in loop block (loop scope).
    }
}
