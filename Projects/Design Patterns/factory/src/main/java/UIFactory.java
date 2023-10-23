import buttons.Button;
import dropdowns.Dropdown;
import menus.Menu;

public interface UIFactory {
    public Button createButton();
    public Dropdown createDropdown();
    public Menu createMenu();

}
