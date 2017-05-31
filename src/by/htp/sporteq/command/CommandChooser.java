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
		case ACTION_EXACT_ORDER:
			System.out.println("Exact order action" + action);
			return new MakeOrderAction();
		case ACTION_ADD_ITEMS:
			System.out.println("Add items to a cart action" + action);
			return new AddItemsAction();
		case ACTION_OPEN_USER_ACCOUNT:
			System.out.println("Open user account" + action);
			return new UserAccountAction();
		}
		
		//STUB !!!
		return null;
	}
}
