package com.cjc.spring.cloud.entity;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/10/23
 * Time: 20:57
 * To change this template use File | Settings | File Templates.
 **/
public class Employee {

   private Integer enpId;
   private String empName;
   private Double empSalary;


    public Employee() {
    }

    public Integer getEnpId() {
        return enpId;
    }

    public void setEnpId(Integer enpId) {
        this.enpId = enpId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "enpId=" + enpId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
