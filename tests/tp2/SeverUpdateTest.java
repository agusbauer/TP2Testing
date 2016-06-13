package tp2;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.junit.Assume.*;

@RunWith(Theories.class)
public class SeverUpdateTest {
	
	@Theory
	public void updateTheory(@ServerGeneratorInterface() Server server){
		assumeThat(server,CoreMatchers.not(CoreMatchers.equalTo(null)));
		server.update();
		assertTrue(server.repOK());
	}
}
