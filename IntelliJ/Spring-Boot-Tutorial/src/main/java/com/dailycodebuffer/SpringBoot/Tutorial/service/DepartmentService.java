package com.dailycodebuffer.SpringBoot.Tutorial.service;

import com.dailycodebuffer.SpringBoot.Tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId);
}
