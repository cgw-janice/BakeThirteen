package ca.bakeThirteen;

import org.primefaces.model.menu.*;

public class MenuBean {
    
private MenuModel model;
 
public MenuBean() {
model = new DefaultMenuModel();
 
DefaultSubMenu subMenu = new DefaultSubMenu("some submenu");
DefaultMenuItem menuItem = new DefaultMenuItem("some item");
subMenu.addElement(menuItem);

model.addElement(subMenu);

model.generateUniqueIds();
}
 
public MenuModel getModel() {
return model;
}
}