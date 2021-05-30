<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voting Poll</title>
<style>
.fa-imgcontainer {
      text-align: center;
      }
.fa-right {
      position: absolute;
      right: 200px;
      }
.fa-rightbttn {
      position: absolute;
      right: 500px;
      }
.fa-buttonlayout {
      background: #B9DFFF;
      text-align: center;
      color: #fff;
      border: 1px solid #eee;
      border-radius: 20px;
      box-shadow: 5px 5px 5px #eee;
      text-shadow:none;
      }
.fa-buttonlayout:hover {
      background: #016ABC;
      text-align: center;
      color: #fff;
      border: 1px solid #eee;
      border-radius: 20px;
      box-shadow: 5px 5px 5px #eee;
      text-shadow:none;
      }
.fa-imga {
      position: absolute;
      left: 50px;
      bottom: 20px;
      }
</style>
</head>
<body bgcolor="#F2DAFF">
<div class="fa-imgcontainer">
<img src="uploads/vote.jpg"  class="fa-imgcontainer" width="1300" height="300"/> 
</div>
</br>
<h1 class="fa-imgcontainer" style="font-size:40px;"><i>Vote Your Favorite Author For THE AUTHOR OF AUTHORS!!!</i></h1>
</br>
<div id="scroll-image" >
<img  src="uploads/2.jpg" style="float: left;" 
class="test fa-imga" width="550" height="220"/>
<img  src="uploads/3.jpg" style="float: left;" 
class="test fa-imga" width="550" height="220"/>
<img  src="uploads/4.jpg" style="float: left;" 
class="test fa-imga" width="550" height="220"/>
<img  src="uploads/5.jpg" style="float: left;" 
class="test fa-imga" width="550" height="220"/>
</div>
              
  <script>
        
 startImageTransition();
  
 function startImageTransition() {
   var images = document.getElementsByClassName("test");
   for (var i = 0; i < images.length; ++i) {
   images[i].style.opacity = 1;
       }
  var top = 1;
  var cur = images.length - 1;
  setInterval(changeImage, 4000);
  
   async function changeImage() {
      var nextImage = (1 + cur) % images.length;
      images[cur].style.zIndex = top + 1;
      images[nextImage].style.zIndex = top;
      await transition();
      images[cur].style.zIndex = top;
      images[nextImage].style.zIndex = top + 1;
      top = top + 1;
      images[cur].style.opacity = 1;
       cur = nextImage;
          }
  
    function transition() {
       return new Promise(function(resolve, reject) {
       var del = 0.01;
       var id = setInterval(changeOpacity, 10);
  
       function changeOpacity() {
            images[cur].style.opacity -= del;
             if (images[cur].style.opacity <= 0) {
               clearInterval(id);
                resolve();
                       }
              }
  
         })
            }
        }
    </script>
              
          
 <form action="voting.hr" method="post">
<div class="fa-right">
<font size="4"><b><i>
  <input type="radio" name="radio" value="migeul" required>Migeul de Cervantes
  
  <input type="radio" name="radio" value="charles">Charles Dickens

  <input type="radio" name="radio" value="tolkien">J.R.R. Tolkien

  <input type="radio" name="radio" value="antoine">Antoine de Saint-Exuper
 </i></b> </font>
   </div>
 </br> </br></br>
<div class="fa-rightbttn" >
<button class="fa-buttonlayout" type="submit" value="submit" alighn="center" style="height:50px;width:150px">Submit</button>
</div>
</form> </br></br></br></br></br>
<form action="seevotes.hr" method="get">
<div class="fa-rightbttn" >
<button class="fa-buttonlayout" type="submit" value="submit" alighn="center" style="height:50px;width:150px">Check Votings</button>
</div>
</form>
</body>
</html>