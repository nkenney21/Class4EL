<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <head>
        <title>Area Calculator</title>
        <link href="newcss.css" rel="stylesheet" type="text/css"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
        <body>
                
            
    
            <p>
        
            <div class="container">
            <center><h1>Area of Shapes</h1></center>
                <br>
                <h2>Area of a Rectangle</h2>
                <img src="images/rectangleAreaPic.jpg" alt=""/>
            <form id="rectangleCalc" name="rectangleCalc" method="POST" action="CalculatorController?area=rectangle"/>
                <input id="length" name="length" type="number" value=""/>Length
                <input id="width" name="width" type="number" value=""/>Width
                <input type="submit" name="submit" value="Calculate"/>Rectangle area is: <fmt:formatNumber type = "number" maxFractionDigits = "5" value = "${rectangleArea}" />
            </form>
            <br>
                <h2>Area of a Circle</h2>
                <img src="images/circleAreaPic.jpg" alt=""/>
            <form id="circleArea" name="circleArea" method="POST" action="CalculatorController?area=circle"/>
                <input id="radius" name="radius" type="number" value=""/>Radius
               
                <input type="submit" name="submit" value="Calculate"/>Circle area is: <fmt:formatNumber type = "number" maxFractionDigits = "5" value = "${circleArea}" />
            </form>
            <br>
            <h2>Area of a Triangle</h2>
            <img src="images/triangleAreaPic.jpg" alt=""/>
            <form id="triangleArea" name="triangleArea" method="POST" action="CalculatorController?area=triangle"/>
                <input id="base" name="base" type="number" value=""/>Base
                <input id="height" name="height" type="number" value=""/>Height
                <input type="submit" name="submit" value="Calculate"/>Triangle area is: <fmt:formatNumber type = "number" maxFractionDigits = "5" value = "${triangleArea}" />
            </form>
            <br>
                </div>
           
        </body>
</html>