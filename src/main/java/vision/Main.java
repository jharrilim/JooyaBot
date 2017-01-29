package vision;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
public class Main
{

	public static void main(String[] args)
	{
		System.out.println("JooyaBot Started!\n");
		ApiContextInitializer.init();
		TelegramBotsApi botsApi = new TelegramBotsApi();
		try
		{
			botsApi.registerBot(new JooyaBot());
			
		}
		catch (TelegramApiException e)
		{
			e.printStackTrace();
		}
	}

}
