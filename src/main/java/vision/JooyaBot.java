package vision;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
public class JooyaBot extends TelegramLongPollingBot
{

	public String getBotUsername()
	{
		return "JooyaBot";
	}

	public void onUpdateReceived(Update update)
	{
		if (update.hasMessage() && update.getMessage().hasText())
		{
			SendMessage msg = new SendMessage().setChatId(update.getMessage().getChatId()).setText(update.getMessage().getText());
			try
			{
				sendMessage(msg);
			}
			catch (TelegramApiException e)
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getBotToken()
	{
		return "";
	}

}
