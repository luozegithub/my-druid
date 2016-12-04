package cn.luoze.scm.service.impl;

import cn.luoze.scm.dao.DeptDao;
import cn.luoze.scm.entity.Dept;
import cn.luoze.scm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luo ze on 2016/12/3.
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept selectDept(Integer deptId) {
        // TODO Auto-generated method stub

        return deptDao.selectDept(deptId);
    }

    @Override
    public int insertDept(Dept dept) throws Exception {
        int i =0 ;
        i = deptDao.insertDept(dept);
        //Integer.parseInt("aa");
        //Class.forName("adb.Dee");
        return i;
    }
}
