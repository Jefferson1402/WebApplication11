<%-- 
    Document   : index
    Created on : 21/11/2016, 12:42:34 PM
    Author     : jeffe_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TRABAJO</title>
    </head>
    <body background="solid.jpg">
  
        <font color="Red" face="Comic Sans MS,arial">
        <h1><center>Inteligencia Artificial</center></h1>
        </font>
          <font color="Green" face="Comic Sans MS,arial">
        <h2>Sistema Experto en Web: Deteccion de Enfermedades</h2>
        </font>
          <font size = 5 color="Black" face="Comic Sans MS,arial">
        <p><center>¿Presenta malestar general?</center></p>
           <center> <select id="seleccion1" name="aa"></center>
                <option >Si</option>
                <option >No</option>  
            </select>
             <p>¿Presenta fiebre?</p>
              <select id="seleccion2">
                <option >Si</option>
                <option >No</option>  
            </select>
          
              <p>¿Presenta dolor de cabeza?</p>
               <select id="seleccion3">
                <option >Si</option>
                <option >No</option>  
            </select>
              <p>¿Presenta dolor de ojos?</p>
               <select id="seleccion4">
                <option >Si</option>
                <option >No</option>  
            </select>
              <p>¿Se ejercita frecuentemente?</p>
               <select id="seleccion5">
                <option >Si</option>
                <option >No</option>  
            </select>
              <p></p>
             
            <button  id="miBoton" style='width:100px; height:40px'>Evaluar </button>
                <p id="espacio"></p>
                 </font>
         <script type="text/javascript">
           document.getElementById("miBoton").onclick = function() {
               var a="Si";
               var b="No";
              var rpta1=document.getElementById("seleccion1").value;
              var rpta2=document.getElementById("seleccion2").value;
              var rpta3=document.getElementById("seleccion3").value;
              var rpta4=document.getElementById("seleccion4").value;
               var rpta5=document.getElementById("seleccion5").value;
            if(rpta1==a && rpta2==a && rpta3==a && rpta4==a){
                
              //   alert("Debe ir al doctor urgentemente");
                  document.getElementById("espacio").innerHTML = "Debe ir al doctor urgentemente";
               //   document.getElementById("texto").innerHTML = "Hola Jose Luis!";  
            }
            if(rpta1==a && rpta2==a && rpta3==a && rpta4==b){
                  document.getElementById("espacio").innerHTML ="Usted presenta un cuadro de diabetes";   
            }
         if(rpta1==a && rpta2==a && rpta3==b && rpta4==a){
         document.getElementById("espacio").innerHTML ="Usted tiene gripe y puede afectar sus ojos";   
            }
            if(rpta1==a && rpta2==a && rpta3==b && rpta4==b){
   document.getElementById("espacio").innerHTML ="Usted tiene gripe";   
            }
          if(rpta1==a && rpta2==b && rpta3==a && rpta4==a){
      document.getElementById("espacio").innerHTML ="Usted tiene migraña y miopia";   
            }
             if(rpta1==a && rpta2==b && rpta3==a && rpta4==b){
       document.getElementById("espacio").innerHTML ="Usted tiene migraña";   
            }
             if(rpta1==a && rpta2==b && rpta3==b && rpta4==a){
      document.getElementById("espacio").innerHTML ="Usted tiene fatiga severa";   
            }
               if(rpta1==a && rpta2==b && rpta3==b && rpta4==b){
      document.getElementById("espacio").innerHTML ="Usted tiene fatiga ";   
            }
            if(rpta1==b && rpta2==b && rpta3==b && rpta4==a){
      document.getElementById("espacio").innerHTML ="Usted tiene principios de miopia";   
            } 
             if(rpta1==b && rpta2==b && rpta3==b && rpta4==b){
       document.getElementById("espacio").innerHTML ="Usted esta sano";   
            } 
             if(rpta1==b && rpta2==b && rpta3==a && rpta4==a){
        document.getElementById("espacio").innerHTML ="Usted tiene estres y astigmatismo";   
            } 
             if(rpta1==b && rpta2==b && rpta3==a && rpta4==b){
      document.getElementById("espacio").innerHTML ="Usted tiene estres";   
            } 
           if(rpta1==b && rpta2==a && rpta3==a && rpta4==a){
       document.getElementById("espacio").innerHTML ="Usted tiene alergia severa que compromete sus ojos";   
            } 
            if(rpta1==b && rpta2==a && rpta3==a && rpta4==b){
    document.getElementById("espacio").innerHTML ="Usted tiene alergia";   
            }
             if(rpta1==b && rpta2==a && rpta3==b && rpta4==a){
       document.getElementById("espacio").innerHTML ="Usted tiene una infeccion y catarata";   
            } 
               if(rpta1==b && rpta2==a && rpta3==b && rpta4==b){
         document.getElementById("espacio").innerHTML ="Usted tiene una infeccion";   
            } 
          } 
          
         </script>
        
    </body>
</html>
