import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"at.graz.mug.saat.*"})
@EntityScan(basePackages = {"at.graz.mug.saat.*"})
@EnableJpaRepositories(basePackages = {"at.graz.mug.saat.*"})
public class SAATApplication {
    public static void main(String[] args) {
        SpringApplication.run(SAATApplication.class);
    }
}
