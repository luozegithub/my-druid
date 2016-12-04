package cn.luoze.scm.service;

import cn.luoze.scm.entity.Dept;

/**
 * Created by luo ze on 2016/12/3.
 */
public interface DeptService {

    public Dept selectDept(Integer deptId);

    public int insertDept(Dept dept) throws Exception;
}
