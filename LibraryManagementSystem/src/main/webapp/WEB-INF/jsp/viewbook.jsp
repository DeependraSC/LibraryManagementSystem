<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   <%@taglib uri="http://www.springframework.org/tags" prefix="springcore" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>  
   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<h1>Search Book By Types</h1>  
   <%-- <form:form method = "POST" modelAttribute="book" action = "viewselectedbook">
  
   
 
    <select path="booktype" name="booktype "  id = "booktype" required>
        <c:forEach var="book" items="${list}"> 
            <option value="${book.booktype}">${book.booktype}</option>
       </c:forEach>  
    </select>  
   
  <input type="submit" value="submit">
   </form:form> --%>
   
  
  
	
	
	 <form:form method="POST" modelAttribute="book" action = "viewselectedbook">
		
		<table>

			<tr>
				<td>Book :</td>
				<td><form:select path="booktype">
				<form:option value="NONE" label="Select" />
				<c:forEach var="book" items="${list}"> 
					  <form:option value="${book.booktype}"  >${book.booktype}</form:option>
					   </c:forEach>  
					 
				       </form:select>
                                </td>
				
			</tr>
			

			<tr>
				<td colspan="3"><input type="submit" value="Submit"/></td>
			</tr>
		</table>
	</form:form> 
	<%--  <form:form method="POST"  modelAttribute="book" action = "viewselectedbook">
		
		<table>

			<tr>
				<td>Search Book :</td>
				<td><form:select path="booktype">
				<c:forEach var="book" items="${list}"> 
					  <form:option value="${book.booktype}"  >${book.booktype}</form:option>
					  <form:options items="${list}" />
					   </c:forEach>
				       </form:select>
                                </td>
				
			</tr>
			
			<tr>
				<td colspan="3"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form> --%>