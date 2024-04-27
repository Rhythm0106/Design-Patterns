
interface Cable
{
    void connect(String str);
}

class CableAdaptor implements Cable
{
    USB_Cable UC = new USB_Cable();
    public void connect(String str)
    {
        UC.uses(str);
    }
}

class MacBook{

    private Cable L;

    public Cable getL()
    {
        return L;
    }

    public void setL(Cable L)
    {
        this.L = L;
    }

    public void ConnectMacBook(String str)
    {
        L.connect(str);
    }
}

class USB_Cable 
{
    public void uses(String str)
    {
        System.out.println(str);
    }
}

class Other_Cable
{
    public void uses(String str)
    {
        System.out.println("Different cable needes to connect");
    }
}

public class adapter_pattern {
    public static void main(String[] args)
    {

        Cable L = new CableAdaptor();  
        MacBook MB = new MacBook();
        MB.setL(L);
        MB.ConnectMacBook("I am having problem in connecting USB Cable with MackBook");
    }
}
