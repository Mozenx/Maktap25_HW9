package ir.zandi.model.dao;

import ir.zandi.core.dao.BaseDaoImpl;
import ir.zandi.model.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao {
    private  final SessionFactory factory;

    public StudentDaoImpl(SessionFactory factory) {
        super(factory);
        this.factory = factory;
    }

    @Override
    protected String getEntityName() {
        return "Student";
    }

    @Override
    public List<Student> findByName(String name) {
        Session session = factory.openSession();

        List<Student> students;

        students = session.createQuery("select s from Student s where s.firstName like :i or" +
                " s.lastName like :i").setParameter("i","%"+name+"%").list();

        session.close();

        return students;
    }
}
