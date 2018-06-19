import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class PurchaseOrderServlet extends HttpServlet
{
	PurchaseOrderList purchaseorder;

	public void init() throws ServletException {
		PurchaseOrderDatabase po = new PurchaseOrderDatabase();
		purchaseorder = po.getFunctionList();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/xml");
		PrintWriter out = res.getWriter();
		out.println("<purchaseorder>");
	// 	String assigned = req.getParameter("assigned");
	// 	String location = req.getParameter("location");
	// 	if(assigned == null && location == null) {
	// 		for(int i=0; i<assets.getAssetCount(); i++) {
	// 			Asset a = assets.getAssetByIndex(i);
	// 			out.println("<asset>");
	// 				out.println("<id>");
	// 				out.println(Integer.toString(a.getId()));
	// 				out.println("</id><name>");
	// 				out.println(a.getName());
	// 				out.println("</name><price>");
	// 				out.println(Integer.toString(a.getmonetaryValue()));
	// 				out.println("</price>");
	// 				if(a instanceof Building) {
	// 					Building b = (Building)a;
	// 					out.println("<locationid>");
	// 					out.println(b.getLocation());
	// 					out.println("</locationid>");
	// 				}
	// 				else if(a instanceof SoftwareLicense) {
	// 					SoftwareLicense s = (SoftwareLicense)a;
	// 					out.println("<personid>");
	// 					out.println(s.getAssignedTo());
	// 					out.println("</personid>");
	// 				}
	// 				else if(a instanceof Table) {
	// 					Table t = (Table)a;
	// 					out.println("<locationid>");
	// 					out.println(t.getLocation());
	// 					out.println("</locationid>");
	// 					out.println("<personid>");
	// 					out.println(t.getAssignedTo());
	// 					out.println("</personid>");
	// 				}
	// 			out.println("</asset>");
	// 		}
	// 	}
		
	// 	else if(assigned != null) {
	// 		for(int i=0; i<assets.getAssetCount(); i++) {
	// 			Asset a = assets.getAssetByIndex(i);
	// 			if(a instanceof AssignableAsset) {
	// 				AssignableAsset aa = (AssignableAsset)a;
	// 				if(aa.getAssignedTo().toLowerCase().contains(assigned.toLowerCase())) {
	// 					out.println("<asset>");
	// 						out.println("<id>");
	// 						out.println(Integer.toString(a.getId()));
	// 						out.println("</id><name>");
	// 						out.println(a.getName());
	// 						out.println("</name><price>");
	// 						out.println(Integer.toString(a.getmonetaryValue()));
	// 						out.println("</price>");
	// 						if(a instanceof Table) {
	// 							Table t = (Table)a;
	// 							out.println("<locationid>");
	// 							out.println(t.getLocation());
	// 							out.println("</locationid>");
	// 						}
	// 						out.println("<assignedTo>");
	// 						out.println(aa.getAssignedTo());
	// 						out.println("</assignedTo>");
	// 					out.println("</asset>");
	// 				}
	// 			}
	// 		}
	// 	}
	// 	else if(location != null) {
	// 		for(int i=0; i<assets.getAssetCount(); i++) {
	// 			Asset a = assets.getAssetByIndex(i);
	// 			if(a instanceof AssetWithLocation) {
	// 				AssetWithLocation awl = (AssetWithLocation)a;
	// 				if(awl.getLocation().toLowerCase().contains(location.toLowerCase())) {
	// 					out.println("<asset>");
	// 						out.println("<id>");
	// 						out.println(Integer.toString(a.getId()));
	// 						out.println("</id><name>");
	// 						out.println(a.getName());
	// 						out.println("</name><price>");
	// 						out.println(Integer.toString(a.getmonetaryValue()));
	// 						out.println("</price>");
	// 						out.println("<locationid>");
	// 						out.println(awl.getLocation());
	// 						out.println("</locationid>");
	// 						if(a instanceof Table) {
	// 							Table t = (Table)a;
	// 							out.println("<assignedTo>");
	// 							out.println(t.getAssignedTo());
	// 							out.println("</assignedTo>");				
	// 						}							
	// 					out.println("</asset>");
	// 				}
	// 			}
	// 		}
	// 	}
	// 	out.println("</assets>");
	}

	public void destroy() {
		purchaseorder = null;
	}
}
