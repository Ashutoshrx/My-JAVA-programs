import java.io.*;
class FileInOut {
 public static void main(String args[]) throws IOException {
  int i;
  FileInputStream fin = null;
  FileOutputStream fout = null;
  //first ,confirm that  both files have been specified .
  if (args.length != 2) {
   System.out.println("usage:copyFile from to");
   return;
  }
  //copy a file.
  try {
   //attempt to open the files 
   fin = new FileInputStream(args[0]);
   fout = new FileOutputStream(args[1]);
   do {
    i = fin.read();
    if (i != -1) fout.write(i);
   } while (i != -1);
  } catch (IOException e) {
   System.out.println("I?O error :" + e);
  } finally {
   try {
    if (fin != null) fin.close();
   } catch (IOException e2) {
    System.out.println("Error closing input file");
   }
   try {
    if (fout != null) fout.close();
   } catch (IOException e2) {
    System.out.println("error closing output file");
   }
  }
 }
}