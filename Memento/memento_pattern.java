import java.util.List;
import java.util.ArrayList;

class Laptop
{
    private String state;

    public Laptop(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }
}

class Engineer
{
    private String state;

    public void setState(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }

    public Laptop saveStatetoLaptop()
    {
        return new Laptop(state);
    }

    public void getStateFromLaptop(Laptop laptop)
    {
        state = laptop.getState();
    }
}

class DBA
{
    private List<Laptop> laptopList = new ArrayList<Laptop>();

    public void add(Laptop state)
    {
        laptopList.add(state);
    }

    public Laptop get(int index)
    {
        return laptopList.get(index);
    }
}


public class memento_pattern
{
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        DBA dba = new DBA();

        engineer.setState("RAM");
        dba.add(engineer.saveStatetoLaptop());
        engineer.setState("CPU");
        dba.add(engineer.saveStatetoLaptop());

        engineer.setState("Storage");
        dba.add(engineer.saveStatetoLaptop());

        engineer.setState("SSD");
        System.out.println("Current State: " + engineer.getState());

        engineer.getStateFromLaptop(dba.get(0));
        System.out.println("First saved state: " + engineer.getState());
        engineer.getStateFromLaptop(dba.get(1));
        System.out.println("Second saved state: " + engineer.getState());
        engineer.getStateFromLaptop(dba.get(2));
        System.out.println("Third saved state: " + engineer.getState());
    }
}
