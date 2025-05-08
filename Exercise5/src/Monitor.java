//client
public class Monitor {
    public void turnon(VGA VGACable) {
       System.out.println("Monitor expecting VGA port..."); 
       VGACable.connectwithVGA();
       System.out.println("Monitor is now lit up."); 
    }
    
}
