<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Book</h1>  
       <form:form method="POST" action="/books/editsave" >    
        <table >    
        <tr>  
        <td>Book Code :</td>    
         <td><form:input  path="bookcode" readonly="true"/></td>  
         </tr>   
         <tr>    
          <td>Book Name : </td>   
          <td><form:input path="bookname"  /></td>  
         </tr>    
         <tr>    
          <td>Book Type</td>    
          <td><form:input path="booktype"  readonly="true"/></td>  
         </tr>   
         <tr>    
          <td>Price :</td>    
          <td><form:input path="Price" /></td>  
         </tr>   
           <tr>    
          <td>Description :</td>    
          <td><form:input path="Description" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Update" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
</html>
<%-- <form:hidden  path="bookcode" /></td> --%>