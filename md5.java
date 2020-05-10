  import java.math.BigInteger;
    import java.security.MessageDigest;
    import java.security.NoSuchAlgorithmException;
    public class md5 {
    	public static void main(String[] args) {
		System.out.println("MD5");
    		System.out.println("For null " + md5(""));
    		System.out.println("For simple text "+ md5("This is my text"));
    		System.out.println("For simple numbers " + md5("12345"));
		System.out.println("SHA-1");
		System.out.println("For null " + sha1(""));
    		System.out.println("For simple text "+sha1("This is my text"));
    		System.out.println("For simple numbers " +sha1("12345"));

    	}
    	public static String md5(String input) {
    		String md5 = null;
    		if(null == input) return null;
    		try {
    			//Create MessageDigest object for MD5
    			MessageDigest digest = MessageDigest.getInstance("MD5");
    			//Update input string in message digest
    			digest.update(input.getBytes(), 0, input.length());
    			//Converts message digest value in base 16 (hex) 
    			md5 = new BigInteger(1, digest.digest()).toString(16);
    		}
    		catch (NoSuchAlgorithmException e) {
    			e.printStackTrace();
    		}
    		return md5;
    	}
public static String sha1(String input) {
    		String sha1 = null;
    		if(null == input) return null;
    		try {
    			//Create MessageDigest object for SHA1
    			MessageDigest digest = MessageDigest.getInstance("SHA-1");
    			//Update input string in message digest
    			digest.update(input.getBytes(), 0, input.length());
    			//Converts message digest value in base 16 (hex) 
    			sha1 = new BigInteger(1, digest.digest()).toString(16);
    		}
    		catch (NoSuchAlgorithmException e) {
    			e.printStackTrace();
    		}
    		return sha1;
    	}

    }

