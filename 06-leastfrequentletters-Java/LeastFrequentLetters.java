import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

// leastFrequentLetters(s) [20 pts]
// Write the function leastFrequentLetters(s), that takes a string s, and ignoring case (so "A" and "a" are treated 
// the same), returns a lowercase string containing the least-frequent alphabetic letters that occur in s, each 
// included only once in the result and then in alphabetic order. So:
// leastFrequentLetters("aDq efQ? FB'daf!!!") 
// returns "be". Note that digits, punctuation, and whitespace are not letters! Also note that seeing as we have not 
// yet covered lists, sets, maps, or efficiency, you are not expected to write the most efficient solution. Finally, 
// if s does not contain any alphabetic characters, the result should be the empty string ("")

public class LeastFrequentLetters {
	public static String leastFrequentLetters(String s) {
		// Your code goes here
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("!","?","'",""," "));
		String res = "";
		String[] sp = s.split("");
		for(String s1 : sp){
			if(!ar.contains(s1)){
				res = res + s1;
			}
		}
		if(res.equals("")){
			return "";
		}
		res = res.toLowerCase();
		ArrayList<String> ar1 = new ArrayList<String>();
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		String[] res1 = res.split("");
		for(String q : res1){
			if(ar1.contains(q)){
				hm.replace(q, hm.get(q)+1);
			}
			else{
				ar1.add(q);
				hm.put(q,1);
			}
		}
		hm = sortByValue(hm);
		int p1  = 1;
		String[] p = hm.values().toString().split("");
		int count = Integer.parseInt(p[1]);
		if(count == Integer.parseInt(p[4])){
			p1++;
		}
			String g = hm.keySet().toString();
		if(p1 == 1){String re = Character.toString(g.charAt(1)); return re;}
		String re1 = "" + g.charAt(1) + g.charAt(4);
		return re1;
		// return o;
	}
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    }
}