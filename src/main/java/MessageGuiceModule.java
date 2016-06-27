import com.google.inject.AbstractModule;
import message.Email;
import message.Message;
import message.Sms;

/**
 * Created by Antic on 27.06.2016.
 */
public class MessageGuiceModule extends AbstractModule
{
  protected void configure() {
    //bind(Message.class).to(Email.class);
    bind(Message.class).to(Sms.class);
  }
}
