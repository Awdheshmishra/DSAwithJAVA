package DSA.Strings;

public class SomeMethods {
    public static void main(String[] args){
        //indexOf()
        String s = "Awdhesh Mishra";
        System.out.println(s.indexOf("h"));//always gives 1st matched index
        System.out.println(s.lastIndexOf("h"));//it gives last matched index

        //compareTo()
        String a = "abc";
        String b = "ab";
        System.out.println(a.compareTo(b));

        //contains startWith  endsWith methods
        String c = "Physics Wallah Skills";
        System.out.println(c.contains("Phy"));
        System.out.println(c.startsWith("P"));
        System.out.println(c.endsWith("lls"));

        //toLowerCase() and   concat() methods
        String p = "Awdhesh Mishra is 20 YEAR OLD";
        System.out.println(p.toLowerCase());//lower case directly print kiya jata
        System.out.println(p.toUpperCase());//upper case

        String f = "Awdhesh";
        String g = "Mishra";
        System.out.println(f.concat(" "+g));





    }
}
