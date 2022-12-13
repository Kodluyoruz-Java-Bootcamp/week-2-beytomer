package emlakcepte.dao;

import emlakcepte.model.Window;

import java.util.ArrayList;
import java.util.List;

public class WindowDao {
    private static List<Window> windows =new ArrayList<>();

    public void saveWindow(Window window){
        windows.add(window);
    }

    public List<Window>getAllWindows(){
        return windows;
    }
}
