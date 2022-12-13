package emlakcepte;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import emlakcepte.model.*;
import emlakcepte.service.WindowService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import emlakcepte.service.RealtyService;
import emlakcepte.service.UserService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		

		User userSami = new User("Sami", "sami@gmail.com", "123", UserType.INDIVIDUAL, Collections.emptyList());
		User userPelin = new User("Pelin", "mimar.pelin@gmail.com", "Pelin123", UserType.INDIVIDUAL, Collections.emptyList());
		User userBeytullah = new User("Beytullah", "beyto@gmail.com", "123", UserType.INDIVIDUAL, Collections.emptyList());
		User userMerve = new User("Merve", "merve@gmail.com", "123", UserType.INDIVIDUAL, Collections.emptyList());
		User userNuh = new User("Nuh", "nuh@gmail.com", "123", UserType.INDIVIDUAL, Collections.emptyList());
		User userAli = new User("Ali", "ali@gmail.com", "123", UserType.INDIVIDUAL, Collections.emptyList());

		/*
		 * UserService userService = UserService.getSameInstance();
		 * 
		 * UserService userService1 = UserService.getSameInstance();
		 * 
		 * UserService userService2 = UserService.getDifferentInstance();
		 * 
		 * System.out.println(userService); System.out.println(userService1);
		 * System.out.println(userService2);
		 */

		// eski yöntem
		//UserService userService = new UserService();

		//Spring bizim yerime create ediyor
		UserService userService = applicationContext.getBean(UserService.class);

		userService.createUser(userPelin);
		userService.createUser(userSami);

		//--userService.printAllUser();

		//--System.out.println("-----");

		// userList.add(user);
		// userList.add(userPelin);

		// userList.forEach(usr -> System.out.println(usr.getName()));

		RealtyService realtyService = new RealtyService();

		Realty realty = new Realty(123L, "Pendik ' de 1200 M2 Satılık VİLLA", LocalDateTime.now(), userPelin,
				RealtyType.ACTIVE, NoticeType.HOUSING);
		realty.setProvince("İstanbul");
		realty.setCounty("Pendik");
		realty.setUser(userSami);
		realtyService.createRealty(realty);

		Realty realty1 = new Realty();
		realty1.setNo(124L);
		realty1.setTitle("Büyükdere Ana Cadde üstünde 16.060 m2 kapalı alanlı PLAZA");
		realty1.setStatus(RealtyType.ACTIVE);
		realty1.setNoticeType(NoticeType.HOUSING);
		realty1.setUser(userSami);
		realty1.setProvince("İstanbul");
		realty1.setCounty("Pendik");
		realtyService.createRealty(realty1);

		Realty realty2 = new Realty();
		realty2.setNo(125L);
		realty2.setTitle("KAVAKPINAR MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
		realty2.setStatus(RealtyType.ACTIVE);
		realty2.setNoticeType(NoticeType.HOUSING);
		realty2.setUser(userSami);
		realty2.setProvince("İstanbul");
		realty2.setCounty("Şişli");
		realtyService.createRealty(realty2);

		Realty realty3 = new Realty();
		realty3.setNo(126L);
		realty3.setTitle("Sahil MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
		realty3.setStatus(RealtyType.ACTIVE);
		realty3.setNoticeType(NoticeType.HOUSING);
		realty3.setUser(userPelin);
		realty3.setProvince("İstanbul");
		realty3.setCounty("Levent");
		realtyService.createRealty(realty3);

		Realty realty4 = new Realty();
		realty4.setNo(127L);
		realty4.setTitle("Sahil MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
		realty4.setStatus(RealtyType.ACTIVE);
		realty4.setNoticeType(NoticeType.HOUSING);
		realty4.setUser(userPelin);
		realty4.setProvince("İstanbul");
		realty4.setCounty("Beşiktaş");
		realtyService.createRealty(realty4);

		Realty realty5 = new Realty();
		realty5.setNo(127L);
		realty5.setTitle("Sahil MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
		realty5.setStatus(RealtyType.ACTIVE);
		realty5.setNoticeType(NoticeType.HOUSING);
		realty5.setUser(userPelin);
		realty5.setProvince("İstanbul");
		realty5.setCounty("Üsküdar");
		realtyService.createRealty(realty5);

		Realty realty6 = new Realty();
		realty6.setNo(127L);
		realty6.setTitle("Sahil MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
		realty6.setStatus(RealtyType.ACTIVE);
		realty6.setNoticeType(NoticeType.HOUSING);
		realty6.setUser(userBeytullah);
		realty6.setProvince("İstanbul");
		realty6.setCounty("Taksim");
		realtyService.createRealty(realty6);

		Realty realty7 = new Realty();
		realty7.setNo(127L);
		realty7.setTitle("Sahil MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
		realty7.setStatus(RealtyType.ACTIVE);
		realty7.setNoticeType(NoticeType.HOUSING);
		realty7.setUser(userBeytullah);
		realty7.setProvince("İstanbul");
		realty7.setCounty("Etiler");
		realtyService.createRealty(realty7);

		Realty realty8 = new Realty();
		realty8.setNo(127L);
		realty8.setTitle("Sahil MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
		realty8.setStatus(RealtyType.ACTIVE);
		realty8.setNoticeType(NoticeType.HOUSING);
		realty8.setUser(userBeytullah);
		realty8.setProvince("İstanbul");
		realty8.setCounty("Bakırköy");
		realtyService.createRealty(realty8);

		Realty realty9 = new Realty();
		realty9.setNo(127L);
		realty9.setTitle("Sahil MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
		realty9.setStatus(RealtyType.ACTIVE);
		realty9.setNoticeType(NoticeType.HOUSING);
		realty9.setUser(userMerve);
		realty9.setProvince("İstanbul");
		realty9.setCounty("Yenikapı");
		realtyService.createRealty(realty9);

		Realty realty10 = new Realty();
		realty10.setNo(127L);
		realty10.setTitle("Sahil MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
		realty10.setStatus(RealtyType.SALE);
		realty10.setNoticeType(NoticeType.HOUSING);
		realty10.setUser(userMerve);
		realty10.setProvince("İstanbul");
		realty10.setCounty("Başakşehir");
		realtyService.createRealty(realty10);

		Realty realty11 = new Realty();
		realty11.setNo(127L);
		realty11.setTitle("Sahil MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
		realty11.setStatus(RealtyType.SALE);
		realty11.setNoticeType(NoticeType.HOUSING);
		realty11.setUser(userMerve);
		realty11.setProvince("İstanbul");
		realty11.setCounty("Bebek");
		realtyService.createRealty(realty11);

		Realty realty12 = new Realty();
		realty12.setNo(127L);
		realty12.setTitle("Sahil MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
		realty12.setStatus(RealtyType.ACTIVE);
		realty12.setNoticeType(NoticeType.HOUSING);
		realty12.setUser(userNuh);
		realty12.setProvince("İzmir");
		realty12.setCounty("Göztepe");
		realtyService.createRealty(realty12);

		Realty realty13= new Realty();
		realty13.setNo(127L);
		realty13.setTitle("Sahil MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
		realty13.setStatus(RealtyType.SALE);
		realty13.setNoticeType(NoticeType.HOUSING);
		realty13.setUser(userNuh);
		realty13.setProvince("İzmir");
		realty13.setCounty("Altay");
		realtyService.createRealty(realty13);

		Realty realty14 = new Realty();
		realty14.setNo(127L);
		realty14.setTitle("Sahil MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
		realty14.setStatus(RealtyType.SALE);
		realty14.setNoticeType(NoticeType.HOUSING);
		realty14.setUser(userAli);
		realty14.setProvince("Ankara");
		realty14.setCounty("Kızılay");
		realtyService.createRealty(realty14);

		WindowService windowService=new WindowService();
		Window window=new Window(realtyService.getProvinceWindow("İstanbul"),"İstanbul");
		windowService.createWindow(window);

		System.out.println("userPelinin ilanları ");
		 realtyService.getAllByUserName(userPelin).forEach(System.out::println);
		System.out.println();

		List<Realty> fovarilerim = new ArrayList<>();
		userSami.setFavoriteRealtyList(fovarilerim);

		// sistemdeki bütün ilanlar

		System.out.println("Bütün ilanlar");

		realtyService.printAll(realtyService.getAll());

		// İstanbuldaki Pendik ilanların bulunması
		System.out.println();
		System.out.println("İstanbul Pendik ilçesindeki ilanlar ");
		realtyService.getAllByProvinceAndCounty("İstanbul","Pendik"); // il ilçe ilan araması
		System.out.println();

		// istenilen kullanıcının kaydedilmiş aramaların listesi
		List<Realty>searchList=new ArrayList<>();
		searchList=realtyService.getAllByProvinceAndCountyList("İstanbul","Pendik");
		userPelin.setSaveSearchList(searchList);
		userService.getUserSearchList(userPelin);

		//Vitrinler
		System.out.println();
		System.out.println("İstanbul Vitrini");
		window.getWindowRealtyList().forEach(System.out::println);

		//İstanbul, Ankara, İzmir şehrindeki ilanların sayısı(istenilen şehire göre sayıları çıktı veriyoruz)
		System.out.println();
		System.out.println("İstanbul daki ilan sayısı " +realtyService.getnumberOfAdvertisments("İstanbul") );
		System.out.println("Ankara daki ilan sayısı " + realtyService.getnumberOfAdvertisments("Ankara"));
		System.out.println("İzmir daki ilan sayısı " + realtyService.getnumberOfAdvertisments("İzmir"));

		//  istanbul, Ankara, İzmir şehirlerindeki satılık konut ilanlarının sayısı
		System.out.println();
		System.out.println("İstanbul daki satılık konut sayısı " +realtyService.getHouseForSale("İstanbul") );
		System.out.println("Ankara daki satılık konut sayısı " + realtyService.getHouseForSale("Ankara"));
		System.out.println("İzmir daki satılık konut sayısı " + realtyService.getHouseForSale("İzmir"));


		// Bir kullanıcının bütün ilanlarını listele
		//--realtyService.printAll(realtyService.getAllByUserName(userPelin));

		//--realtyService.printAll(realtyService.getActiveRealtyByUserName(userSami));

		/*
		 * userList.forEach(usr -> {
		 * 
		 * usr.getFavoriteRealtyList().forEach(favoriRealty ->
		 * System.out.println(favoriRealty.getTitle()) );
		 * 
		 * });
		 */

		Message message = new Message("acil dönüş", "ilan ile ilgili bilgilendirme verebilir misiniz?", userPelin,
				userSami);

		userSami.setMessages(List.of(message));
		userPelin.setMessages(List.of(message));

		userSami.getMessages();


	}

	private static User prepareUser(String name, String email, String password) {
		User user = new User();
		user.setName(name);
		user.setMail(email);
		user.setPassword(password);
		user.setType(UserType.INDIVIDUAL);
		user.setCreateDate(LocalDateTime.now());
		return user;
	}

}
