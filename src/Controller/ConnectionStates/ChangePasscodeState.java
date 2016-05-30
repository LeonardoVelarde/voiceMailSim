package Controller.ConnectionStates;

import Controller.Connection;

public class ChangePasscodeState implements ConnectionState{
    @Override
    public void operate(String key, Connection connection) {
        if (key.equals("#"))
        {
            connection.currentMailbox.setPasscode(connection.accumulatedKeys);
            connection.state = Connection.MAILBOX_MENU;
            connection.state2 = new MailBoxMenuState();
            connection.interfaceManager.speakToAllInterfaces(Connection.MAILBOX_MENU_TEXT);
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
