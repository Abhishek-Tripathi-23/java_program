package practiceQ;

import java.util.Stack;

class reverseString
{
public static void main(String[] args)
{
	String s = "TUF is great for interview";
	s += " ";
	Stack<String> st = new Stack<String>();
	int i;
	String str = "";
	System.out.println(s.length());
	for (i = 0;i < s.length();i++)
	{
		if (s.charAt(i) == ' ')
		{
			st.push(str);
			str = "";
		}
		else
		{
			str += s.charAt(i);
		}
	}
	String ans = "";
	while (st.size() != 1)
	{
		ans += st.peek() + " ";
		st.pop();
	}
	ans += st.peek(); 
	System.out.println("After reversing words: ");
	System.out.println(ans);
	String sr = "";
	System.out.println(sr.length());
}
}