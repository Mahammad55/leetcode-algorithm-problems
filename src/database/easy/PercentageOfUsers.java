package database.easy;

// 1633
public class PercentageOfUsers {
    /*

SELECT contest_id,ROUND(((COUNT(user_id)/(SELECT COUNT(*) FROM users))*100),2) AS percentage
FROM register
GROUP BY contest_id
ORDER BY percentage DESC,contest_id;

     */
}
