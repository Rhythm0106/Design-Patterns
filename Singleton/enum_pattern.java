enum OS_License_Id
{
    INSTANCE;
    int i;
    public void show()
    {
        System.out.println(i);
    }
}
public class enum_pattern{
    public static void main(String[] args) {
        OS_License_Id License_Id1 = OS_License_Id.INSTANCE;
        License_Id1.i = 4;
        OS_License_Id License_Id2 = OS_License_Id.INSTANCE;
        License_Id2.i = 5;
        License_Id1.show();
        License_Id2.show();
    }
}
