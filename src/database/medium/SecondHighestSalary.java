package database.medium;

// 176
public class SecondHighestSalary {
    /*

 SELECT MAX(salary) AS SecondHighestSalary
 FROM employee
 WHERE salary <> (SELECT MAX(salary) FROM employee);


 SELECT MAX(salary) AS SecondHighestSalary
 FROM employee
 WHERE salary != (SELECT MAX(salary) FROM employee);


 SELECT MAX(salary) AS SecondHighestSalary
 FROM employee
 WHERE salary NOT IN (SELECT MAX(salary) FROM employee);


 SELECT salary AS SecondHighestSalary
 FROM employee
 ORDER BY salary DESC
 LIMIT 1
 OFFSET 1;

     */
}
