package Model;
import java.util.ArrayList;
import java.util.List;

/*
 * Created by levelarde on 26-04-16.
 */
public class InterfaceManager {
    private List<UserInterface> interfaces;
    public InterfaceManager(){
        this.interfaces = new ArrayList<>();
    }

    public void addInterface(UserInterface userInterface){
        this.interfaces.add(userInterface);
    }

    public void speakToAllInterfaces(String message){
        for (UserInterface ui : this.interfaces){
            ui.speak(message);
        }
    }
}
