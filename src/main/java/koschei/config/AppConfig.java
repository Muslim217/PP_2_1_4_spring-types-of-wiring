package koschei.config;

import koschei.models.Island2;
import koschei.models.Wood3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    @Autowired
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
}
