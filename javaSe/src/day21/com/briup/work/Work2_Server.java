package day21.com.briup.work;


import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;


public class Work2_Server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(9999);
		
		Socket socket = server.accept();
		
		InputStream is = socket.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(is);
		
		List<Student> list = (List<Student>) ois.readObject();
		for (Student s : list) {
			System.out.println(s);
		}
		
		ois.close();
		is.close();
		socket.close();
		server.close();
		
	}

}
