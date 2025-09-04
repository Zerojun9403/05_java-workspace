package edu.practice.day9;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {

    // 내부 직원 클래스
    static class Employee {
        String id;
        String name;
        String department;
        int salary; // 단위: 만원

        Employee(String id, String name, String department, int salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    // 직원 데이터 저장
    private Map<String, Employee> employees = new HashMap<>();

    // 초기 데이터
    public EmployeeManager() {
        employees.put("E001", new Employee("E001", "김개발", "IT", 4500));
        employees.put("E002", new Employee("E002", "박영업", "Sales", 3800));
        employees.put("E003", new Employee("E003", "이기획", "Planning", 4200));
    }

    // 직원 검색
    public void searchEmployee(String empId) {
        Employee e = employees.get(empId);
        if (e == null) {
            System.out.println("존재하지 않는 직원입니다.");
        } else {
            System.out.println("직원ID: " + e.id + ", 이름: " + e.name +
                    ", 부서: " + e.department + ", 급여: " + e.salary + "만원");
        }
    }

    // 부서별 직원 조회
    public void displayByDepartment(String dept) {
        System.out.println("[부서별 조회] " + dept);
        boolean found = false;
        for (Employee e : employees.values()) {
            if (e.department.equals(dept)) {
                System.out.println("직원ID: " + e.id + ", 이름: " + e.name +
                        ", 급여: " + e.salary + "만원");
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 부서 직원이 없습니다.");
        }
    }

    // 급여 수정
    public void updateSalary(String empId, int newSalary) {
        Employee e = employees.get(empId);
        if (e == null) {
            System.out.println("존재하지 않는 직원입니다.");
        } else {
            int old = e.salary;
            e.salary = newSalary;
            System.out.println(e.name + " 급여가 " + old + "만원 → " + newSalary + "만원으로 변경되었습니다.");
        }
    }
}
