-- Database: thongkexoso

-- DROP DATABASE thongkexoso;

CREATE DATABASE thongkexoso
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'English_United States.1252'
       LC_CTYPE = 'English_United States.1252'
       CONNECTION LIMIT = -1;

-- Table: public.dai

-- DROP TABLE public.dai;

CREATE TABLE public.dai
(
ten character varying(75),
ngay timestamp without time zone,
giaidacbiet character varying(10),
giainhat character varying(10),
giainhi character varying(10),
giaiba1 character varying(10),
giaiba2 character varying(10),
giaitu1 character varying(10),
giaitu2 character varying(10),
giaitu3 character varying(10),
giaitu4 character varying(10),
giaitu5 character varying(10),
giaitu6 character varying(10),
giaitu7 character varying(10),
giainam character varying(10),
giaisau1 character varying(10),
giaisau2 character varying(10),
giaisau3 character varying(10),
giaibay character varying(10),
giaitam character varying(10)
)