package ogloszenia;

import ogloszenia.model.*;
import ogloszenia.repository.PlayerRepository;
import ogloszeniar.hibernate.util.HibernateUtil;

import java.awt.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) throws Exception {
        HibernateUtil.openSession();

        Address address = new Address("WLKP",
                "Poznań",
                "Palacza");

        Team firstTeam = new Team("Chicago Bulls",
                address,
                "Gilbert",
                new BigDecimal(50000000));

        Age age = new Age("1961-01-01",
                52);
        Contract contract = new Contract(new BigDecimal(5000000),
                LocalDate.of(2010,1,3),
                LocalDate.of(2012,10,25));
        Player player = new Player("MJ",
                23,
                age,
                77,
                185,
                firstTeam,
                Position.POINT_GUARD,
                Status.HEALTHY,  contract );

        PlayerRepository.save(player);

//        Path path = Paths.get("C://lalka.jpg");
//        byte[] image = Files.readAllBytes(path);
//
//        Cena cenaLalki = new Cena(new BigDecimal(10), "PLN");
//        Zabawka lalka = new Zabawka("Lalka",
//                cenaLalki,
//                Kolor.BIALY,
//                5,
//                false,
//                LocalDate.now(),
//                Material.DREWNO,
//                image
//                );
//        ZabawkaRepository.save(lalka);
//
//
//        List<Zabawka> zabawkiWitgPriceLessThan11 =
//        ZabawkaRepository.findAllWithPriceLessThanParameter(new BigDecimal(11));
//
//        zabawkiWitgPriceLessThan11.forEach( x -> System.out.println(x.getNazwa()));
//
//        List<Zabawka> zabawkiWithPriceLessThan5 =
//                ZabawkaRepository.findAllWithPriceLessThanParameter(new BigDecimal(5));
//
//        System.out.println("Zabawki za mniej niz 5 !");
//        zabawkiWithPriceLessThan5.forEach( x -> System.out.println(x.getNazwa()));
//
//
//        Long count = ZabawkaRepository.countAll();
//        System.out.println("Liczba zabawek: " +count);
//
//        HashMap<Zabawka, Integer> listaZakupow = new HashMap<>();
//        listaZakupow.put(zabawkiWitgPriceLessThan11.stream().findAny().orElse(lalka),
//                new Integer(5));
//
//        // TWORZENIE ZAMOWIENIA
//        ZamowienieRepository.createOrder(listaZakupow, "test@gmail.com");
//
//        Optional<Zabawka> zabawka = ZabawkaRepository.findZabawka(14);
//
//        if(  zabawka.isPresent()){
//          zabawka.get().getId();
//        }
//
//        zabawka.ifPresent( x-> System.out.print("z IfPresent "+ x.getId()));
//
//        //usuwanie zabawki
//        if(  zabawka.isPresent()) {
//
//            Zabawka z = zabawka.get();
//            z.setStanMagazynu(60);
//            z.setNazwa("Auto");
//            ZabawkaRepository.update(z);
//
//            System.out.println(ZamowienieRepository.findAllZamowieniaByZabawka(z).size());
//
//
//        }
//
//        System.out.println(ZabawkaRepository.findZabawkaWithStanAndName().get(0).toString());
//
//
//       ZabawkaRepository.updatePrice( new BigDecimal("55.50"));
//
//        System.out.println(ZabawkaRepository.findZabawkaByNameLike("UT").size());
//
    }
}
