/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes;

/**
 *
 * @author ESTIENNE
 */
import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import project_asi_1.Classes.utils.Prop;

/**
 *
 * @author ESTIENNE
 */
public class Ssh {

    final private String userName;
    final private String password;
    final private String host;

    public Ssh(String userName, String password, String host) {
        this.userName = userName;
        this.password = password;
        this.host = host;

    }

    public Ssh() {
        this.userName = Prop.getUserSsh();
        this.host = Prop.getHoteSsh();
        this.password = Prop.getmdpSsh();
    }

    public void sshCommand(ArrayList<String> listCommand) throws IOException, SQLException {
        Connection connection = null;
        try {
            connection = connectTo(host, userName, password);
            exectCommand(listCommand, connection);
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    private Connection connectTo(String host, String userName, String password) throws IOException {
        Connection connection = new Connection(host);
        connection.connect();
        connection.authenticateWithPassword(userName, password);

        return connection;
    }

    private void exectCommand(ArrayList<String> listCommand, Connection connection) throws IOException {
        List<String> result = new LinkedList<>();
        Session session = null;
        String test = "";
        try {
            session = connection.openSession();
            System.out.println("connection ouverte");
            for (String command : listCommand) {
                if (test == "") {
                    test = command;
                } else {
                    test = test + "\n" + command;
                }
                System.out.println("commands exect " + command);
            }
            System.out.println(test);
            session.execCommand(test);
            InputStream stdout = new StreamGobbler(session.getStdout());
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
