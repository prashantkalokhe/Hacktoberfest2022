/*
Created on Thu Sep 22 02:35:29 2022

@author: shyam
*/
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class GBNServer {
    public static void main(String[] args) throws IOException {
        Socket socket;
        InputStreamReader inputStreamReader;
        OutputStreamWriter outputStreamWriter;
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        ServerSocket serverSocket;

        serverSocket = new ServerSocket(1234);
        System.out.println("\n...........Server..........");
        System.out.println("\nWaiting for connection....");

        try {
            socket = serverSocket.accept();
            System.out.println("\nConnected to: " + socket.getRemoteSocketAddress());
            socket.setSoTimeout(3 * 1000);

            inputStreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            Scanner scanner = new Scanner(System.in);

            System.out.print("\nEnter no. of frames to send: ");
            int total = scanner.nextInt();
            bufferedWriter.write(total);
            bufferedWriter.flush();

            System.out.print("Enter window size: ");
            int n = scanner.nextInt();
            bufferedWriter.write("Size of the window is " + n);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            int sendBase = 0;
            int nextSeqNum = 0;
            int ack;
            int framesSent = 0;


            while (sendBase < total) {
                while (nextSeqNum < sendBase + n && nextSeqNum < total) {
                    bufferedWriter.write(nextSeqNum);
                    bufferedWriter.flush();
                    framesSent++;

                    System.out.println("Sending frame " + nextSeqNum);
                    nextSeqNum++;
                }

                try {
                    ack = bufferedReader.read();
                    if (ack >= sendBase && ack < nextSeqNum) {
                        System.out.println("Received acknowledgment for frame " + ack);
                        sendBase = nextSeqNum = ack + 1;
                    }
                } catch (SocketTimeoutException rto) {
                    System.out.println("Timeout!!!\nRetransmitting Window...\n");
                    nextSeqNum = sendBase;
                }
            }

            System.out.println("\nAll elements sent successfully");
            System.out.println("Total number of frames transmitted(sent + resent): " + framesSent);

            socket.close();
            inputStreamReader.close();
            outputStreamWriter.close();
            bufferedReader.close();
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
