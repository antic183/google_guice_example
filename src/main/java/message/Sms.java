package message;

import message.Message;

/**
 * Created by Antic on 27.06.2016.
 */
public class Sms implements Message
{
  public String getMessage() {
    return "SMS!";
  }
}
