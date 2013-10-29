package epsi.talkative.webservice.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import epsi.talkative.webservice.beans.Commentator;
import epsi.talkative.webservice.beans.User;

public class UserTest {
	@Test
	public void testCommentator() {
		// Arrange
		User user = new Commentator();
		user.setName("Raphaël");
		user.setSurname("MARQUES");
		user.setPseudo("Adrael");
		user.setId(0);
		user.setMail("noreply@talkative.com");
		
		// Act
		// Some code here if needed...
		
		// Assert
		assertEquals(0, user.getId());
		assertEquals("Raphaël", user.getName());
		assertEquals("Adrael", user.getPseudo());
		assertEquals("MARQUES", user.getSurname());
		assertEquals("Raphaël MARQUES", user.getFullName());
		assertEquals("noreply@talkative.com", user.getMail());
	}
}
