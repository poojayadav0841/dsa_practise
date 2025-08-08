import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MirrorStrings {


    private static boolean isMirrorReflected(String s){
        int n=s.length();

        Set<Character> mirrorSet=new HashSet<>(Arrays.asList('A','H','I','M','O','T','U','V','W','X','Y'));

        for(int i=0;i<=n/2;i++){
            char left =s.charAt(i);
            char right=s.charAt(n-1-i);

            if(!mirrorSet.contains(left) || !mirrorSet.contains(right)) return false;

            if(left != right) return false;
        }

        return true;
    }
    public static void main(String args[]){

        String s = "AMAMA";

        /* problem statement-
         * check whether the given strings is mirror reflection or not
         */

         System.out.println("Is given string " + s + " mirror reflection ? " +isMirrorReflected(s));
    }
    
}
