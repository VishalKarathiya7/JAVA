import buttons.Button;
import dropdowns.Dropdown;
import menus.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();
        Button btn = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        Dropdown ddn = uiFactory.createDropdown();
    }
}
