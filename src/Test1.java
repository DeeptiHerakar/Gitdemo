
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="faith", nstr="";
		char ch;
		System.out.println("Original word "+ str);
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
		nstr=ch+nstr;
		
	}
	System.out.println("reversed string "+ nstr);*/
		String input= "Deepti";
		/*StringBuilder input1= new StringBuilder(input);
		input1.append(input);
		input1.reverse();
		System.out.println(input1);*/
		
		char ch[]=input.toCharArray();
		for (int i=ch.length-1;i>=0;i++)
			System.out.println(ch[i]);
	}

}
