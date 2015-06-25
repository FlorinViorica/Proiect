import java.io.File;

public class DirsAndFiles {

	public static void main(String[] args) {
		File file;
		file = new File("D:/zzzz");
		dirRecurs(file);
//		System.out.println("exists: " + file.exists());
//		System.out.println("is dir: " + file.isDirectory());
//		File[] files = file.listFiles();
//		for (File f : files) {
//			if (!f.isHidden()) {
//				System.out.println(f.getAbsolutePath());
//			}
//		}
	}

	public static void dirRecurs(File file) {
		for (File f : file.listFiles()) {
			System.out.println(f.getName());
			if (f.isDirectory()) {
				dirRecurs(f);
			}
		}
	}

}
