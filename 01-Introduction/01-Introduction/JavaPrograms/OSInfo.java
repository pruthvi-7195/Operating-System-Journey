public class OSInfo {

    public static void main(String[] args) {

        System.out.println("Operating System Information");

        System.out.println("----------------------------");

        System.out.println("OS Name : "
                + System.getProperty("os.name"));

        System.out.println("OS Version : "
                + System.getProperty("os.version"));

        System.out.println("Architecture : "
                + System.getProperty("os.arch"));

        System.out.println("User : "
                + System.getProperty("user.name"));
    }
}
