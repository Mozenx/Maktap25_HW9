package ir.zandi.model.dao;

import ir.zandi.core.dao.BaseDao;
import ir.zandi.core.dao.BaseDaoImpl;
import ir.zandi.model.Student;

import java.util.List;

public interface StudentDao extends BaseDao<Student> {

    List<Student> findByName(String name);

}
