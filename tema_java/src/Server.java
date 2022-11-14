import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;

public class Server {

    private static Server instance = null;
    private ServerSocket server = null;
    private int port;

    private static ReentrantLock mutex = new ReentrantLock();

    private static ArrayList<BHuman> persons = new ArrayList<BHuman>();

    private Server(int port) {
        try {
            System.out.println("Server has started!");
            this.port = port;
            this.server = new ServerSocket(this.port);
            this.server.setReuseAddress(true);

            while (true) {
                Socket client = server.accept();

                System.out.println("New client connected " + client.getInetAddress().getHostAddress());

                ClientHandler clientSock = new ClientHandler(client);
                new Thread(clientSock).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Server getInstance(int port) {
        if(instance==null) {
            instance=new Server(port);
        }
        return instance;
    }

    public static void addPerson(BHuman obj) {
        mutex.lock();
        persons.add(obj);
        persons.sort(BHuman::compareTo);
        mutex.unlock();
    }

    public static ArrayList<BHuman> getData()
    {
        return persons;
    }
}
