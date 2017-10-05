package ogloszenia.repository;

import ogloszenia.model.Team;
import ogloszeniar.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class TeamRepository {
    public TeamRepository() {
    }

    public static int save(Team team) {
        Session session = null;

        try {
            session = HibernateUtil.openSession();
            session.save(team);
            return team.getId();
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }
}