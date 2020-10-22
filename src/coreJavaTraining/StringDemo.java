package coreJavaTraining;

public class StringDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="java/training"; //String Literal
		;
		
		//System.out.println(a.charAt(0));
		//System.out.println(a.indexOf("t"));
		//System.out.println(a.substring(0, 4));
		//System.out.println(a.substring(4));
		//System.out.println(a.concat("Rahul"));
		//System.out.println(a.trim());
		
		String arr[]=a.split("/");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("j", "m"));  
		
		
	}

}
