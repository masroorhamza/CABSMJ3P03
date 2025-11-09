package week7;

public class stringreverse{
    public static void main(String[] args){
        String s="reverse";
        System.out.println("String before reversing: "+s);
        //creating a stringbuilder for s:
        int len=s.length();
        char rev[]=new char[len];
        for(int i=0,j=len-1;i<len;i++){
            rev[i]=s.charAt(j);
            j--;
        }
        String reverse=new String(rev);
        System.out.print("String after reversing: "+reverse);
    }
}