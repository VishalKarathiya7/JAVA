import buttons.AndroidButton;
import buttons.Button;
import dropdowns.AndroidDropdown;
import dropdowns.Dropdown;
import menus.AndroidMenu;
import menus.Menu;

public class AndroidUiFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
