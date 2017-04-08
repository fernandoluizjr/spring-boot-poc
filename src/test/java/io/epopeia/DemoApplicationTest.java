package io.epopeia;

/**
 * Package unit has tests without spring container (using new operator), but
 * uses some support mock and utilities classes from spring-test module such as
 * MockEnvironment, MockPropertySource, mocks for web (servlet, session etc),
 * Reflection utilities (Ex: set a value for an attribute value), AOP utilities
 * (Ex: extract target object from its proxy), MVC utilities etc. The idea here
 * is to use some test framework like jUnit with these support classes.
 * 
 * Beyond mocks and util classes for unit testing (also they can be used for
 * integration testing), the idea here is load the spring context container.
 * This loaded container is cached (may be restarted) for all tests, resolve
 * dependency injections, provides transaction management and additional class
 * support such as JdbcTemplate, JdbcTestUtils etc.
 */
public class DemoApplicationTest {

}
