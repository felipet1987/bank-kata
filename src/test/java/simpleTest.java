import cl.talavera.bank.app.HelloController;
import cl.talavera.bank.app.Sender;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.*;


public class simpleTest {
    @Test
    public void hello() {

        Sender sender = mock(Sender.class);
        HelloController controller = new HelloController(sender);

        when(sender.send()).thenReturn("Hello Dummy!");
        String response = controller.index();

        verify(sender,times(1)).send();
        assertThat(response, equalTo("Hello Dummy!"));
    }

}
