// NASA Countdown with Astronaut Commentary using Threads
public class NasaCountdown {
    public static void main(String[] args) {
        // Creating and starting the Countdown thread
        Thread countdownThread = new Thread(new Countdown());
        Thread astronautThread = new Thread(new Astronaut());

        astronautThread.start();  // Start the astronaut thread (panicked jokes)
        countdownThread.start();  // Start the countdown thread
    }
}

// Countdown Thread (Runnable)
class Countdown implements Runnable {
    @Override
    public void run() {
        try {
            // NASA Countdown from 10 to 0
            for (int i = 10; i >= 0; i--) {
                System.out.println("Countdown: " + i);
                Thread.sleep(1000); // 1 second delay for countdown
            }
            System.out.println("🚀 Liftoff! We have liftoff!");
        } catch (InterruptedException e) {
            System.out.println("Countdown interrupted!");
        }
    }
}

// Astronaut Thread (Runnable)
class Astronaut implements Runnable {
    @Override
    public void run() {
        try {
            // Astronaut making panicked jokes until countdown begins
            System.out.println("👨‍🚀 Astronaut: Are we sure this thing is safe?");
            Thread.sleep(2000); // 2 seconds pause
            System.out.println("👨‍🚀 Astronaut: I hope the snacks are good in space.");
            Thread.sleep(2000);
            System.out.println("👨‍🚀 Astronaut: Who packed my lucky socks?!");
            Thread.sleep(2000);
            System.out.println("👨‍🚀 Astronaut: Wait, where's the steering wheel?");
        } catch (InterruptedException e) {
            System.out.println("Astronaut interrupted!");
        }
    }
}

