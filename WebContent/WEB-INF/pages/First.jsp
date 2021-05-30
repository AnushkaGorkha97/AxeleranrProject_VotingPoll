<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<style>
 .fa-imgcontainer {
        text-align: center;
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
</style>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript">

    // Load the Visualization API and the piechart package.
    google.load('visualization', '1.0', {
        'packages' : [ 'corechart' ]
    });
    // Set a callback to run when the Google Visualization API is loaded.
    google.setOnLoadCallback(drawChart);
    // Callback that creates and populates a data table,
    // instantiates the pie chart, passes in the data and
    // draws it.
    function drawChart() {
        // Create the data table.
        var data = google.visualization.arrayToDataTable([
                                                              ['Author', 'Votes'],
                                                              <c:forEach items="${pieDataList}" var="entry">
                                                                  [ '${entry.key}', ${entry.value} ],
                                                              </c:forEach>
                                                        ]);
        // Set chart options
        var options = {
            'title' : 'Authors Vote Poll:',
            is3D : true,
            pieSliceText: 'label',
            tooltip :  {showColorCode: true},
            'width' : 1400,
            'height' : 600,
            backgroundColor:'#F2DAFF'
        };
        // Instantiate and draw our chart, passing in some options.
        var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
        chart.draw(data, options);
    }
</script>
</head> 
<body bgcolor="#F2DAFF">
<h1 class="fa-imgcontainer" style="font-size:40px;"><i>Results Of All Your Votes!!</i></h1> </br>
<div bgcolor="#F2DAFF" class="fa-imgcontainer" style="width: 2000px;">
<div id="chart_div" bgcolor="#F2DAFF"></div>
</div>
<form action="home.hr">
<div class="fa-imgcontainer" >
<button class="fa-buttonlayout" type="submit" value="submit" alighn="center" style="height:50px;width:150px">Go Back To Votes</button>
</div>
</form>
</body>
</html>