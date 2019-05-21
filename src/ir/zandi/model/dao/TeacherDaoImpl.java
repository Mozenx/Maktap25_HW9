package ir.zandi.model.dao;

import ir.zandi.core.dao.BaseDaoImpl;
import ir.zandi.model.Teacher;

public class TeacherDaoImpl extends BaseDaoImpl<Teacher> implements  TeacherDao{
    @Override
    protected String getEntityName() {
        return null;
    }
}
