// You can use this class to represent how classy someone
// or something is.
// "Classy" is interchangable with "fancy".
// If you add fancy-looking items, you will increase
// your "classiness".
// Create a function in "Classy" that takes a string as
// input and adds it to the "items" list.
// Another method should calculate the "classiness"
// value based on the items.
// The following items have classiness points associated
// with them:
// "tophat" = 2
// "bowtie" = 4
// "monocle" = 5
// Everything else has 0 points.
// Use the test cases below to guide you!

import java.util.ArrayList;
import java.util.List;

public class Classy {
    ArrayList<String> p =new ArrayList<String>();

    public void addItem(String a){
        p.add(a);
    }

    public int classiness(){
        int n = 0;
        for(String s : p){
        
        if(s.equals("tophat")){
            n = n + 2;
        }
        else if(s.equals("bowtie")){
            n = n + 4;
        }
        else if(s.equals("monocle")){
            n = n + 5;
        }
        
    }
    p.clear();
    return n;
}
    public static void main(String[] args) {
        
    }
    

}
