package exercise;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection implements Connection {
    private String ip;
    private Integer port;
    private Connection connection;

    public TcpConnection(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
        this.connection = new Disconnected(this);

    }

    public Connection getConnection() {
        return connection;
    }
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    @Override
    public String getCurrentState() {
        return this.connection.getCurrentState();
    }

    @Override
    public void connect() {
        connection.connect();
    }

    @Override
    public void disconnect() {
        connection.disconnect();
    }
    public Connection getCurrentStateS() {
        return connection;
    }
    @Override
    public void write(String data) {
        this.getCurrentStateS().write(data);
    }
}
// END
