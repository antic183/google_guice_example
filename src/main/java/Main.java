import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import message.Message;

/**
 * Created by Antic on 27.06.2016.
 */
public class Main
{
  @Inject
  Message msg;

  public static void main(String[] args) {
    Main main = new Main();

    Module module = new MessageGuiceModule();
    Injector Injector = Guice.createInjector(module);
    Injector.injectMembers(main);

    main.createMessage();
  }

  private void createMessage(){
    String message = msg.getMessage();
    System.out.println(message);
  }
}
