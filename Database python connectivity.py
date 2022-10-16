import mysql.connector

  db_connection = mysql.connector.connect(

  host="localhost",

  user="root",

  passwd="root",

  database="my_first_db"

  )

db_cursor = db_connection.cursor()

student_sql_query = "INSERT INTO student(id,name) VALUES(01, 'John')"

employee_sql_query = " INSERT INTO employee (id, name, salary) VALUES (01, 'John', 10000)"

#Execute cursor and pass query as well as student data

db_cursor.execute(student_sql_query)

#Execute cursor and pass query of employee and data of employee

	db_cursor.execute(employee_sql_query)db_connection.commit()

print(db_cursor.rowcount, "Record Inserted")
