package by.htp.sporteq.command;
import static by.htp.sporteq.util.ConstantValue.*;

public class CommandChooser {
	public static CommandAction chooseAction(String action){
		switch (action) {
		case ACTION_AUTHORIZE:
			System.out.println("Login action" + action);
			return new LoginCommandAction();
		case ACTION_MAKE_ORDER:
			System.out.println("Create order action");
			return new OrderCreateAction();
		case ACTION_ORDER:
			System.out.println("makeOrder action" + action);
			return new MakeOrderAction();
		}
		//STUB !!!
		return null;
	}
}
