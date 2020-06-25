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
        <script src="https://code.jquery.com/jquery-3.5.1.js"
                integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
        crossorigin="anonymous"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trainer Form</title>
        <script>
            $(document).ready(function () {
                $('#testh1').on("mouseout", callRest);

            });

            function callRest() {
                $.ajax({
                    url: "restendpoint"
                }).then(function (data) { //st then  shmainei oti exei erthei h apanthsh. k einai mesa stn parametro data
                    $('#answer').html(data.surname);
                });
            }

        </script>
    </head>
    <body>
        <h1>Enter the Trainer fields</h1>
        <springform:form action="doinserttrainer" method="post" modelAttribute="newtrainer"> 
            <!-- newtrainer < me ti onoma evala t attribute tn adeio trainer-->

            <springform:input path="trName"/>
            <springform:input path="surname"/>
            <!-- type="text" einai to default t spring-->
            <springform:input type="number" path="age"/>

            <input type="submit" value="submit"/>

        </springform:form>
        <h1 id="testh1">Mouse out me</h1>
        <div id="answer"></div>
    </body>
</html>
