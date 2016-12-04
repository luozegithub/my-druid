package cn.luoze.scm.action;
import cn.luoze.scm.entity.Dept;
import cn.luoze.scm.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by luo ze on 2016/12/3.
 */
@Controller
@RequestMapping(value="/dept")
public class DeptAction {
    @Resource
    private DeptService deptService;

    @RequestMapping(value="/insert")
    public String insert(Dept dept)  {
        System.out.println("---action.dept:"+dept);
        try {
            deptService.insertDept(dept);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "forward:/jsp/main.jsp";
    }

}
