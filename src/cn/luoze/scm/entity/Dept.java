package cn.luoze.scm.entity;

import java.io.Serializable;

/**
 * Created by luo ze on 2016/12/3.
 */
public class Dept implements Serializable {

    private static final long serialVersionUID = -2997838048312155346L;
    private Integer deptId;
    private String deptName;
    private String deptAddress;
    public Integer getDeptId() {
        return deptId;
    }
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public String getDeptAddress() {
        return deptAddress;
    }
    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }
    @Override
    public String toString() {
        return "Dept [deptId=" + deptId + ", deptName=" + deptName
                + ", deptAddress=" + deptAddress + "]";
    }
}
