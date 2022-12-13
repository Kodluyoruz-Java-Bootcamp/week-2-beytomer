package emlakcepte.service;

import java.util.ArrayList;
import java.util.List;

import emlakcepte.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emlakcepte.dao.RealtyDao;

@Service
public class RealtyService {
	
	private RealtyDao realtyDao = new RealtyDao();
	
	@Autowired //injection
	private UserService userService;
	
	public void createRealty(Realty realty) {	
		
		//userService.printAllUser();
		
		if (UserType.INDIVIDUAL.equals(realty.getUser().getType())&& NoticeType.HOUSING.equals(realty.getNoticeType()) && getAllByUserName(realty.getUser()).size()<3) {
			realtyDao.saveRealty(realty);

		} else if (UserType.CORPARETE.equals(realty.getUser().getType())) {
			realtyDao.saveRealty(realty);
		}else{
			System.out.println(realty.getUser().getName()+" bireysel kullanıcılar Konut tipinde en fazla 3 ilan yayınlayabilir. Son ilan yayınlanamamıştır !!");
		}


		//--System.out.println("createRealty :: " + realty.getTitle());
	}
	
	public List<Realty> getAll(){
		return realtyDao.findAll();
	}
	
	public void printAll(List<Realty> realtList) {
		realtList.forEach(realty -> System.out.println(realty));
	}

	public void getAllByProvince(String province) {
		
		getAll().stream()
		.filter(realty -> realty.getProvince().equals(province))
		//.count();
		.forEach(realty -> System.out.println(realty));
		
	}
	public void getAllByCounty(String county) {

		getAll().stream()
				.filter(realty -> realty.getCounty().equals(county))
				//.count();
				.forEach(System.out::println);

	}
	public void getAllByProvinceAndCounty(String province, String county) {

		getAll().stream()  // stream ler ile koşul kontrolü yapıp istenilen il ve ilçeyi sağlayan ilanları bulduk.
				.filter(realty -> realty.getCounty().equals(county) && realty.getProvince().equals(province))
				.forEach(System.out::println);

	}
	public List<Realty> getAllByProvinceAndCountyList(String province, String county) {

			List<Realty>realties =new ArrayList<>();
			/*
		 realtyList.add(getAll().stream()  // stream ler ile koşul kontrolü yapıp istenilen il ve ilçeyi sağlayan ilanları bulduk.
				 .filter(realty -> realty.getCounty().equals(county) && realty.getProvince().equals(province)).toList());

			 */
		for (int i = 0; i < getAll().size(); i++) {
			if (getAll().get(i).getProvince()=="İstanbul" && getAll().get(i).getCounty()=="Pendik"){
				realties.add(getAll().get(i));
			}
		}
			return realties;

	}

	
	public List<Realty> getAllByUserName(User user){	
		return getAll().stream()
		.filter(realty -> realty.getUser().getMail().equals(user.getMail()))
		.toList();		
	}

	public List<Realty> getActiveRealtyByUserName(User user) {
		
		return getAll().stream()
		.filter(realty -> realty.getUser().getName().equals(user.getName()))
		.filter(realty -> RealtyType.ACTIVE.equals(realty.getStatus()))
		.toList();

	}
	public List<Realty> getProvinceWindow(String province){
		return getAll().stream().filter(it ->it.getProvince().equals(province)).limit(10L).toList();
	}

	public long getnumberOfAdvertisments(String province){
		long count = getAll().stream().filter(it -> it.getProvince().equals(province)).count();
		return count;
	}

	public long getHouseForSale(String province){
		 return getAll().stream()
				.filter(it ->it.getProvince().equals(province) && it.getStatus().equals(RealtyType.SALE))
				.count();
	}

}
