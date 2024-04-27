import java.util.ArrayList;
import java.util.List;

interface Component
{
    void showPrice();
    int getPrice();
}
class Leaf implements Component{
    int price;
    String name;
    Leaf(String name,int price)
    {
        this.name = name;
        this.price = price;
    }
    @Override
    public void showPrice() {
      
        System.out.println("Leaf" + "->" +name+ " : " +price);
    }
    @Override
    public int getPrice() {
      
        return price;
    }
    
}
class Composite implements Component{
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name)
    {
        super();
        this.name = name;
    }

    public void addComponent(Component com)
    {
            components.add(com);
    }

    @Override
    public int getPrice() 
    {
        int p =0;
        for(Component c : components)
        {
            p += c.getPrice();
        }

        return p;
       
    }
    @Override
    public void showPrice() 
  {
     System.out.println("Composite -> " +name+" : Price" +getPrice());
     System.out.println("Leaf of " +name);
     for(Component c : components)
    {
        c.showPrice();
    }
        
  }
}
public class compositepattern {
    public static void main(String[] args)
    {
        Component speaker = new Leaf("Speaker", 1000);
        Component mouse = new Leaf("mouse", 400);
        Component monitor = new Leaf("Monitor", 9000);
        Component ram = new Leaf("ram", 3000);
        Component cpu = new Leaf("cpu", 10000);

        Composite external = new Composite("external_components");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("MotherBoard");

        Composite computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        external.addComponent(mouse);
        external.addComponent(monitor);
        external.addComponent(speaker);

        cabinet.addComponent(mb);
        computer.addComponent(cabinet);
        computer.addComponent(external);

        computer.showPrice();

    }
    
}

