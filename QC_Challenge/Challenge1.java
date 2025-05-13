public class Food {
    static void soup() {
        System.out.println("This is Soup");
    }
    
    public void noodle() {
        System.out.println("This is noodle");
    }
    
    public static void main (String[] args) {
        soup();
        Food myNoodle = new Food();
        myNoodle.noodle();
    }
}


