package day21.com.briup.work;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Work1_FileServer {
    public static void main(String[] args) throws Exception{
        //1.搭建服务器
        ServerSocket server = new ServerSocket(9999);
        //2.接收客户端的连接
        Socket socket = server.accept();

        //3.获取对应的操作流
        InputStream is = socket.getInputStream();
        OutputStream os =socket.getOutputStream();

        PrintStream ps = new PrintStream(os);


        byte[] buff= new byte[1024];
        int len = is.read(buff);
        String str = new String(buff,0,len);
        System.out.println("从客户端收到的文件名：" + str);

        File file = new File("src",str);
        if(file.exists() && file.isFile()){
            //返回文件存在
            ps.print("存在");

            socket.close();
            server.close();
            return;
        }else{
            ps.print("不存在");
        }

        FileOutputStream fos = new FileOutputStream(file);
        System.out.println(file);
        byte[] buff1 = new byte[1000];
        int len1;
        while( (len1 = is.read(buff1)) > 0){
                fos.write(buff1,0,len1);
        }
        fos.close();
        socket.close();
        server.close();

    }
}
