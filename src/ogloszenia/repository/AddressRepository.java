package ogloszenia.repository;

import ogloszenia.model.Address;
import ogloszeniar.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class AddressRepository {
    public AddressRepository() {
    }

    public static int save(Address address) {
        Session session = null;

        try {
            session = HibernateUtil.openSession();
            session.save(address);
            return address.getId();
        } catch (Exception var3) {
            var3.printStackTrace();
            return 0;
        }
    }
}
