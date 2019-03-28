class stringMethod{
 public static void main(String[] args){
 	String s1 = "hello";
 	String s2 = " world";
 	//concating a string
 	//using "+" operator.1
 	System.out.println(s1+""+s2);
 	//using concat method .2 
 	System.out.println(s1.concat(s2));
 	String s3 = (s1.concat(s2));
 	System.out.println(s3);

 	//changing the cases of string
 	System.out.println(s3.toUpperCase());
 	System.out.println(s3.toLowerCase());

 	//UNICODE value of character in a string
 	System.out.println(s3.codePointAt(0));
 	System.out.println(s2.codePointAt(1));

 	//comparing two strings
 	System.out.println(s2.equals("hello"));
 	System.out.println(s1.equals("hello"));

 	//startsWith
 	System.out.println(s3.startsWith("world"));
 	//endsWith
 	System.out.println(s3.endsWith("world"));

 	//remove whitespaces extremeends of string
 	System.out.println(s2);
 	System.out.println(s2.trim()); 

 	//substring
 	System.out.println(s3.substring(4,8));
 	//split a string
    
}
}