# Write your MySQL query statement below
select Signups.user_id,
coalesce(round(
    count(
    case 
    when Confirmations.action="confirmed" then 1
    end 
)/count(Confirmations.action),2),0) as confirmation_rate
from Signups
left join Confirmations 
on Signups.user_id = Confirmations.user_id
group by Signups.user_id