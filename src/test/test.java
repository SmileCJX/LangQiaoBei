package test;

import java.util.Calendar;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class test {

	@Test
	public void test(){
		long beginTimeMillis = System.currentTimeMillis();
		long sum = 0;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		long endTimeMillis = System.currentTimeMillis();
		System.out.println(sum+"   "+ (endTimeMillis-beginTimeMillis) );
	}
	
}
