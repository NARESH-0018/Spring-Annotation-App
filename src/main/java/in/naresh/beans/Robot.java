package in.naresh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
    public Robot() {
		System.out.println("Robot :: Constructor");
	}
    @Autowired
    private Chip chip; //To inject chip into Robot
    
    public void doWork() {
    	String Type = chip.chipType();
    	if(Type.equals("32-bit")) {
    		System.out.println("Performence is slow....");
    	}
    }
}
