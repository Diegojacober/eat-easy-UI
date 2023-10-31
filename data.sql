CREATE TABLE public.restaurants
(
    id integer NOT NULL,
    name varchar(120) NOT NULL,
    location_x varchar(120) NOT NULL,
    location_y varchar(120) NOT NULL,
	created_at timestamp not null default CURRENT_TIMESTAMP, 
    PRIMARY KEY (id)
);


CREATE SEQUENCE id_restaurant
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;
ALTER TABLE public.restaurants ALTER COLUMN id SET DEFAULT NEXTVAL('id_restaurant');

INSERT INTO public.restaurants (name,created_at, location_x, location_y) VALUES
	('Restaurante de teste', '2023-10-21 22:08:51', '123', '123'),
	('Restaurante do joao', '2023-10-22 10:32:42', '123', '123')
