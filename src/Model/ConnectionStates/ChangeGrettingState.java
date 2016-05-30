package Model.ConnectionStates;

import Model.Connection;

public class ChangeGrettingState implements ConnectionState {
    @Override
    public void operate(String key, Connection connection) {
        if (key.equals("#"))
        {
            connection.currentMailbox.setGreeting(connection.currentRecording);
            connection.currentRecording = "";
            connection.state = Connection.MAILBOX_MENU;
            connection.interfaceManager.speakToAllInterfaces(Connection.MAILBOX_MENU_TEXT);
        }
    }

    @Override
    public void record(String voice, Connection connection) {}

    @Override
    public void hangup(Connection connection) {}
}
