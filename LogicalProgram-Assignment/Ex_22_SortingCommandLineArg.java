package logic_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Ex_22_SortingCommandLineArg {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();

		for(int i=0;i<args.length;i++)
		{
		names.add(args[i]);

		}
		Collections.sort(names);

		for(String s:names)
		{
		System.out.println(s);
		}

	}

}
