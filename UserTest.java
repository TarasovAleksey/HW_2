package telran.user.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.user.model.User;

class UserTest {
	private static final Object Validpassword = null;
	private static final String ValidPassword = null;
	User user;
	String email = "peter@gmail.com";
	String password = "12345Ab!";

	@BeforeEach
	void setUp() throws Exception {
		user = new User(email, password);
	}

    @Test
    void  testPasswordLenght() {
        String validPassword = "239249209021!"; 
        user.setPassword(validPassword);
        assertEquals(validPassword, user.getPassword()); 
    }
	
	@Test
	void testPasswordUpperCase() {
		String ValidPassword = "Uqwerty1&2353";
		user.setPassword(ValidPassword);
		assertEquals(ValidPassword, user.getPassword());
	}
	
	@Test
	void testPasswordLowerCase() {
		String ValidPassword = "kdfrtth";
		user.setPassword(ValidPassword);
		assertEquals(ValidPassword, user.getPassword());
	}
	
	@Test
	void testPasswordDigit() {
		String ValidPassword = "98865!";
		user.setPassword(ValidPassword);
		assertEquals(ValidPassword, user.getPassword());
	}
	
	@Test
	void testPasswordSpecialSymbol() {
		String ValidPassword = "yggy%$@!";
		user.setPassword(ValidPassword);
		assertEquals(ValidPassword, user.getPassword());
	}
	
	@Test
	void testValidPassword() {
		String validPassword = "qwe982fsjncs";
		user.setPassword(validPassword);
		assertEquals(validPassword, user.getPassword());
	}
	
//	@Test
//	void testValidEmail() {
//		String validEmail = "peter@walla.co.il";
//		user.setEmail(validEmail);
//		assertEquals(validEmail, user.getEmail());
//	}

//	@Test
//	void testEmailWithoutAt() {
//		String inValidEmail = "peter.walla.co.il";
//		user.setEmail(inValidEmail);
//		assertEquals(email, user.getEmail());
//	}
//
//	@Test
//	void testEmailDoubleAt() {
//		String inValidEmail = "peter@walla@co.il";
//		user.setEmail(inValidEmail);
//		assertEquals(email, user.getEmail());
//	}
//
//	@Test
//	void testEmailDotAfterAt() {
//		String inValidEmail = "peter@wallacoil";
//		user.setEmail(inValidEmail);
//		assertEquals(email, user.getEmail());
//	}
//	
//	@Test
//	void testEmailLastDot() {
//		String inValidEmail = "peter@walla.co.il.";
//		user.setEmail(inValidEmail);
//		assertEquals(email, user.getEmail());
//		inValidEmail = "peter@walla.co.i.l";
//		user.setEmail(inValidEmail);
//		assertEquals(email, user.getEmail());
//	}
//	
//	@Test
//	void testIncorrectSymbols() {
//		String inValidEmail = "pet!r@wallacoil";
//		user.setEmail(inValidEmail);
//		assertEquals(email, user.getEmail());
//	}
}
