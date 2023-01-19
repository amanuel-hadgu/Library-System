## Library-System
1. Customers service: you can get, add, update and delete customers. Customers have a customernumber, name, phone, email, street, city, zip.
2. BooksQuery service: you can get books. The book(s) that is/are returned by this service has an isbn, title, description, author name and all reviews of this book. Because this service is used a lot, make sure you run 2 instances of this booksQuery service. The API gateway should load balance between these instances.
3. BooksCommand service: you can add, update and delete books. Books have an isbn, title, description and author name.
4. Review service: you can add reviews for a certain book. Reviews have an isbn, review rating (number between 0 and 5), customer name and a description.
5. Borrowings service: you can get, add, update and delete a borrowing. This borrowing contains all the details of the borrowing including borrowingNumber, date, customernumber, customerName, isbn and book title

##Implement the following events:
 When we change customer data, the corresponding borrowing(s) should also change
 When we change book data, the corresponding borrowing(s) should also change
 When we add, update or delete book data, the corresponding bookquery service should
update its data
 When you add a review for a book, the bookquery service should update its data
