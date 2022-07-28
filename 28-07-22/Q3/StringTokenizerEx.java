import java.util.StringTokenizer;

class StringTokenizerEx{
	public static void main(String[] args){
		StringTokenizer s = new StringTokenizer("rum soda arsha limbu bumchick baba"," ");	
		while(s.hasMoreTokens()){
			System.out.println(s.nextToken());	
		}
	}
}


/* 
Five predefined methods are :
1. length()
2. trim()
3. IndexOf()
4. replace()
5. append()
*/