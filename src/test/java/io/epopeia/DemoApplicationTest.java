package io.epopeia;

/**
 * Package unit has tests without spring container (using new operator), but
 * uses some support mock and utilities classes from spring-test module such as
 * MockEnvironment, MockPropertySource, mocks for web (servlet, session etc),
 * Reflection utilities (Ex: set a value for an attribute value), AOP utilities
 * (Ex: extract target object from its proxy), MVC utilities etc. The idea here
 * is to use some test framework like jUnit with these support classes.
 */
public class DemoApplicationTest {

}
