// # A Caesar Cipher is a s.charAt(i)mple cipher that works by shifting each letter in 
// # the given message by a certain number. For example, if we shift the message 
// # "We Attack At Dawn" by 1 letter, it becomes "Xf Buubdl Bu Ebxo"
// # Write the function applyCaesarCipher(message, shift) which shifts the given 
// # message by shift letters. You are guaranteed that message is a string, and 
// # that shift is an integer between -25 and 25. Capital letters should stay capital 
// # and lowercase letters should stay lowercase, and non-letter characters should not be changed. 
// # Note that "Z" wraps around to "A". So, for example:
// # assert(applyCaesarCipher("We Attack At Dawn", 1) == "Xf Buubdl Bu Ebxo")
// # assert(applyCaesarCipher("zodiac", -2) == "xmbgya")

class applycaesarcipher {
	public static String fun_applycaesarcipher(String msg, int shift){
		// your code goes here
		// String[] sp = msg.split("");
		String res = "";
		for(int i = 0; i < msg.length() ; i++){
			
			char ch = msg.charAt(i);
			if(ch == ' '){
				res = res + " ";
			}
			else{
			int ascii = (int)ch;
			ascii = ascii + shift;
			if(ascii > 122){
				ascii = 97 + (ascii%122);
			}
			if(ascii < 97){
				int rem = 97 - ascii;
				ascii = 122-rem;
			}
			System.out.println(ascii+ " "+ch);
			char s = (char)ascii;
			res = res + s;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(fun_applycaesarcipher("zodiac", -2));
	}
	
}