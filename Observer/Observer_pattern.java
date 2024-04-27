import java.util.ArrayList;
import java.util.List;

class Channel {
	List <Subscriber> subs = new ArrayList<>();
	private String title;
	
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}	
	
	public void unSubscribe(Subscriber sub) {
		subs.remove(sub);
	}
	
	public void notifySubscribers() {
		for(Subscriber sub:subs)
		{
			sub.update();
		}
	}
	
	public void upload(String title)
	{
		this.title = title;
		notifySubscribers();
	}
}

class Subscriber {
	private String name;
	private Channel channel = new Channel();
	
	public Subscriber(String name) {
		this.name = name;
	}

	public void update() {
		System.out.println("Hello "+ name+ " Your Video is Uploaded");
	}
	
	public void subscribeChannel(Channel ch) {
		channel = ch; 
	}	
}

public class Observer_pattern{

	public static void main(String[] args) {
		
		Channel design_pattern = new Channel();
		
		Subscriber s1 = new Subscriber("Rhythm");
		Subscriber s2 = new Subscriber("Anshul");
		Subscriber s3 = new Subscriber("Parth");
		Subscriber s4 = new Subscriber("Smit");
        Subscriber s5 = new Subscriber("Ishan");
		
		design_pattern.subscribe(s1);
		design_pattern.subscribe(s2);
		design_pattern.subscribe(s3);
		design_pattern.subscribe(s4);
        design_pattern.subscribe(s5);
        design_pattern.unSubscribe(s5);
		
		s1.subscribeChannel(design_pattern);
		s2.subscribeChannel(design_pattern);
		s3.subscribeChannel(design_pattern);
		s4.subscribeChannel(design_pattern);
        s5.subscribeChannel(design_pattern);
		
		design_pattern.upload("Learn Python");
	}

}



