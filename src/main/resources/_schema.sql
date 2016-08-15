--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.4
-- Dumped by pg_dump version 9.5.4

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner:
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner:
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: customer; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE customer (
    id integer NOT NULL,
    first_name text,
    last_name text
);


ALTER TABLE customer OWNER TO root;

--
-- Name: Customer_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE "Customer_id_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE "Customer_id_seq" OWNER TO root;

--
-- Name: Customer_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE "Customer_id_seq" OWNED BY customer.id;


--
-- Name: id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY customer ALTER COLUMN id SET DEFAULT nextval('"Customer_id_seq"'::regclass);


--
-- Name: Customer_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('"Customer_id_seq"', 1, false);


--
-- Data for Name: customer; Type: TABLE DATA; Schema: public; Owner: root
--

COPY customer (id, first_name, last_name) FROM stdin;
\.


--
-- Name: Customer_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY customer
    ADD CONSTRAINT "Customer_pkey" PRIMARY KEY (id);


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--