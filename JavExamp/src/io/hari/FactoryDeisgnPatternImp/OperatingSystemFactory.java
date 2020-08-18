package io.hari.FactoryDeisgnPatternImp;

public class OperatingSystemFactory {
	public OS getOsInstance(String str){
		if(str.equalsIgnoreCase("android"))
			return new Android();
		else if(str.equalsIgnoreCase("ios"))
			return new Ios();
		else{
			System.out.println("else block");
			
			System.out.println("else block 1");
			
			System.out.println("else block 2");
			
			System.out.println("else block 3");
			return new Windows();
		}
	}
	
}
