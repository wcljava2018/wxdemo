/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-30 13:28:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.center;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("  \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("    <title>短视频后台管理系统</title>\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\" />\n");
      out.write("    <meta content=\"leechenxiang\" name=\"author\" />\n");
      out.write("    \n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/simple-line-icons/simple-line-icons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <!-- END GLOBAL MANDATORY STYLES -->\n");
      out.write("    <!-- BEGIN PAGE LEVEL PLUGINS -->\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/select2/css/select2.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/select2/css/select2-bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/bootstrap-sweetalert/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <!-- END PAGE LEVEL PLUGINS -->\n");
      out.write("    <!-- BEGIN THEME GLOBAL STYLES -->\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/css/components.min.css\" rel=\"stylesheet\" id=\"style_components\" type=\"text/css\" />\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/css/plugins.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <!-- END THEME GLOBAL STYLES -->\n");
      out.write("    <!-- BEGIN PAGE LEVEL STYLES -->\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/static/pages/css/login-2.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <!-- END PAGE LEVEL STYLES -->\n");
      out.write("\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath());
      out.write("/portal/image/itzixi_favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        \n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t.help-block {\n");
      out.write("\t\t\tdisplay: block;\n");
      out.write("\t\t  \tmargin-top: 5px;\n");
      out.write("\t\t  \tmargin-bottom: 10px;\n");
      out.write("\t\t  \tcolor: red; \n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body class=\"login\">\n");
      out.write("        <!-- BEGIN LOGO -->\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <a href=\"");
      out.print(request.getContextPath());
      out.write("/\">\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath());
      out.write("/static/pages/img/logos/logo.png\" /> \n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <!-- END LOGO -->\n");
      out.write("        <!-- BEGIN LOGIN -->\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <!-- BEGIN LOGIN FORM -->\n");
      out.write("            <form class=\"login-form\">\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->\n");
      out.write("                    <label class=\"control-label visible-ie8 visible-ie9\">用户名</label>\n");
      out.write("                    <div id=\"input-error\">\n");
      out.write("                    \t<input class=\"form-control form-control-solid placeholder-no-fix\" type=\"text\" autocomplete=\"off\" placeholder=\"用户名\" name=\"username\" /> </div>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label visible-ie8 visible-ie9\">密码</label>\n");
      out.write("                    <div id=\"input-error\">\n");
      out.write("                    \t<input class=\"form-control form-control-solid placeholder-no-fix\" type=\"password\" autocomplete=\"off\" placeholder=\"密码\" name=\"password\" /> </div>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"form-actions\" style=\"padding: 0 30px 15px;\">\n");
      out.write("                    <button type=\"submit\" class=\"btn red btn-block uppercase\">登 录</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"create-account\">\n");
      out.write("                    <p>\n");
      out.write("                        <a href=\"javascript:;\" class=\"btn-primary btn\" id=\"register-btn\">注 册 用 户</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <!-- END LOGIN FORM -->\n");
      out.write("\n");
      out.write("            <!-- BEGIN REGISTRATION FORM -->\n");
      out.write("            <form class=\"register-form\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label visible-ie8 visible-ie9\">用户名</label>\n");
      out.write("                    <div id=\"input-error\">\n");
      out.write("                    \t<input class=\"form-control placeholder-no-fix\" type=\"text\" placeholder=\"用户名\" name=\"username\" />\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label visible-ie8 visible-ie9\">密码</label>\n");
      out.write("                    <div id=\"input-error\">\n");
      out.write("                    \t<input class=\"form-control placeholder-no-fix\" type=\"text\" placeholder=\"密码\" name=\"password\" />\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-actions\">\n");
      out.write("                    <button type=\"button\" id=\"register-back-btn\" class=\"btn btn-default\">返 回</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <!-- END REGISTRATION FORM -->\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <input type=\"hidden\" id=\"hdnContextPath\" name=\"hdnContextPath\" value=\"");
      out.print(request.getContextPath() );
      out.write("\"/>\n");
      out.write("        \n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"../assets/global/plugins/respond.min.js?v=3.1415926\"></script>\n");
      out.write("<script src=\"../assets/global/plugins/excanvas.min.js?v=3.1415926\"></script> \n");
      out.write("<script src=\"../assets/global/plugins/ie8.fix.min.js?v=3.1415926\"></script> \n");
      out.write("<![endif]-->\n");
      out.write("        \n");
      out.write("        <!-- 公用尾部JS start -->\n");
      out.write("\t    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/commonFooterJS.jsp", out, false);
      out.write("\n");
      out.write("\t    <!-- 公用尾部JS end -->\n");
      out.write("    \n");
      out.write("        <script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/pages/js/login.js?v=1.1\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
