import java.util.ArrayList;

// Write the function inverseLookAndSay(a) that does the inverse of the previous problem, so that, in general:
//       inverseLookAndSay(lookAndSay(a)) == a
// Or, in particular:
// inverseLookAndSay([(2,3),(1,8),(3,-10)]) == [3,3,8,-10,-10,-10]
// inverseLookAndSay([]) == []
// inverseLookAndSay([(3,1)]) == [1,1,1]
// inverseLookAndSay([(1,-1),(1,2),(1,7)]) == [-1,2,7]
// inverseLookAndSay([(2,3),(1,8),(3,-10)]) == [3,3,8,-10,-10,-10]
// inverseLookAndSay([(2,3),(1,8),(4,3)]) == [3,3,8,3,3,3,3])

public class InverseLookAndSay {
	public static int[] inverseLookAndSay(String a) {
		// Your code goes here
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		String res = "";
		String[] sp = a.split("");
		for(String g : sp){
			if( (g.equals("[")) || (g.equals("(")) || (g.equals(")")) || (g.equals(",")) || (g.equals(" ")) || (g.equals("]")) ){}
			else{res = res + g;}
		}
		if(res.equals("")){
			return new int[0];
		}
		String[] res1 = res.split("");
		for(int i = 0 ; i < res1.length-1 ; i = i + 2){
			int p = Integer.parseInt(res1[i]);
			for(int p2 = 0 ; p2 < p ; p2++){
				ar.add(Integer.parseInt(res1[i+1]));
			}
		}
		int[] res123 = new int[ar.size()];
		int h = 0;
		for(int y : ar){
			res123[h++] = y;
		}
		return res123;
	}
}