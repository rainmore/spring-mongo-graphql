package au.com.rainmore.centus.integration;

import au.com.rainmore.centus.BaseSpec;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
public interface BaseIntegrationSpec extends BaseSpec {

}
