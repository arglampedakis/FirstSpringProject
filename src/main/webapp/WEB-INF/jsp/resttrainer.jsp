<%-- 
    Document   : resttrainer
    Created on : Jun 22, 2020, 8:51:30 PM
    Author     : glamb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            $(document).ready(function () {
                $('#trainername').on("keyup", callRest);

            });

            function callRest() {
                var userinput = $('#trainername').val();
                var url = "searchTrainerByName/" + userinput;

                $.ajax({
                    url: url
                }).then(function (data) {
//                    $('#results').html(data.e)
                });
            }

        </script>
    </head>
    <body>
        <input type="text" id="trainername" placeholder="Type here">

        <div id="results"></div>
    </body>
</html>
