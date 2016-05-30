package Model.ConnectionStates;

import Model.*;

public class MailBoxMenuState implements ConnectionState{

    @Override
    public void operate(String key, Connection connection) {
        if (key.equals("1"))
        {
            connection.state = connection.MESSAGE_MENU;
            connection.speakToAllInterfaces(connection.MESSAGE_MENU_TEXT);
        }
        else if (key.equals("2"))
        {
            connection.state = connection.CHANGE_PASSCODE;
            connection.speakToAllInterfaces("Enter new passcode followed by the # key");
        }
        else if (key.equals("3"))
        {
            connection.state = connection.CHANGE_GREETING;
            connection.speakToAllInterfaces("Record your greeting, then press the # key");
        }
    }

    @Override
    public void record(String voice, Connection connection) {}

    @Override
    public void hangup(Connection connection) {}
}
