package day21.com.briup.work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Work2_Clinet {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("src\\day21\\com\\briup\\work\\user.txt"));
		String line;
		List<Student> list = new ArrayList<Student>();
		while((line = br.readLine()) != null) {
			String[] spl = line.split(" ");
			list.add(new Student(Integer.parseInt(spl[0]), spl[1],Integer.parseInt(spl[2]) ));
		}
		/*for (Student s : list) {
			System.out.println(s);
		}*/
		Socket socket = new Socket("127.0.0.1",9999);
		
		
		OutputStream os =  socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(list);
		
		oos.close();
		os.close();
		socket.close();
		
		
	}
}
