-- Database: thongkexoso
-- DROP DATABASE thongkexoso;
CREATE DATABASE thongkexoso WITH OWNER = postgres ENCODING = 'UTF8' TABLESPACE = pg_default LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252' CONNECTION
LIMIT
  = -1;

-- Table: public.daimn
-- DROP TABLE public.daimn;
CREATE TABLE daimn(
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