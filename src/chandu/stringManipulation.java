package chandu;

public class stringManipulation {
	  
	public static void main(String[] args) {
		
	
	
	String s = new String("I am* not a rabot");
	
    System.out.println(s.length());
    System.out.println(s.charAt(6));
   System.out.println(s.indexOf("a"));
    System.out.println(s.indexOf("a",3));
   // System.out.println(s.indexOf('a',s.indexOf('a')+1,s.indexOf('a'))+1);
    int c=s.indexOf("b");
     c--;
    //int d = c-1;
     
    
    System.out.println(c);
    
    //subString
   System.out.println(s.substring(0,8));
    
    //trim
    String s1 = new String("  hello sindhu  ");
    System.out.println(s1.trim());
    System.out.println(s1.replace(" ",""));
    System.out.println(s1.replace("s","S"));
    
    //split
    String S = "Iam not a robot";
     String S1[] = S.split("r");
     for(int i=0;i<S1.length;i++) {
    	 
    	    System.out.println(S1[i]);
	 
     }
    
    
    
}
}