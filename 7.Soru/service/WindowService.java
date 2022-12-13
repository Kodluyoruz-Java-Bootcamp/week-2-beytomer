package emlakcepte.service;

import emlakcepte.dao.WindowDao;
import emlakcepte.model.Window;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WindowService {

        WindowDao windowDao=new WindowDao();

        private RealtyService realtyService;

        public void createWindow(Window window){
                windowDao.saveWindow(window);
        }

        public List<Window> getAllWindow(){
                return windowDao.getAllWindows();
        }

}
