package database.easy;

// 1378
public class ReplaceEmployeeId {
    /*

SELECT en.unique_id,e.name
FROM employeeUni en
RIGHT JOIN employees e USING(id);

SELECT en.unique_id,e.name
FROM employeeUni en
RIGHT JOIN employees e ON en.id=e.id;

     */
}
