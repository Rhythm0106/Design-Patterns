import java.util.ArrayList;
class Laptop {
	private int L_id;
	private String L_name;
    private String RAM;
    private String CPU;
	public int getL_id() {
		return L_id;
	}
	public void setL_id(int L_id) {
		this.L_id = L_id;
	}
	public String getL_name() {
		return L_name;
	}
	public void setL_name(String L_name) {
		this.L_name = L_name;
	}
    public String getRAM() {
        return RAM;
    }
    public void setRAM(String RAM){
    this.RAM = RAM;
    }
    public String getCPU() {
    return CPU;
    }
    public void setCPU(String CPU) {
    this.CPU = CPU;
    }
	
	public String toString() {
        return " \nLaptop[ L_id = " + L_id + ", L_name = " + L_name + "  RAM = " + RAM + ", CPU = " + CPU + "]";
	}
}
class LaptopShop implements Cloneable{
	private String shopName;
	ArrayList<Laptop> Laptops = new ArrayList();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public ArrayList<Laptop> getLaptops() {
		return Laptops;
	}
	public void setLaptops(ArrayList<Laptop> laptops) {
		this.Laptops = laptops;
	}
	
	public void loadData() {
		for(int i = 1;i<=10; i++)
		{
			Laptop L = new Laptop();
            String name =  "i" + i;
            String name1 =  2*i + "GB";
            L.setCPU(name);
            L.setRAM(name1);
			L.setL_id(i);
			L.setL_name("Laptop"+i);
			getLaptops().add(L);
		}
	}
	
	protected Object clone() throws CloneNotSupportedException {
				return super.clone();
	}
	public String toString() {
		return "LaptopShop [ shopName = "  + shopName + ", Laptops = " + Laptops + "]";
	}
}
public class Shallow_Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		 LaptopShop ls = new  LaptopShop();
		ls.setShopName("DELL");
		ls.loadData();
		ls.getLaptops().remove(3);
		System.out.println(ls);

		LaptopShop ls1 = (LaptopShop) ls.clone();
		ls1.setShopName("Lenovo");
		System.out.println();
        System.out.println(ls1);
		
	}

}

