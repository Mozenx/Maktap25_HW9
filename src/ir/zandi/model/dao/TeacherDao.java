package ir.zandi.model.dao;

import ir.zandi.core.dao.BaseDao;
import ir.zandi.model.Teacher;

import java.util.List;

public interface TeacherDao extends BaseDao<Teacher> {

    void removeByTeacherCode(long teacherCode);

    List<Teacher> showYoungestAndOldest();

    List<Teacher> showMaxAndMinSalary();
}
