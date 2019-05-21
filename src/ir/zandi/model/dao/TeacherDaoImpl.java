package ir.zandi.model.dao;

import ir.zandi.core.dao.BaseDaoImpl;
import ir.zandi.model.Teacher;
import org.hibernate.SessionFactory;

public class TeacherDaoImpl extends BaseDaoImpl<Teacher> implements  TeacherDao{
    public TeacherDaoImpl(SessionFactory factory) {
        super(factory);
    }

    @Override
    protected String getEntityName() {
        return null;
    }
}
