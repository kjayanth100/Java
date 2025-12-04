package EasyProblemSolvinf;

public class MiddleString {
    public static void main(String[] args) {
    	String str="Jayanth";
    	int len=str.length();
    	int mid=len/2;
    	if(len%2==0) {
    		System.out.println(str.charAt(mid-1)+""+str.charAt(mid));
    	}
    	else {
    		System.out.println(str.charAt(mid));
    	}
//    	String str="6969";
//    	int len=str.length();
//    	int mid=len/2;
//    	if(len%2==0) {
//    		System.out.println(str.substring(mid-1,mid+1));;
//    	}
//    	else {
//    		System.out.println(str.charAt(mid));
//    	}
//}
}
}