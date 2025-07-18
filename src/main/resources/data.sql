CREATE TABLE employee(
    id         INT PRIMARY KEY,
    name       VARCHAR(100) NOT NULL,
    department VARCHAR(100) NOT NULL
);

INSERT INTO employee (id, name, department) VALUES (1, 'Sahil', 'JVM');
INSERT INTO employee (id, name, department) VALUES (2, 'Rahul', 'JVM');
