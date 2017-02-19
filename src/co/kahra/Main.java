package co.kahra;

import javax.sound.sampled.Port;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    // Comment for committing
    public static final int PORT = 42529;

    public static void main(String[] args) {

        Socket socket= null;


        try {
            ServerSocket server = new ServerSocket(PORT);
            socket = server.accept();
            ObjectInputStream objIn;
            ObjectOutputStream objOut;
            System.out.print("Creating... ");
            //ObjectInputStream objIn = new ObjectInputStream(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            System.out.print("out ");
            objOut = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("objOut.");
          //  objIn = new ObjectInputStream(socket.getInputStream());
            System.out.print("objIn ");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.print("in ");
            out.println("hello from server");
            out.println("thing=14");
            System.out.println(in.readLine());
            System.out.println(in.readLine());
            System.out.println(in.readLine());
            System.out.println(in.readLine());
            System.out.println(in.readLine());


        } catch (IOException ex) {
            System.out.println("User creation error.");
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}





























































