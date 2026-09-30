package main.java.com.campus.filter;

public class LoggingFilter {
    

   @webFilter("/*")
    public class LoggingFilter extends Filter {
       

        @Override
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                throws IOException, ServletException {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            System.out.println("Incoming request: " + httpRequest.getMethod() + " " + httpRequest.getRequestURI());
            chain.doFilter(request, response);
        }

        @Override
        public void destroy() {
            // Cleanup code if needed
        }
    } 
}