import java.util.Scanner;

interface OS {
    void spec();
}

class Android implements OS {
    public void spec() {
        System.out.println("Most powerful OS");
    }
}

class IOS implements OS {
    public void spec() {
        System.out.println("Most secure OS");
    }
}

class Windows implements OS {
    public void spec() {
        System.out.println("I am about to die");
    }
}

class OperatingSystemFactory {
    public OS getInstance(String str) {
        if (str.equals("open"))
            return new Android();
        else if (str.equals("closed"))
            return new IOS();
        else
            return new Windows();
    }
}

public class factory{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 'open' for Android, 'closed' for iOS, or any other for Windows: ");
        String userInput = scanner.nextLine();

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance(userInput);
        obj.spec();

        scanner.close();
    }
}
