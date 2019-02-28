<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="com.pojo.Product"%>
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
<div class="panel-heading container text-center"><h2>Products of your cart</h2></div>
<% ArrayList<Product> cart=new ArrayList<>();
   cart=(ArrayList<Product>)request.getSession().getAttribute("cart");
   for(Product p:cart){
%>

<div class="container-fluid">
   <div class="col-sm-4 container-fluid">
      <div class="panel-heading"><%=p.getName() %>  <%=p.getModel() %></div>
        <div class="panel-body"><img src="images/<%=p.getProductId() %>.jpg?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
   </div>
   <div class="container-fluid">
   <br><br>
    <label>Mobile Brand</label>:<%=p.getName()%><br>
     
    <label>Model</label>:<%=p.getModel() %><br>
    <label>Price</label>:<%=p.getProductPrice()%><br>
  </div>

</div>

<%} %>

</body>
</html>