public class TrafficLightSwitch {
    public static void main(String[] args) {
        String light = "Red";
        switch (light) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Slow Down");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Color");
                break;
        }
    }
}

