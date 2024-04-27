interface LaptopStartState {
    public void alert(AlertState x);
}

class AlertState {
    private LaptopStartState currentState;

    public AlertState() {
        currentState = new Start();
    }

    public void setState(LaptopStartState state) {
        currentState = state;
    }

    public void alert() {
        currentState.alert(this);
    }
}

class Start implements LaptopStartState {

    
    public void alert(AlertState x) {
        System.out.println("Your laptop is starting........");
    }
}
class Sleep implements LaptopStartState {

    
    public void alert(AlertState x) {
        System.out.println("Your laptop is sleeping......");
    }

}

class ShutDown implements LaptopStartState {
    public void alert(AlertState x){
        System.out.println("Shutting Down Windows......");
        System.out.println("Jsk");
    }
}

class Restart implements LaptopStartState{
    public void alert(AlertState x) {
        System.out.println("Your laptop is restarting.....");
    }
}


public class State_Design_Pattern {
    public static void main(String[] args) {
        AlertState stateContext = new AlertState();
        stateContext.alert();
        stateContext.setState(new Sleep());
        stateContext.alert();
        stateContext.setState(new Start());
        stateContext.alert();
        stateContext.setState(new ShutDown());
        stateContext.alert();
    }
}