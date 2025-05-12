public class InfiniteLoopDemo {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println("Infinite Loop - Iteration: " + i);
            i++;
            if (i == 5) {
                break;
            }
        }
    }
}

