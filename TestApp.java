package pageobjects;

class TestApp 
{
	public static void main(String[] args) {
	int x=100;
	//long count=0;
	System.out.println("Output1");
    System.out.println("----------------------------");
	for(int i = 3; i <= x; i += 3) 
	{
	    //count++;
		
	    System.out.print(+i);
	    System.out.printf("%n");
	}
	System.out.println("Output2");
    System.out.println("----------------------------");
	for(int i = 3; i <= x*2; i += 4) 
	{
		
	    System.out.print(+i);
	    System.out.printf("%n");
	}
	System.out.println("Output3");
    System.out.println("----------------------------");
	for(int i = 3; i <= x*3; i += 5) 
	{
		
	    System.out.print(+i);
	    System.out.printf("%n");
	}
}
}

