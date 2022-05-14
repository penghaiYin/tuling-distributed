package com.yph.bio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 类说明：单线程版Bio通信的服务端，无法正常工作
 */
public class Server {

    public static void main(String[] args) throws IOException {
        //服务端启动必备
        ServerSocket serverSocket = new ServerSocket();
        //表示服务端在哪个端口上监听
        serverSocket.bind(new InetSocketAddress(8888));
        System.out.println("Start Server ....");
        int connectCount = 0;
        try {
            while (true) {
                Socket socket = serverSocket.accept(); // 在这里会阻塞

                System.out.println("accept client socket ....total =" + (++connectCount));
                //实例化与客户端通信的输入输出流
                try (ObjectInputStream inputStream =
                             new ObjectInputStream(socket.getInputStream());
                     ObjectOutputStream outputStream =
                             new ObjectOutputStream(socket.getOutputStream())) {

                    // 接收客户端发送的数据，也就是服务端的输入
                    String userName = inputStream.readUTF();
                    System.out.println("Accept client message:" + userName);

                    // 服务端的输出，也就是客户端的输入
                    outputStream.writeUTF("Hello," + userName);
                    outputStream.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } finally {
            serverSocket.close();
        }

    }
}
