package DSAlab;

import java.util.Stack;



public class CheckBlanceBracket	{
	

	static boolean CheckBlanceBracketMethod(String bracket) {
		
     Stack<Character> stack= new Stack<Character>();
     
     for (int i=0; i<bracket.length();i++) {
    	char character=bracket.charAt(i);
    	
    	if(character == '('||  character=='['|| character=='{') {
    		stack.push(character);
    		continue;}
    	             
    	if(stack.isEmpty()) { 
    		return false;}
    	
    	char d;
    	
    	switch (character)
    	{ 
    	
    	case '}':
    		d=stack.pop();
    		if(d=='('||d=='[')
    		return false;
    		break;
    		
		case ']':
    		d=stack.pop();
    		if(d=='{'||d=='(')
    		return false;
    		break;
    		
		case ')':
    		d=stack.pop();
    		if(d=='{'||d=='[')
    		return false;
    		break;
    		}      
          
    	}
        return(stack.isEmpty());
        }
     
	
//public static class CheckBlancedBracketMethod {
     public static void main(String args[]) {
     
	 String bracket= "([[({})]])";

	 boolean result= CheckBlanceBracketMethod(bracket);
	
	 if(result) 
		 System.out.println("The entered String has Balanced Brackets");
	 
	 else
		 System.out.println("The entered Strings do not contain Balanced Brackets");
	
	
}}
