use sakila;
/*1*/
select count(*) from film f join film_category fc
	on f.film_id = fc.film_id join category c 
    on c.category_id = fc.category_id
	where f.special_features like '%Deleted%' and c.name = 'Documentary';


/*2*/
select distinct count(*) AS TOTAL from staff s join  store str 
		on str.manager_staff_id = s.staff_id join rental r 
		on s.staff_id = r.staff_id join inventory i 
        on r.inventory_id = i.inventory_id join film f
		on f.film_id = i.film_id join film_category fc
        on fc.film_id = f.film_id join category cg 
        on fc.category_id = cg.category_id
        where (s.first_name = 'Jon' and last_name = 'Stephens') and
        cg.name = 'Sci-fi';


/*3*/
	select distinct sum(amount) from payment p join rental r
		on p.rental_id = r.rental_id join inventory i 
        on r.inventory_id = i.inventory_id join film f
		on f.film_id = i.film_id join film_category fc
        on fc.film_id = f.film_id join category cg 
        on fc.category_id = cg.category_id
        where cg.name = "Animation";


/*4*/
select distinct cg.name from customer c join rental r 
		on c.customer_id = r.customer_id join inventory i 
        on i.inventory_id = r.inventory_id join film f
		on f.film_id = i.film_id join film_category fc
        on fc.film_id = f.film_id join category cg 
        on fc.category_id = cg.category_id
		where c.first_name = 'PATRICIA' and c.last_name='JOHNSON' 
        group by cg.name order by count(c.customer_id) desc limit 0,3;
    
/*5*/
	
    select distinct count(*) As Total from customer c join rental r 
		on c.customer_id = r.customer_id join inventory i 
        on i.inventory_id = r.inventory_id join film f
		on f.film_id = i.film_id 
		where (c.first_name = 'SUSAN' and c.last_name='WILSON') and f.rating = 'R';
