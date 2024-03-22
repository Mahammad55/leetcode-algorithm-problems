package database.easy;

// 1890
public class TheLatestLogin {
    /*

SELECT user_id,MAX(time_stamp) AS last_stamp
FROM logins
WHERE EXTRACT(YEAR FROM time_stamp)=2020
GROUP BY user_id;

     */
}
