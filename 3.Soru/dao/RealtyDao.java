package emlakcepte.dao;

import java.util.ArrayList;
import java.util.List;

import emlakcepte.model.Realty;

public class RealtyDao {
	
	private static List<Realty> realtyList = new ArrayList<>();
	private static RealtyDao realtyDao;
	private RealtyDao() {
	}
	public static RealtyDao getInstance(){
		if (realtyDao==null){
			realtyDao=new RealtyDao();
		}
		return realtyDao;
	}
	public void saveRealty(Realty realty) {
		realtyList.add(realty);
	}
	
	public List<Realty> findAll(){
		return realtyList;
	}

}
