### Springboot REST API Assignment (MCDA - 5550)

This is MyHotel - A spring Boot Web Application, Developed as a part of MCDA-5550 course.

API endpoints:

#### POST: /add - Should include 'name' and 'address' in the request parameter
Where,

'name' (String) is name of the Hotel and should be a series of characters or a string

'address' (String) describes address of the Hotel and should be a series of characters or a string

This adds a new Hotel to the hotel table in connected database.

----

#### GET: /all - This returns the list of all Hotels present in the table - hotel from the connected database.

The returned array of hotels contain the following fields:

'id' is the unique identifier for the hotel (auto incremented)

'name' is name of the Hotel and is a string

'address' describes address of the Hotel and is a string
