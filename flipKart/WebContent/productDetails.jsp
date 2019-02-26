<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.pojo.Mobile"%>
<!DOCTYPE html>
<html>
<head>
 <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */ 
     .jumbotron {
      margin-bottom: 0;
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
</head>
<body>
<% Mobile mobile=(Mobile)request.getAttribute("mobile"); %>>
 <div class="container-fluid">
   <div class="col-sm-4 container-fluid">
      <div class="panel-heading">Iphone X </div>
        <div class="panel-body"><img src="images/iphoneX.jpg?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
   </div>
   <div>
     mobile name:<%=mobile.getName() %><br>
     mobile Model:<%=mobile.getModel()%>
          
   </div>

</div>

</body>
</html>