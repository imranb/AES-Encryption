import java.util.*;
import java.io.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;



public class AES_Encryption  {
public static void main(String[] args) throws Exception {
      
      @SuppressWarnings("resource")
	String inpStr = new Scanner(new File("Input.txt")).nextLine();
      FileOutputStream outpStr = new FileOutputStream("Output.txt");
      BufferedOutputStream output = new BufferedOutputStream(outpStr);
      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
	   String key1="ADFCEHASCXRTFIKH";
	   byte[] b=key1.getBytes();
      SecretKeySpec key = new SecretKeySpec(b, "AES");

      cipher.init(Cipher.ENCRYPT_MODE, key);
      byte[] cipherText = cipher.doFinal(inpStr.getBytes());
      System.out.println("ENCRYPTED String:\n"+new String(cipherText, "UTF8") );
      output.write(cipherText);
      output.flush();
      output.close();

    }
}