import com.xiaoran.springs.Application;
import com.xiaoran.springs.profiles.SpeakProfileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("dev")
@ContextConfiguration(classes = Application.class)
@SpringBootTest
public class SpeakProfileServiceTest {

    @Autowired
    private SpeakProfileService speakProfileService;

    @Test
    public void speak() {
        speakProfileService.speak();
    }
}
