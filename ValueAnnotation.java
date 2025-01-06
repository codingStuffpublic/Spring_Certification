import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ValueAnnotation {

	//application.property: app.file.property=appFileProperty
    @Value("${app.file.property}")
    private String appFileProperty;
    
    //environmental variables
    @Value("${JAVA_HOME}")
    private String javaHome;
    @Value("${OS}")
    private String osName;

    //SPEL
    @Value("#{2 + 2}")
    private int additionResult;
    @Value("#{'New York'.toUpperCase()}")
    private String cityName;
    //class.static method
    @Value("#{T(java.time.LocalDateTime).now()}")
    private LocalDateTime currentDate;
    @Value("#{systemEnvironment['JAVA_HOME']}")
    private String javaHomeSpel;

}
