
public class ReverseString_WordWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="String Reverse Program";
		String rev="";
		String [] words=str.split("\\s");
	int	len=words.length;
	for(int i=len-1;i>=0;i--){
		rev=rev+words[i] + " ";
	}
	System.out.println(rev);

	}

}
