package day21.com.briup.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Work1_FileClinet {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1",9999);
        System.out.println("���ӵ�������9999....");

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        Scanner sc = new Scanner(System.in);
        File file;
        while(true){
            System.out.println("��������Ч·����");
            String filePath = sc.nextLine();
            file= new File(filePath);
            if (file.exists() == false || file.isFile() == false){
                System.out.println("����·������");
                continue;
            }else{
                break;
            }
        }
        String fileName = file.getName();
        byte[] buff = fileName.getBytes();
        os.write(buff);

        int len;
        String  str = null;
        byte[] buf = new byte[1024];
        len = is.read(buf);
        str = new String(buf,0,len);
        
        if("����".equals(str)){
            socket.close();
            return;
        }
  
        FileInputStream fis = new FileInputStream(file);
        byte[] buff1 = new byte[1000];
        int len1;
        while ((len1 = fis.read(buff1)) > 0){
            os.write(buff1,0,len1);
        }

        System.out.println("�ļ�������ȫ�����ͣ�");

        fis.close();
        socket.close();

    }
}
