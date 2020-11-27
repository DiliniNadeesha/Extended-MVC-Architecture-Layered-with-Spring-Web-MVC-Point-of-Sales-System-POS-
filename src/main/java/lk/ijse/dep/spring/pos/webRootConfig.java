package lk.ijse.dep.spring.pos;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(HibernateConfig.class)
public class webRootConfig {
}
