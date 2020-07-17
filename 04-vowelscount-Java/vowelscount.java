// # Write the function vowelCount(s), that takes a string s, 
// # and returns the number of vowels in s, ignoring case, 
// # so "A" and "a" are both vowels. The vowels are "a", "e", "i", "o", and "u". 
// # So, for example, ("Abc def!!! a? yzyzyz!") returns 3 (two a's and one e).


class vowelscount {
	public int fun_vowelscount(String s){
		// your code goes here
		String[] vowel = {"a","e","i","o","u","A","E","I","O","U"};
		String[] sp = s.split("");
		int count = 0;
		for(String a : sp){
			for(String g : vowel){
				if(a.equals(g)){
					count++;
					break;
				}
			}
		}
		return count;
	}
	
}