package com.mld.springboot.controller;

import com.mld.springboot.dao.DepartmentDao;
import com.mld.springboot.dao.EmployeeDao;
import com.mld.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.Map;

@Controller
public class EmpController {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String list(Map<String, Object> map) {
        Collection<Employee> all = employeeDao.getAll();
        map.put("emps", all);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model) {
        model.addAttribute("depts", departmentDao.getDepartments());
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }
}
