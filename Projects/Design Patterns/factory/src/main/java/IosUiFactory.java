import buttons.Button;
import buttons.IosButton;
import dropdowns.Dropdown;
import dropdowns.IosDropdown;
import menus.IosMenu;
import menus.Menu;

public class IosUiFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
