
interface Laptop {
    String getDescription();
    double getCost();
}


class OnlyLaptop implements Laptop {
    @Override
    public String getDescription() {
        return "OnlyLaptop";
    }

    @Override
    public double getCost() {
        return 70000;
    }
}

abstract class LaptopDecorator implements Laptop {
    protected Laptop decoratedLaptop;

    public LaptopDecorator(Laptop decoratedLaptop) {
        this.decoratedLaptop = decoratedLaptop;
    }

    @Override
    public String getDescription() {
        return decoratedLaptop.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedLaptop.getCost();
    }
}
                                               

class CoverDecorator extends LaptopDecorator {
    public CoverDecorator(Laptop decoratedLaptop) {
        super(decoratedLaptop);
    }

    @Override
    public String getDescription() {
        return decoratedLaptop.getDescription() + ", Cover";
    }

    @Override
    public double getCost() {
        return decoratedLaptop.getCost() + 5000;
    }
}


class StickerDecorator extends LaptopDecorator {
    public StickerDecorator(Laptop decoratedLaptop) {
        super(decoratedLaptop);
    }

    @Override
    public String getDescription() {
        return decoratedLaptop.getDescription() + ", Stickers";
    }

    @Override
    public double getCost() {
        return decoratedLaptop.getCost() + 1000;
    }
}

public class decorator_pattern {
    public static void main(String[] args) {
    
        Laptop laptop = new OnlyLaptop();
        System.out.println("Description: " + laptop.getDescription());
        System.out.println("Cost: " + laptop.getCost());

       
        Laptop laptop_cover = new CoverDecorator(new OnlyLaptop());
        System.out.println("\nDescription: " + laptop_cover.getDescription());
        System.out.println("Cost: " + laptop_cover.getCost());

        Laptop laptop_cover_stickers = new StickerDecorator(new CoverDecorator(new OnlyLaptop()));
        System.out.println("\nDescription: " + laptop_cover_stickers.getDescription());
        System.out.println("Cost: " + laptop_cover_stickers.getCost());
    }
}
