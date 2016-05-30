import Model.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class MessageTest {

	@Test
	public void itShouldReturnTheMessage() {
		Message message = new Message("Hola mundo");
		assertEquals("Hola mundo", message.getText());
	}

}
