package Model.ConnectionStates;
import Model.*;

public class RecordingState implements ConnectionState{

    @Override
    public void operate(String key, Connection connection) {
        if (key.equals("#"))
        {
            if (connection.currentMailbox.checkPasscode(connection.accumulatedKeys))
            {
                connection.state = connection.MAILBOX_MENU;
                connection.state2 = new MailBoxMenuState();
                connection.interfaceManager.speakToAllInterfaces(connection.MAILBOX_MENU_TEXT);
            }
            else
                connection.interfaceManager.speakToAllInterfaces("Incorrect passcode. Try again!");
            connection.accumulatedKeys = "";
        }
        else
            connection.accumulatedKeys += key;
    }

    @Override
    public void record(String voice, Connection connection) {}

    @Override
    public void hangup(Connection connection) {}
}
