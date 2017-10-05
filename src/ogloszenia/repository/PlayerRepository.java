package ogloszenia.repository;


import ogloszenia.model.Player;
import ogloszeniar.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class PlayerRepository {
    public PlayerRepository() {
    }

    public static int save(Player player) {
        Session session = null;

        try {
            session = HibernateUtil.openSession();
            session.save(player);
            return player.getId();
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }
}