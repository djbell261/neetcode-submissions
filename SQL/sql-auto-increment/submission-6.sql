
Create SEQUENCE gov_id START WITH 1000 Increment by 3;

create table gov_employee(
    id INTEGER GENERATED ALWAYS AS IDENTITY Primary key,
    gov_id Integer Default nextval('gov_id'),
    name TEXT


);








-- Do not modify below this line --
INSERT INTO gov_employee (name) 
  VALUES
      ('John Doe'),
      ('Jane Doe'),
      ('Jim Beam');

SELECT * FROM gov_employee;
