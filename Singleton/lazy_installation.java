class OS_License_Id
{
    static OS_License_Id license_Id;
    private OS_License_Id()
    {
        System.out.println("You created an object");
    }
    public static OS_License_Id getId()
    {
        if(license_Id == null)
        {
            license_Id = new OS_License_Id();
        }
        
        return license_Id;
    }
}
public class lazy_installation {
    public static void main(String[] args) {
        OS_License_Id License_Id1 = OS_License_Id.getId();
        OS_License_Id License_Id2 = OS_License_Id.getId();//if you allow one class than your class is singelton
    }
}

