
-- This SQL script using for Postgresql Database
 /*
 * If you want to use uuid in this project
 * CREATE EXTENSION pgcrypto;
 * SELECT gen_random_uuid();
 */
-- Database: thongkexoso
-- DROP DATABASE thongkexoso;
 CREATE DATABASE thongkexoso WITH OWNER = postgres ENCODING = 'UTF8' TABLESPACE = pg_default LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252' CONNECTION
LIMIT = -1;
-- Table: public.daimn
-- DROP TABLE public.daimn;
 -- public.daimn definition

-- Drop table

-- DROP TABLE public.daimn;

CREATE TABLE public.daimn (
    dai varchar(20) NOT NULL,
    ngay timestamp NOT NULL,
    giai_db varchar(6) NULL,
    giai_1 varchar(6) NULL,
    giai_2 varchar(6) NULL,
    giai_31 varchar(6) NULL,
    giai_32 varchar(6) NULL,
    giai_41 varchar(6) NULL,
    giai_42 varchar(6) NULL,
    giai_43 varchar(6) NULL,
    giai_44 varchar(6) NULL,
    giai_45 varchar(6) NULL,
    giai_46 varchar(6) NULL,
    giai_47 varchar(6) NULL,
    giai_5 varchar(6) NULL,
    giai_61 varchar(6) NULL,
    giai_62 varchar(6) NULL,
    giai_63 varchar(6) NULL,
    giai_7 varchar(6) NULL,
    giai_8 varchar(6) NULL,
    id varchar(36) NOT NULL DEFAULT gen_random_uuid(),
    CONSTRAINT id_pk PRIMARY KEY (id)
);

CREATE TABLE daimt(
    dai VARCHAR(20),
    ngay TIMESTAMP DEFAULT NOW(),
    giai_db VARCHAR(6),
    giai_1 VARCHAR(6),
    giai_2 VARCHAR(6),
    giai_31 VARCHAR(6),
    giai_32 VARCHAR(6),
    giai_41 VARCHAR(6),
    giai_42 VARCHAR(6),
    giai_43 VARCHAR(6),
    giai_44 VARCHAR(6),
    giai_45 VARCHAR(6),
    giai_46 VARCHAR(6),
    giai_47 VARCHAR(6),
    giai_5 VARCHAR(6),
    giai_61 VARCHAR(6),
    giai_62 VARCHAR(6),
    giai_63 VARCHAR(6),
    giai_7 VARCHAR(6),
    giai_8 VARCHAR(6)
);

CREATE TABLE daimb(
    dai VARCHAR(20),
    ngay TIMESTAMP ,
    giai_db VARCHAR(6),
    giai_1 VARCHAR(6),
    giai_21 VARCHAR(6),
    giai_22 VARCHAR(6),
    giai_31 VARCHAR(6),
    giai_32 VARCHAR(6),
    giai_33 VARCHAR(6),
    giai_34 VARCHAR(6),
    giai_35 VARCHAR(6),
    giai_36 VARCHAR(6),
    giai_41 VARCHAR(6),
    giai_42 VARCHAR(6),
    giai_43 VARCHAR(6),
    giai_44 VARCHAR(6),
    giai_51 VARCHAR(6),
    giai_52 VARCHAR(6),
    giai_53 VARCHAR(6),
    giai_54 VARCHAR(6),
    giai_55 VARCHAR(6),
    giai_56 VARCHAR(6),
    giai_61 VARCHAR(6),
    giai_62 VARCHAR(6),
    giai_63 VARCHAR(6),
    giai_71 VARCHAR(6),
    giai_72 VARCHAR(6),
    giai_73 VARCHAR(6),
    giai_74 VARCHAR(6)
);

SELECT DISTINCT d.dai 
FROM  public.daimn d

----------------------------------------------------------------------------------------------------------------------
18-07-2021
-- public.daimn definition

-- Drop table

-- DROP TABLE public.daimn;

CREATE TABLE public.daimn (
    id varchar(255) NOT NULL,
    name varchar(255) NULL,
    created_date timestamp NULL,
    updated_date timestamp NULL,
    giai_dac_biet varchar(255) NULL,
    giai_nhat varchar(255) NULL,
    giai_nhi varchar(255) NULL,
    giai_ba_1 varchar(255) NULL,
    giai_ba_2 varchar(255) NULL,
    giai_tu_1 varchar(255) NULL,
    giai_tu_2 varchar(255) NULL,
    giai_tu_3 varchar(255) NULL,
    giai_tu_4 varchar(255) NULL,
    giai_tu_5 varchar(255) NULL,
    giai_tu_6 varchar(255) NULL,
    giai_tu_7 varchar(255) NULL,
    giai_nam varchar(255) NULL,
    giai_sau_1 varchar(255) NULL,
    giai_sau_2 varchar(255) NULL,
    giai_sau_3 varchar(255) NULL,
    giai_bay varchar(255) NULL,
    giai_tam varchar(255) NULL,
    CONSTRAINT daimn_pkey PRIMARY KEY (id)
);

-- public.dai definition

-- Drop table

-- DROP TABLE public.dai;

CREATE TABLE public.dai (
    id varchar(255) NOT NULL,
    "name" varchar(255) NULL,
    created_date timestamp NULL,
    updated_date timestamp NULL,
    CONSTRAINT dai_pkey PRIMARY KEY (id)
);
