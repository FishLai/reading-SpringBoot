package life.fishlai.practicespringboot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix="life.fishlai")
public class GetPropertiesValues {
    private String name;
    private int age;
    private List<String> address;
}
