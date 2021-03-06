<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.pojo.Mobile"%>
<!DOCTYPE html>
<html>
<head>

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
<% Mobile mobile=(Mobile)request.getAttribute("mobile"); %>
 <div class="container-fluid">
   <div class="col-sm-4 container-fluid">
      <div class="panel-heading"><%=mobile.getName() %>  <%=mobile.getModel() %></div>
        <div class="panel-body"><img src="images/<%=mobile.getProductId() %>.jpg?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
   </div>
   <div class="container-fluid">
    <div class="panel-heading"><h2>Product Details</h2></div>
    <label>Mobile Brand</label>:<%=mobile.getName()%><br>
     
    <label>Model</label>:<%=mobile.getModel() %><br>
    
    <label>Ram</label>:<%=mobile.getRam() %>gb<br>
    
  
    <label>Internal Storage</label>:<%=mobile.getInternalStorage() %>gb<br>
  
    
  
    <label>Size</label>:<%=mobile.getSize() %><br>
 
    
 
    <label>Price</label>:<%=mobile.getProductPrice()%><br>
   
    
    <a href="addItemToCart?productId=<%=mobile.getProductId() %>">Add to cart</a>
    
    
   </div>

</div>

</body>
</html>