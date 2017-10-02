# Question: https://leetcode.com/problems/combine-two-tables/

# Write your MySQL query statement below
select FirstName, LastName, City, State from Person left join Address on Person.personId = Address.personId;
