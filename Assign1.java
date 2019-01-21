
import java.io.File;
import java.io.FilenameFilter;

public class Assign1 {
    public static void main(String[] args) {
        File dir = new File("/home/zadmin");
	System.out.print("Enter the file pattern:");
	java.util.Scanner scanner=new java.util.Scanner(System.in);		
	String fileToBeFound=scanner.nextLine();
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept (File dir, String name) {
		
                return name.matches(".*"+fileToBeFound+".*");
            }
        };
        String[] children = dir.list(filter);
        if (children == null) {
            System.out.println("Either dir does not exist or is not a directory");
        }
        else {
            for (int i = 0; i< children.length; i++) {
                String filename = children[i];
                System.out.println("/home/zadmin/"+filename);
            }
        }
    }
}
