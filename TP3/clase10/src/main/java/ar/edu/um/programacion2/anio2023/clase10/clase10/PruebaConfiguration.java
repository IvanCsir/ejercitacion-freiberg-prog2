package ar.edu.um.programacion2.anio2023.clase10.clase10;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "fernando", ignoreUnknownFields = true)
public class PruebaConfiguration {
    protected String url;
    protected String puerto;
    protected Persona pers;
}

