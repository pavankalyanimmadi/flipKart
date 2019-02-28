<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
      margin-bottom:0;
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
</head>
<body>
<div class="jumbotron">
  <div class="container text-center">
    <h1>Mobile phones</h1>      
  </div>
</div>


<div class="container ">    
  <div class="row">
    <div class="col-sm-4 container-fluid">
      <div class="panel panel-primary">
      <div class="panel-heading">Iphone X </div>
        <div class="panel-body"><a href="GetMobile?productId=mob101"><img src="images/mob101.jpg?text=IMAGE" class="img-responsive" style="width:300px; height:200px" alt="Image"></a></div>
        
        <div class="panel-footer">price:1000$</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
       <div class="panel-heading">Micromax </div>
        <div class="panel-body"><a href="GetMobile?productId=mob102"><img src="images/mob102.jpg?text=IMAGE" class="img-responsive" style="width:300px; height:200px" alt="Image"></a></div>
        <div class="panel-footer">price:50$</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
       <div class="panel-heading">samsung </div>
      <div class="panel-body"><a href="GetMobile?productId=mob103"><img src="images/mob103.jpg?text=IMAGE" class="img-responsive" style="width:300px; height:200px" alt="Image" ></a></div>
        <div class="panel-footer">price:100$</div>
      </div>
    </div>
  </div>
</div>

</body>
</html>