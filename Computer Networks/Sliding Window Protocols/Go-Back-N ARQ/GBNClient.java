/*
Created on Thu Sep 22 02:37:55 2022

@author: shyam
*/
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class GBNClient {
    public static void main(String[] args) {
        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            socket = new Socket("Localhost", 1234);
            System.out.println("\n.......Client........\n");
            System.out.println("Connected with server.\n");

            inputStreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            Scanner scanner = new Scanner(System.in);

            int total = bufferedReader.read();
            System.out.println("Server: Sending " + total + " frames");
            System.out.println("Server: " + bufferedReader.readLine());
            System.out.println("\nEnter the frame number (sequence number) to send acknowledgement.\n");

            while (true) {
                System.out.print("Send Acknowledgement for: ");
                String ack = scanner.next();
                if (ack.equalsIgnoreCase("END"))
                        break;
                bufferedWriter.write(Integer.parseInt(ack));
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (socket != null)
                    socket.close();
                if (inputStreamReader != null)
                    inputStreamReader.close();
                if (outputStreamWriter != null)
                    outputStreamWriter.close();
                if (bufferedReader != null)
                    bufferedReader.close();
                if (bufferedWriter != null)
                    bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
