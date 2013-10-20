import java.io.Console;
import java.util.*;

/**
 * 
 */

/**
 * @author levy
 *
 */
public class TimeFunc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date b = GetTime();
		int ask= 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("How Many Loops ? ");
		ask=reader.nextInt();
		if (ask>12) {
			System.err.println("Toot Much !");
			return;
			
		}
		for (int i = 0; i < ask; i++) {
			System.out.print(i+"\r\n"+i+"\t"+ b.toString()+"\t");
			for	(int a =0; a<i;a++)
		    Snooze();			
		}
	}
	
	public static Date GetTime () {	
		Date dd = new Date();
		return dd;
	}
	
	public static void Snooze ()
	{
		System.out.print("zzzz");
	}

}
