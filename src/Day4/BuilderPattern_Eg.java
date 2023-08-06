package Day4;

class MenuBar{

}

class ToolBar{

}

class Window {
    MenuBar menuBar;
    ToolBar toolBar;

    public MenuBar getMenuBar() {
        return menuBar;
    }

    public void setMenuBar(MenuBar menuBar) {
        this.menuBar = menuBar;
    }

    public ToolBar getToolBar() {
        return toolBar;
    }

    public void setToolBar(ToolBar toolBar) {
        this.toolBar = toolBar;
    }

}

class windowBuilder{
    public static Window createWindow(){
        Window window = new Window();
        MenuBar menuBar = new MenuBar();
        ToolBar toolBar = new ToolBar();

        window.setMenuBar(menuBar);
        window.setToolBar(toolBar);
        return window;
    }
}

    public class BuilderPattern_Eg {
        public static void main(String[] args) {
              Window w = windowBuilder.createWindow();
        }

    
}
