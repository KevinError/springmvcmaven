/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-10-28 03:40:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>HPlus</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\"/>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("</head>\r\n");
      out.write("Sök\r\n");
      out.write("<body>\r\n");
      out.write("<header id=\"home\" class=\"header\">\r\n");
      out.write("    <nav class=\"nav\" role=\"navigation\">\r\n");
      out.write("        <div class=\"container nav-elements\">\r\n");
      out.write("            <div class=\"branding\">\r\n");
      out.write("                <a href=\"#home\"><img src=\"images/hpluslogo.svg\" alt=\"Logo - H Plus Sports\"></a>\r\n");
      out.write("            </div><!-- branding -->\r\n");
      out.write("            <ul class=\"navbar\">\r\n");
      out.write("                <li><a href=\"/home\">home</a></li>\r\n");
      out.write("                <li><a href=\"/goToLogin\">login</a></li>\r\n");
      out.write("                <li><a href=\"/goToSearch\">search</a></li>\r\n");
      out.write("                <li><a href=\"redirect\">linkedin</a></li>\r\n");
      out.write("            </ul><!-- navbar -->\r\n");
      out.write("        </div><!-- container nav-elements -->\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"container tagline\">\r\n");
      out.write("        <h1 class=\"headline\">Our Mission</h1>\r\n");
      out.write("        <p>We support and encourage <em>active and healthy</em> lifestyles, by offering <em>ethically sourced</em> and <em>eco-friendly</em> nutritional products for the <em>performance-driven</em> athlete.</p>\r\n");
      out.write("    </div><!-- container tagline -->\r\n");
      out.write("</header><!-- #home -->\r\n");
      out.write("\r\n");
      out.write("<section id=\"history\" class=\"section\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"text-content\">\r\n");
      out.write("            <h2 class=\"headline\">Company History</h2>\r\n");
      out.write("            <p>In 2006, H+ Sport founder <a href=\"#employees-henrytwill\">Henry Twill</a> set out to create supplements and nutritional products made from the <em>purest ingredients</em> and backed by scientific and <em>performance data</em> – to provide a strong basis of <em>trust and accountability</em>.</p>\r\n");
      out.write("            <p>His quest began while training for his <em>first 5K marathon</em>, after recovering from a <em>lengthy injury</em> that left him with residual aches, pains, and decreased athletic performance. He yearned for <em>simple and natural ingredients</em>, in their purest form, instead of labels with <em>lengthy chemical names</em> and disclaimers. When no products lived up to his strict requirements, Henry set his sights on <em>creating products</em> that catered to his own vision.</p>\r\n");
      out.write("            <p>Today that vision has become H+ Sport…offering a variety of <a href=\"#products\">supplements, energy bars and rehydration solutions</a>. At the foundation of H+ Sports are products backed by scientific and performance data.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div><!-- container text -->\r\n");
      out.write("</section><!-- #history -->\r\n");
      out.write("\r\n");
      out.write("<section id=\"guarantee\" class=\"section\">\r\n");
      out.write("    <header class=\"imageheader\"></header>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h2 class=\"headline\">Our Guarantee &amp; Ideals</h2>\r\n");
      out.write("        <p>We’re committed to creating products that <em>defy convention</em>, and inspire our customers with pride and trust. In fact, we guarantee <a href=\"#products\">every product</a> we sell. If you’re not 100 percent happy with your purchase, you can return it during the first 60 days, <em>no questions asked</em>.</p>\r\n");
      out.write("        <p>Philanthropy is extremely important to us. In fact, <em>each employee volunteers</em> for organization of his or her choice, on the clock, for two hours each week. We know that doing good, breeds more doing good, and we’re happy to <em>promote a cycle</em> of volunteerism that just keeps on giving.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</section><!-- guarantee -->\r\n");
      out.write("\r\n");
      out.write("<section id=\"people\" class=\"section\">\r\n");
      out.write("    <header class=\"imageheader\"></header>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h2 class=\"headline\">People</h2>\r\n");
      out.write("        <div class=\"people-cards\">\r\n");
      out.write("            <div class=\"person-card\">\r\n");
      out.write("                <img src=\"images/employees/HenryTwill.jpg\" alt=\"HenryTwill Photo\">\r\n");
      out.write("                <div class=\"card-info\">\r\n");
      out.write("                    <h3 class=\"card-name\">Henry Twill, Jr</h3>\r\n");
      out.write("                    <h4 class=\"card-title\">CEO</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"card-text\">Henry Twill Jr. is the <em>founder</em> and CEO of H+ Sports. Previously he was an <em>athletic trainer</em> working with several top athletes, making sure that they had the direction and proper coaching to keep them at the <em>top of their game</em>. Henry’s passion for finding natural alternatives led him to developing H+ Sport Multivitamins. The supplements <em>became a success</em> with his clients and led to the creation of H+ Sports.</p>\r\n");
      out.write("            </div><!-- person-card -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"person-card\">\r\n");
      out.write("                <img src=\"images/employees/JessicaNewton.jpg\" alt=\"JessicaNewton Photo\">\r\n");
      out.write("                <div class=\"card-info\">\r\n");
      out.write("                    <h3 class=\"card-name\">Jessica Newton-Smith, MBA</h3>\r\n");
      out.write("                    <h4 class=\"card-title\">CFO</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"card-text\">Jessica Newton-Smith joined us in 2012 and brings more than <em>10 years</em> of financial management experience to H+ Sports, spanning a variety of companies and industries ranging from <em> Fortune 500 agencies</em> to start-ups. She has extensive experience working in <em>emerging markets</em> and in the consumer and retail sectors.</p>\r\n");
      out.write("            </div><!-- person-card -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"person-card\">\r\n");
      out.write("                <img src=\"images/employees/PhiTang.jpg\" alt=\"PhiTang Photo\">\r\n");
      out.write("                <div class=\"card-info\">\r\n");
      out.write("                    <h3 class=\"card-name\">Phi Tang, MBA</h3>\r\n");
      out.write("                    <h4 class=\"card-title\">Director of Product Development</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"card-text\">Phi Tang joined H+ Sports in <em>2007</em> as Manager of Marketing Research. He was promoted to Director of Product Development in 2011. He has made <em>major contributions</em> to the discovery, development, and implementation of the H+ Sport product lines. Before joining the company he worked as a <em>scientific expert</em> and brings vast knowledge of ingredients and <em>new technologies</em>.</p>\r\n");
      out.write("            </div><!-- person-card -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"person-card\">\r\n");
      out.write("                <img src=\"images/employees/MariaSontas.jpg\" alt=\"MariaSontas Photo\">\r\n");
      out.write("                <div class=\"card-info\">\r\n");
      out.write("                    <h3 class=\"card-name\">Maria Sontas</h3>\r\n");
      out.write("                    <h4 class=\"card-title\">Director of Marketing</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"card-text\">Maria Sontas has been with H+ Sport since 2010. She oversees the company’s <em>marketing strategy</em> – ensuring advertising campaigns, social media initiatives, and events are planned to <em>position the company</em> strongly in a competitive marketplace. Maria is a <em>competing triathlete</em> and her passion for our products shows in her unique ability to drive awareness and <em>increase our presence</em> around the world.</p>\r\n");
      out.write("            </div><!-- person-card -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"person-card\">\r\n");
      out.write("                <img src=\"images/employees/AngelaHaston.jpg\" alt=\"AngelaHaston Photo\">\r\n");
      out.write("                <div class=\"card-info\">\r\n");
      out.write("                    <h3 class=\"card-name\">Angela Hashton</h3>\r\n");
      out.write("                    <h4 class=\"card-title\">Director of Sales</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"card-text\">Angela Hashton joined the company in 2009, to <em>initiate new relationships</em> for our growing line of H+ Sports active apparel. After being with the company for a year, she was promoted to Director of Sales. Angela is the drive behind the H+ Sport <em>ACTIVE product line</em> and has an uncanny ability to formulate strategies that have helped build our unified sales force. <em>Educating people</em> about health and nutrition is something that Angela holds dear.</p>\r\n");
      out.write("            </div><!-- person-card -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"person-card\">\r\n");
      out.write("                <img src=\"images/employees/MichaelLewiston.jpg\" alt=\"MichaelLewiston Photo\">\r\n");
      out.write("                <div class=\"card-info\">\r\n");
      out.write("                    <h3 class=\"card-name\">Michael Lewiston</h3>\r\n");
      out.write("                    <h4 class=\"card-title\">MFA, Creative Director</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"card-text\">Michael Lewiston is a multi-faceted <em>creative person</em> who began his career as a designer for a small business firm, while also working as an independent <em>painter and sculptor</em>. In 2007, Henry Twill was impressed by Michael’s creative work in a national ad campaign for a high profile sports apparel company. Henry approached Michael, and asked him to <em>manage creative direction</em> for the H+ Sport ACTIVE apparel line.</p>\r\n");
      out.write("            </div><!-- person-card -->\r\n");
      out.write("        </div><!-- container -->\r\n");
      out.write("</section><!-- people -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <nav class=\"nav\" role=\"navigation\">\r\n");
      out.write("            <div class=\"container nav-elements\">\r\n");
      out.write("                <div class=\"branding\">\r\n");
      out.write("                    <a href=\"#home\"><img src=\"images/hpluslogo.svg\" alt=\"Logo - H Plus Sports\"></a>\r\n");
      out.write("                    <p class=\"address\">100 Main Street<br>\r\n");
      out.write("                        Seattle, WA 98144\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <p class=\"legal\">H+ Sport is a fictitious brand created by lynda.com solely for the purpose of training. All products and people associated with H+ Sport are also fictitious. Any resemblance to real brands, products, or people is purely coincidental. Information provided about the product is also fictitious and should not be construed to be representative of actual products on the market in a similar product category.</p>\r\n");
      out.write("    </div><!-- container -->\r\n");
      out.write("</footer><!-- footer -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
