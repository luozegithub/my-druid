package cn.luoze.scm.dao;

import cn.luoze.scm.entity.Dept;

/**
 * Created by luo ze on 2016/12/3.
 */

public interface DeptDao {
    public Dept selectDept(Integer deptId);

    public int insertDept(Dept dept) throws Exception;
}
