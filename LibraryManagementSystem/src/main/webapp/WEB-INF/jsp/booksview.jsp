<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
  
<h1>Book List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Book Code</th><th>Book Name</th><th>Book Type</th><th>Price</th><th>Description</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="book" items="${list}"> 
   <%--  <select name="category">
      
            <option value="${book.bookcode}">${book.bookname}</option>
      
    </select>   --%>
     
   <tr>  
   <td>${book.bookcode}</td>  
   <td>${book.bookname}</td>  
   <td>${book.booktype}</td>  
   <td>${book.price}</td>  
    <td>${book.description}</td> 
   <td><a href="editbook/${book.bookcode}">Edit</a></td>  
   <td><a href="deletebook/${book.bookcode}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="bookreg">Add New Book</a>  