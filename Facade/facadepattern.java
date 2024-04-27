
import java.util.Scanner;

interface OS {
    void spec();
    void type();
    void own();
}

class Android implements OS {

    public void own()
    {
        System.out.println("It is owned and formed by Google");
    }

    public void spec() {
        System.out.println("Android is the most powerful OS");
    }

    public void type() {
        System.out.println("The latest Android version is 14");
    }

}

class IOS implements OS {
    public void own()
    {
        System.out.println("It is owned and formed by Apple");
    }

    public void spec() {
        System.out.println("iOS is the most secure OS");
    }

    
    public void type() {
        System.out.println("The latest iPhone device is iPhone 15");
    }
}

class Windows implements OS {
    public void own()
    {
        System.out.println("It is owned and formed by Microsoft");
    }

    public void spec() {
        System.out.println("Windows has high performance and can perform a wide range of tasks");
    }

    
    public void type() {
        System.out.println("Windows 11 is the latest");
    }
}

class OS_Producer {
    private OS android;
    private OS ios;
    private OS windows;

    public OS_Producer() {
        android = new Android();
        ios = new IOS();
        windows = new Windows();
    }

    public void selectOS(int choice) {
        switch (choice) {
            case 1:
                android.own();
                android.type();
                android.spec();
                break;
            case 2:
                ios.own();
                ios.type();
                ios.spec();
                break;
            case 3:
                windows.own();
                windows.type();
                windows.spec();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

public class facadepattern {
    public static void main(String[] args) {
        OS_Producer os_producer = new OS_Producer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an operating system:");
        System.out.println("1. Android");
        System.out.println("2. iOS");
        System.out.println("3. Windows");

        int choice = scanner.nextInt();
        os_producer.selectOS(choice);

        scanner.close();
    }
}




