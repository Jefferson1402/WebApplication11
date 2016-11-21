package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>TRABAJO</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"solid.jpg\">\n");
      out.write("  \n");
      out.write("        <font color=\"Red\" face=\"Comic Sans MS,arial\">\n");
      out.write("        <h1><center>Inteligencia Artificial</center></h1>\n");
      out.write("        </font>\n");
      out.write("          <font color=\"Green\" face=\"Comic Sans MS,arial\">\n");
      out.write("        <h2>Sistema Experto en Web: Deteccion de Enfermedades</h2>\n");
      out.write("        </font>\n");
      out.write("          <font size = 5 color=\"Black\" face=\"Comic Sans MS,arial\">\n");
      out.write("        <p><center>¿Presenta malestar general?</center></p>\n");
      out.write("           <center> <select id=\"seleccion1\" name=\"aa\"></center>\n");
      out.write("                <option >Si</option>\n");
      out.write("                <option >No</option>  \n");
      out.write("            </select>\n");
      out.write("             <p>¿Presenta fiebre?</p>\n");
      out.write("              <select id=\"seleccion2\">\n");
      out.write("                <option >Si</option>\n");
      out.write("                <option >No</option>  \n");
      out.write("            </select>\n");
      out.write("          \n");
      out.write("              <p>¿Presenta dolor de cabeza?</p>\n");
      out.write("               <select id=\"seleccion3\">\n");
      out.write("                <option >Si</option>\n");
      out.write("                <option >No</option>  \n");
      out.write("            </select>\n");
      out.write("              <p>¿Presenta dolor de ojos?</p>\n");
      out.write("               <select id=\"seleccion4\">\n");
      out.write("                <option >Si</option>\n");
      out.write("                <option >No</option>  \n");
      out.write("            </select>\n");
      out.write("              <p>¿Se ejercita frecuentemente?</p>\n");
      out.write("               <select id=\"seleccion5\">\n");
      out.write("                <option >Si</option>\n");
      out.write("                <option >No</option>  \n");
      out.write("            </select>\n");
      out.write("              <p></p>\n");
      out.write("             \n");
      out.write("            <button  id=\"miBoton\" style='width:100px; height:40px'>Evaluar </button>\n");
      out.write("                <p id=\"espacio\"></p>\n");
      out.write("                 </font>\n");
      out.write("         <script type=\"text/javascript\">\n");
      out.write("           document.getElementById(\"miBoton\").onclick = function() {\n");
      out.write("               var a=\"Si\";\n");
      out.write("               var b=\"No\";\n");
      out.write("              var rpta1=document.getElementById(\"seleccion1\").value;\n");
      out.write("              var rpta2=document.getElementById(\"seleccion2\").value;\n");
      out.write("              var rpta3=document.getElementById(\"seleccion3\").value;\n");
      out.write("              var rpta4=document.getElementById(\"seleccion4\").value;\n");
      out.write("               var rpta5=document.getElementById(\"seleccion5\").value;\n");
      out.write("            if(rpta1==a && rpta2==a && rpta3==a && rpta4==a){\n");
      out.write("                \n");
      out.write("              //   alert(\"Debe ir al doctor urgentemente\");\n");
      out.write("                  document.getElementById(\"espacio\").innerHTML = \"Debe ir al doctor urgentemente\";\n");
      out.write("               //   document.getElementById(\"texto\").innerHTML = \"Hola Jose Luis!\";  \n");
      out.write("            }\n");
      out.write("            if(rpta1==a && rpta2==a && rpta3==a && rpta4==b){\n");
      out.write("                  document.getElementById(\"espacio\").innerHTML =\"Usted presenta un cuadro de diabetes\";   \n");
      out.write("            }\n");
      out.write("         if(rpta1==a && rpta2==a && rpta3==b && rpta4==a){\n");
      out.write("         document.getElementById(\"espacio\").innerHTML =\"Usted tiene gripe y puede afectar sus ojos\";   \n");
      out.write("            }\n");
      out.write("            if(rpta1==a && rpta2==a && rpta3==b && rpta4==b){\n");
      out.write("   document.getElementById(\"espacio\").innerHTML =\"Usted tiene gripe\";   \n");
      out.write("            }\n");
      out.write("          if(rpta1==a && rpta2==b && rpta3==a && rpta4==a){\n");
      out.write("      document.getElementById(\"espacio\").innerHTML =\"Usted tiene migraña y miopia\";   \n");
      out.write("            }\n");
      out.write("             if(rpta1==a && rpta2==b && rpta3==a && rpta4==b){\n");
      out.write("       document.getElementById(\"espacio\").innerHTML =\"Usted tiene migraña\";   \n");
      out.write("            }\n");
      out.write("             if(rpta1==a && rpta2==b && rpta3==b && rpta4==a){\n");
      out.write("      document.getElementById(\"espacio\").innerHTML =\"Usted tiene fatiga severa\";   \n");
      out.write("            }\n");
      out.write("               if(rpta1==a && rpta2==b && rpta3==b && rpta4==b){\n");
      out.write("      document.getElementById(\"espacio\").innerHTML =\"Usted tiene fatiga \";   \n");
      out.write("            }\n");
      out.write("            if(rpta1==b && rpta2==b && rpta3==b && rpta4==a){\n");
      out.write("      document.getElementById(\"espacio\").innerHTML =\"Usted tiene principios de miopia\";   \n");
      out.write("            } \n");
      out.write("             if(rpta1==b && rpta2==b && rpta3==b && rpta4==b){\n");
      out.write("       document.getElementById(\"espacio\").innerHTML =\"Usted esta sano\";   \n");
      out.write("            } \n");
      out.write("             if(rpta1==b && rpta2==b && rpta3==a && rpta4==a){\n");
      out.write("        document.getElementById(\"espacio\").innerHTML =\"Usted tiene estres y astigmatismo\";   \n");
      out.write("            } \n");
      out.write("             if(rpta1==b && rpta2==b && rpta3==a && rpta4==b){\n");
      out.write("      document.getElementById(\"espacio\").innerHTML =\"Usted tiene estres\";   \n");
      out.write("            } \n");
      out.write("           if(rpta1==b && rpta2==a && rpta3==a && rpta4==a){\n");
      out.write("       document.getElementById(\"espacio\").innerHTML =\"Usted tiene alergia severa que compromete sus ojos\";   \n");
      out.write("            } \n");
      out.write("            if(rpta1==b && rpta2==a && rpta3==a && rpta4==b){\n");
      out.write("    document.getElementById(\"espacio\").innerHTML =\"Usted tiene alergia\";   \n");
      out.write("            }\n");
      out.write("             if(rpta1==b && rpta2==a && rpta3==b && rpta4==a){\n");
      out.write("       document.getElementById(\"espacio\").innerHTML =\"Usted tiene una infeccion y catarata\";   \n");
      out.write("            } \n");
      out.write("               if(rpta1==b && rpta2==a && rpta3==b && rpta4==b){\n");
      out.write("         document.getElementById(\"espacio\").innerHTML =\"Usted tiene una infeccion\";   \n");
      out.write("            } \n");
      out.write("          } \n");
      out.write("          \n");
      out.write("         </script>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
