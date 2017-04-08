package io.epopeia;

/**
 * Package unit has tests without spring container (using new operator), but
 * uses some support mock and utilities classes from spring-test module such as
 * MockEnvironment, MockPropertySource, mocks for web (servlet, session etc),
 * AOP utilities, JDBC utilities etc. The idea here is use some test framework
 * like jUnit with these support classes.
 */
public class DemoApplicationTest {

}
