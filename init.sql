CREATE TABLE derps
(
   id SERIAL PRIMARY KEY NOT NULL,
   name TEXT UNIQUE NOT NULL
);

INSERT INTO derps (id, name)
VALUES
  (1, 'derp-1'),
  (2, 'derp-2'),
  (3, 'derp-3')
;