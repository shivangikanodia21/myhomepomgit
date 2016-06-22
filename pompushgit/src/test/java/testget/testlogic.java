package testget;

import org.testng.annotations.Test;

import act.Get;

public class testlogic {
	
	@Test
	public void testi()
	{
	Get obj=new Get();
	System.out.println(obj.geti());
	System.out.println("finally a success");
	
	}

}
