package Controller.ConnectionStates;

import Controller.Connection;

public class ConnectedState implements ConnectionState {
    @Override
    public void operate(String key, Connection connection) {
        if (key.equals("#"))
        {
            connection.currentMailbox = connection.system.findMailbox(connection.accumulatedKeys);
            if (connection.currentMailbox != null)
            {
                connection.state = Connection.RECORDING;
                connection.state2 = new RecordingState();
                connection.speakToAllInterfaces(connection.currentMailbox.getGreeting());
            }
            else
                connection.speakToAllInterfaces("Incorrect mailbox number. Try again!");
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
