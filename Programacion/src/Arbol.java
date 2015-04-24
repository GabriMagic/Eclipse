import java.io.File;

public class Arbol {
	
	public static void main (String[] args){
		File f = new File (".");
		System.out.println("(RAIZ)");
		listar(f,">");
		
	}
	
		public static void listar(File dir, String guion){
			File[] l;
			System.out.println("(D ))");
			System.out.println(dir.getAbsolutePath());
			l=dir.listFiles();
			
			
			for (File file : l){
				if (file.isDirectory())
					listar(file,"-"+guion);
				else 
					if (file.isFile())
					System.out.print("(F) ");
				System.out.println(file);
			}
			
		
	}
	
}
