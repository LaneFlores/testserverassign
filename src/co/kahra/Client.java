package co.kahra;// PURPOSE: 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {


    public static void main(String[] args){
    System.out.println("Hi");
    try {
        Socket socket = new Socket("localhost", Main.PORT);
        System.out.println("Made Socket");
        BufferedReader in;
        PrintWriter out;

        in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
int thing = 0;
        out.println("Hi");
        System.out.println(in.readLine());
        System.out.println(in.readLine());
        System.out.println(in.readLine());
        System.out.println(in.readLine());
        System.out.println(in.readLine());



    } catch(IOException ex)
    {}






    }
}














































