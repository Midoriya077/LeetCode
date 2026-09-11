# Write your MySQL query statement below
select
CASE 
WHEN id%2=1 AND id=(select MAX(id) from seat)
then id
when id%2=1
then id+1
else id-1
end as id,student
from Seat
order by id
