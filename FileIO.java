import java.io.*;
import java.util.*;
import java.net.*;

public class FileIO{

	public static void readFileAsByteStream() throws IOException {
		InputStream in1 = new FileInputStream("W3D1B.txt"); 
		int x;
		while ((x=in1.read()) != -1) { // while not end of file
			System.out.print((char) x); 
		}
		in1.close();
	}

	public static void readFileAsCharStream() throws IOException {
		FileReader in1 = null;
		try {
			in1 = new FileReader("W3D1B.txt");
			int x;
			while ((x=in1.read()) != -1) {
				System.out.print((char)x);
			}
		}
		finally{
			if (in1!=null) 
				in1.close();
		}
	}

	public static void readingWithBuffering () throws IOException {
		FileReader in1 = null; 
		BufferedReader br = null; 
		try{
			in1 = new FileReader("W3D1B.txt"); 
			br = new BufferedReader(in1); // can also be a oneliner

			String x;
			while ((x=br.readLine()) != null) {
				System.out.println(x);
			}
		}
		finally{
			if (br !=null) 
				br.close();
		}
	}

	public static void readingWithBufferAndInputStream() throws IOException{
		FileInputStream in1 = null; 
		BufferedReader br = null; 
		try{
			in1 = new FileInputStream("W3D1B.txt"); 
			br = new BufferedReader(new InputStreamReader(in1)); // can also be a oneliner
			String x;
			while ((x=br.readLine()) != null) {
				System.out.println(x);
			}
		}
		finally{
			if (br !=null) 
				br.close();
		}
	}

	public static void writingWithPrintWriter(){ 
		PrintWriter pw=null;
		try{
			pw = new PrintWriter("trial.txt"); 
			pw.println("done"); 
			pw.println("done");
			pw.close();
		}
		catch(Exception e){ 
			System.out.println(e.toString());
		}
	}

	public static void writingWithBufferedWriter(){ 
		FileWriter fw=null;
		BufferedWriter bw=null;
		try{
			bw = new BufferedWriter(new FileWriter("test.txt")); // bw = new BufferedWriter(new FileWriter("test.txt", true)); to set to append mode
			bw.write("done");
			bw.newLine();
			bw.write("done");
			bw.flush();
			bw.close(); 
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}

	public static void keyboardBasic() {
		try(BufferedReader br = new BufferedReader
			(new InputStreamReader(System.in))) 
		// try with resources. allows autoclose
		// inputstreamreader converts byte stream to character stream
		// system.in is a byte stream and buffered reader is a char stream
		{
			String inputText = null;
			System.out.print("Enter a text: "); //inputText = input("Enter a text: ")
			inputText = br.readLine();
			System.out.println("what was entered was " + inputText);
		}
		catch (Exception e){ 
			System.out.println("Error"+e.toString()); 
		}
		System.out.println("finished");
	}

	public static void keyboardWithScanner() //throws IOException 
	{
		try(Scanner sc = new Scanner(System.in)) {
			String inputText=null;
			inputText=sc.next();
			System.out.println("what was entered was .." + inputText);
		}
		catch (Exception e){
			System.out.println("Error -Other Exception "+ e.toString()); 
		}
		System.out.println("finished"); 
	}

	public static void readingFileWithScanner(){ 
		Scanner sc = null;
		try{
			sc= new Scanner(new FileReader("test.txt")); 
			while (sc.hasNext()) 
				System.out.println(sc.next());
			sc.close(); 
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}

	/*public static void writingObjectsToFile() throws IOException, FileNotFoundException{
		// add error checking
		FileOutputStream fos = new FileOutputStream("t.tmp"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeInt(12345); 
		oos.writeObject("Today"); 
		oos.writeObject(new Date());
		oos.close();
	}*/

	static class Student implements Serializable{ 
		String surname;
		int age;
		float GPA; 
	}

	public static void writeSerializableData() throws Exception {
		Student s1 = null;
		s1 = new Student(); 
		s1.surname="Mensah"; 
		s1.age=44;
		s1.GPA=4;
		try(FileOutputStream fos = new FileOutputStream("serialized.txt")){
			try(ObjectOutputStream out = new ObjectOutputStream(fos)){
				out.writeObject(s1);
				System.out.printf("Saved!"); 
			}
			catch(IOException e){
				System.out.println(e.toString());
				e.printStackTrace(); 
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
			e.printStackTrace(); 
		}
	}

	public static void readBack(){ 
		Student s=null;
		try( FileInputStream fis = new FileInputStream("serialized.txt")){ 
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				s = (Student) ois.readObject();
			}
			catch(IOException e){ 
				System.out.println(e.toString()); 
				return;
			}
		}
		catch(ClassNotFoundException c){
			System.out.println("Student class not found\n"+c.toString()); 
			return;
		}catch(Exception e){ 
			System.out.println(e.toString()); 
			return;
		}
		System.out.println("Student Info is "); 
		System.out.println("Name: " + s.surname); 
		System.out.println("Age: " + s.age); 
		System.out.println("GPA: " + s.GPA);
	}

	public static void goodPractice() {
		try{
			FileWriter fw = new FileWriter("outputext.txt"); 
			try{
				PrintWriter pw = new PrintWriter(fw); 
				for (int i=0; i<10; i++)
					pw.println("this is line "+i);
			}
			finally{ 
				fw.close();
			}
		}
		catch (FileNotFoundException e){ 
			System.out.println("Error"+ e.toString());
		}
		catch (IOException e){
			System.out.println("Error"+e.toString());
		}
		catch (Exception e){
			System.out.println("Error "+e.toString()); 
		}
	}

	public static void java7AndAbove()
	{
		try(BufferedReader br = new BufferedReader(new FileReader("W3D1B.txt"));
			PrintWriter pw = new PrintWriter(new FileWriter("testfw2.txt"))) {
			for (int i=0; i<12; i++) 
				pw.println("this is line "+i);
		}
		catch (FileNotFoundException e){
			System.out.println("Error finding file "+e.toString());
		}
		catch (IOException e){
			System.out.println("Error IO Exception "+e.toString());
		}
		catch (Exception e){
			System.out.println("Error -Other Exception "+e.toString());
		}
	}

	public static void usingFileObject(){
		File dir =new File("sub");
		try{
			System.out.println(
				"name= "+dir.getName()+ "\n"+ 
				"canRead "+ dir.canRead() +"\n"+ 
				"canWrite "+ dir.canWrite()+ "\n"+ 
				"exists "+ dir.exists() +"\n"+
				"getAbsolutePath "+ dir.getAbsolutePath() +"\n"+ 
				"getCanonicalPath "+ dir.getCanonicalPath()+"\n"+ 
				"getName "+ dir.getName() +"\n"+
				"getParent "+ dir.getParent() +"\n"+
				"getPath "+ dir.getPath() +"\n"+ 
				"isAbsolute "+ dir.isAbsolute() +"\n"+ 
				"isDirectory "+ dir.isDirectory()+ "\n"+ 
				"isFile "+ dir.isFile() +"\n"+ 
				"lastModified "+ dir.lastModified() +"\n"+ 
				"length "+ dir.length()+"\n"
			);
			if (dir.isDirectory()) {
				String dirList[]= dir.list();
				for (int i=0;i<dirList.length;i++)
					System.out.println(dirList[i]);
			}
		}
		catch(IOException e){ 
			System.out.println("error "+e.toString());
		}
	}

	public static void readingFromWebpage() {
		try {
			URL url = new URL("http://www.ashesi.edu.gh");
			InputStream urlIN = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(urlIN));
			String line;
			while ((line = br.readLine()) != null)
				System.out.println(line ); 
		} 
		catch(Exception ex) {
			System.out.println(ex.toString()); 
		}
	}

	public static void usingURLConnectionInstance() throws Exception {
		try {
			URL url = new URL("http://www.ashesi.edu.gh");
			URLConnection urlCon = url.openConnection(); 
			InputStream in= urlCon.getInputStream(); 
			BufferedReader br = new BufferedReader(new InputStreamReader(in)); 
			String line;
			while ((line = br.readLine()) != null) 
				System.out.println(line );
			br.close();
		} 
		catch(Exception ex) { 
			System.out.println(ex.toString());
		} 
	}

	public static void propertiesOfConnection() throws MalformedURLException{
		URL mURL = new URL("http://campus:80/home.htm"); 
		System.out.println("protocol = " + mURL.getProtocol()); 
		System.out.println("host = " + mURL.getHost()); 
		System.out.println("filename = " + mURL.getFile()); 
		System.out.println("port = " + mURL.getPort()); 
		System.out.println("ref = " + mURL.getRef()); 
		System.out.println("ref = " + mURL.toExternalForm());
	}

	public static void readImage() throws IOException{
		InputStream in1 = new FileInputStream("projects.png"); 
		int x;
		while ((x=in1.read()) != -1) { // while not end of line
			System.out.print(x); 
		}
		in1.close();
	}

	public static void readImageAndWrite() throws IOException{
		InputStream in1 = new FileInputStream("projects.png"); 
		OutputStream fos = new FileOutputStream("newprojects.png"); 
		int x;
		while ((x=in1.read()) != -1) { // while not end of line
			//System.out.print((char)x); 
			fos.write(x);
		}
		in1.close();
		fos.close();
	}

	public static void readAndWriteToAnotherFile() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("W3D1B.txt"));
		PrintWriter pw = new PrintWriter("newfile.txt");
		String s = null;
		while((s = br.readLine()) != null){
			pw.println(s);
		}
		br.close();
		pw.close();
	}

	public static void readImageWriteImage() throws IOException{
		InputStream is = new FileInputStream("projects.png");
		OutputStream os = new FileOutputStream("newproject.png");
		int b;
		while((b = is.read()) != -1){
			os.write(b);
		}
		is.close();
		os.close();
	}

	public static void main(String args[]){
		try{
			keyboardBasic();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}