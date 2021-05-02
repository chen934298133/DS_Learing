package LeetCode_2021.Coding_2021_05_01;

import java.util.*;

public class LeetCode_690 {
    Map<Integer, Employee> map = new HashMap<>();
    int sum;

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        l1.add(2);
        l1.add(3);
        l2.add(3);
        Employee employee1 = new Employee(1, 5, l1);
        Employee employee2 = new Employee(2, 3, l2);
        Employee employee3 = new Employee(3, 3, l3);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        LeetCode_690 l = new LeetCode_690();
//        System.out.println(l.getImportance(employees, 1));
//        System.out.println(l.getImportance2(employees,1));
        System.out.println(l.getImportance3(employees,1));
    }

    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            map.put(employee.getId(), employee);
        }
        Employee employee = map.get(id);

        return dfs(employee);
    }

    public int dfs(Employee employee) {
        sum += employee.getImportance();
        if (employee.getSubordinates() == null) {
            return sum;
        }
        for (Integer subordinate : employee.getSubordinates()) {
            dfs(map.get(subordinate));
        }
        return sum;
    }

    public int getImportance2(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return dfs2(id);
    }

    public int dfs2(int id) {
        Employee employee = map.get(id);
        int total = employee.importance;
        List<Integer> subordinates = employee.subordinates;
        if (employee.getSubordinates() == null) {
            return total;
        }
        for (int subId : subordinates) {
            total += dfs2(subId);
        }
        return total;
    }


    public int getImportance3(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        int total = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(id);
        while (!queue.isEmpty()) {
            int curId = queue.poll();
            Employee employee = map.get(curId);
            total += employee.importance;
            List<Integer> subordinates = employee.subordinates;
            for (int subId : subordinates) {
                queue.offer(subId);
            }
        }
        return total;
    }


}

// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance) {
        this.id = id;
        this.importance = importance;
    }

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public List<Integer> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Integer> subordinates) {
        this.subordinates = subordinates;
    }
}