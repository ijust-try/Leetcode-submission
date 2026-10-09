# Write your MySQL query statement below
SELECT product_id, new_price AS price FROM Products p WHERE p.change_date = 
(SELECT MAX(x.change_date)
FROM Products x WHERE x.product_id =p.product_id AND x.change_date <='2019-08-16')
UNION 
SELECT product_id, 10 AS price
FROM Products
GROUP BY product_id
HAVING MIN(change_date)>'2019-08-16' ;