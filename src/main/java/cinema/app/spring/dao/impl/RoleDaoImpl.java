package cinema.app.spring.dao.impl;

import cinema.app.spring.dao.AbstractDao;
import cinema.app.spring.dao.RoleDao;
import cinema.app.spring.exception.DataProcessingException;
import cinema.app.spring.model.Role;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getByName(String roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> getByName = session.createQuery(
                    "FROM Role WHERE roleName = :role", Role.class);
            getByName.setParameter("role", Role.RoleName.valueOf(roleName));
            return getByName.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Role with role name " + roleName + " not found", e);
        }
    }
}
