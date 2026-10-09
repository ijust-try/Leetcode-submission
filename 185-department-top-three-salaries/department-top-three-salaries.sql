SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
FROM Employee e
JOIN Department d ON e.departmentId = d.id
WHERE (SELECT COUNT(DISTINCT x.salary)
       FROM Employee x
       WHERE x.departmentId = e.departmentId
         AND x.salary > e.salary) < 3;