package Utilities;



import java.io.*;

/**
 * A class that implements the Java FileFilter interface.
 */
public class JavaFileFilter implements FileFilter
{

  public boolean accept(File file)
  {
  
      String javaFileExtension = new String("java");
	if (file.getName().toLowerCase().endsWith(javaFileExtension))
        return true;
      
   
    return false;
  }
}