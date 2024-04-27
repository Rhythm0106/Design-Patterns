class Laptop {
	private String ram;
	private String name;
    private String type;

	public String getRAM() {
		return ram;
	}

	public void setRAM(String ram) {
		this.ram = ram;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

class LaptopView {
	public void printLaptopDetails(String laptopName, String laptopRAM, String laptopType) {
		System.out.println("Laptop:");
		System.out.println("Name: " + laptopName);
		System.out.println("RAM: " + laptopRAM);
        System.out.println("Type: " + laptopType);
	}
}

class LaptopController {
	private Laptop model;
	private LaptopView view;

	public LaptopController(Laptop model, LaptopView view) {
		this.model = model;
		this.view = view;
	}

	public void setLaptopName(String name) {
		model.setName(name);
	}

	public String getLaptopName() {
		return model.getName();
	}

	public void setLaptopRAM(String ram) {
		model.setRAM(ram);
	}

    public String getLaptopRAM() {
		return model.getRAM();
	}

	public String getLaptopType() {
		return model.getType();
	}

	public void setLaptopType(String type) {
		model.setType(type);
	}

	
	public void updateView() {
		view.printLaptopDetails(model.getName(), model.getRAM(), model.getType());
	}
}

public class MVC_pattern {
	public static void main(String[] args) {
		Laptop model = retriveLaptopFromDatabase(); 

		LaptopView view = new LaptopView();

		LaptopController controller = new LaptopController(model, view);

		controller.updateView();

		controller.setLaptopName("Lenovo");

		controller.setLaptopRAM("8GB");

		controller.setLaptopType("Office");

		controller.updateView();
	}

	private static Laptop retriveLaptopFromDatabase() {
		Laptop laptop = new Laptop();
		laptop.setName("DELL");
		laptop.setRAM("16GB");
        laptop.setType("Gaming");
		return laptop;
	}
}
