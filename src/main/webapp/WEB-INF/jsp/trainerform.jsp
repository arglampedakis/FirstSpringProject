<%-- 
    Document   : trainerform
    Created on : Jun 15, 2020, 8:32:04 PM
    Author     : glamb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="springform" uri="http://www.springframework.org/tags/form"%>
<!--mia library apo tags t spring-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trainer Form</title>
    </head>

    <h1>Enter the Trainer fields</h1>
    <springform:form action="doinserttrainer" method="post" modelAttribute="newtrainer"> 
        <!-- newtrainer < me ti onoma evala t attribute tn adeio trainer-->

        <springform:input path="trName"/>
        <springform:input path="surname"/>
        <!-- type="text" einai to default t spring-->
        <springform:input type="number" path="age"/>

        <input type="submit" value="submit"/>

    </springform:form>

</html>
