package Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;

public class JUnit<Vehicle> {
	
	@Test
	public void test_hash_map(){
		HashMap<UUID, Vehicle> key = new HashMap<UUID, Vehicle>();
		HashMap<UUID, Vehicle> value = new HashMap<UUID, Vehicle>();
		assertEquals(key,value);
		
 	}

}