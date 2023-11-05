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


CREATE TABLE public.products
(
    id integer NOT NULL,
    name varchar(120) NOT NULL,
	value decimal(10, 2) not null,
	restaurant_id integer,
	FOREIGN KEY (restaurant_id) REFERENCES public.restaurants(id),
    PRIMARY KEY (id)
);

CREATE SEQUENCE id_products
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;
ALTER TABLE public.products ALTER COLUMN id SET DEFAULT NEXTVAL('id_products');

INSERT INTO public.products (name, value, restaurant_id) VALUES
	('Macarrão a bolonhesa', '10.25', 1),
	('Macarrão molho branco', '11.25', 1),
	('Coca Cola 2 litros', '15.50', 1),
	('Coca Lata', '5.00', 1),
	('Pizza de calabresa', '40.25', 2),
	('Pizza de frango com catupiry', '50.25', 2),
	('Pizza de mussarela', '35.00', 2),
	('Coca Cola 2 litros', '15.50', 1),
	('Coca Lata', '5.00', 1);