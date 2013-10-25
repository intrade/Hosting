package lv.intrade.cp.init;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 13.24.10
 * Time: 23:40
 * To change this template use File | Settings | File Templates.
 */
@Order(2)
public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer{
}
