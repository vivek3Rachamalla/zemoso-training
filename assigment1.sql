
use sakila;
/*1*/

select title from film f join film_category fc on f.film_id = fc.film_id 
				join category c on fc.category_id = c.category_id 
                where f.rating = 'PG-13' and c.name = 'Comedy'; 


/*2*/

select title  from film f join film_category fc on f.film_id = fc.film_id 
				join category c on fc.category_id = c.category_id 
                where f.rating = 'PG-13' and c.name = 'Horror' order by rental_rate desc limit 0,3; 



/*3*/

select first_name,last_name from customer c join rental r
		on c.customer_id = r.customer_id join address ad
        on c.address_id = ad.address_id join city ct
        on ad.city_id = ct.city_id join country cnt
        on ct.country_id = cnt.country_id join inventory i
        on r.inventory_id = i.inventory_id join film f 
        on f.film_id = i.film_id join film_category fc
        on fc.film_id = f.film_id join category cg 
        on fc.category_id = cg.category_id
        where cnt.country = 'India' and cg.name = 'Sports';
		



/*4*/

select first_name,last_name from customer c join rental r
		on c.customer_id = r.customer_id join address ad
        on c.address_id = ad.address_id join city ct
        on ad.city_id = ct.city_id join country cnt
        on ct.country_id = cnt.country_id join inventory i
        on r.inventory_id = i.inventory_id join film f 
        on f.film_id = i.film_id join film_actor fa
        on fa.film_id = f.film_id join actor a 
        on fa.actor_id = a.actor_id
        where cnt.country = 'Canada' and (a.first_name = 'NICK' and a.last_name = 'WAHLBERG');




/*5*/
select count(*) as Total from film where film_id in 
	(select film_id from film_actor where actor_id in (
		(select actor_id from actor where first_name = 'SEAN' and last_name= 'WILLIAMS')
    ));

