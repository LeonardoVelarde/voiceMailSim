package Model.ConnectionStates;
import Model.*;

public interface ConnectionState {
    void operate(String key, Connection c);
    void record(String voice, Connection connection);
    void hangup(Connection connection);
}
