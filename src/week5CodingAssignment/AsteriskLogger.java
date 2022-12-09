package week5CodingAssignment;

public class AsteriskLogger implements Logger{ //#3
	
@Override
	public void Log(String log) {
	System.out.println("***"+log+"***"); //#4
}


@Override
public void Error(String error) {
	System.out.println("*****************");
	System.out.println("***Error:"+error+"***"); //#5
	System.out.println("*****************");
}


}
