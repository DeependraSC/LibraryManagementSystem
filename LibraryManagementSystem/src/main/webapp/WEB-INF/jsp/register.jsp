<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
        </head>
        <body>
            <form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
                <table align="center">
                 <tr>
                        <td>
                            <form:label path="Name">Name</form:label>
                        </td>
                        <td>
                            <form:input path="Name" name="Name" id="Name" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="Username">Username</form:label>
                        </td>
                        <td>
                            <form:input path="Username" name="Username" id="Username" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="Password">Password</form:label>
                        </td>
                        <td>
                            <form:password path="Password" name="Password" id="Password" />
                        </td>
                    </tr>
                   
                    
                    <tr>
                        <td>
                            <form:label path="DOB">DOB</form:label>
                        </td>
                        <td>
                            <form:input path="DOB" type="date" name="DOB" id="DOB" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="Address">Address</form:label>
                        </td>
                        <td>
                            <form:input path="Address" name="Address" id="Address" />
                        </td>
                    </tr>
                    
                    
               
                    
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="Submit" /> 
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="index.jsp">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
        </body>
        </html>