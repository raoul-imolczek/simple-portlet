package eu.eisti.p2k19.fintech.portfolio.web.portlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;



@Component (
		immediate = true,
		property = {
				"com.liferay.portlet.css-class-wrapper=portlet-jsp",
				"com.liferay.portlet.display-category=category.sample",
				"com.liferay.portlet.header-portlet-css=/css/main.css",
				"com.liferay.portlet.instanceable=true",
				"javax.portlet.display-name=Simple Portlet",
				"javax.portlet.init-param.template-path=/",
				"javax.portlet.init-param.view-template=/view.jsp",
				"javax.portlet.name=portfolio",
				"javax.portlet.resource-bundle=content.Language",
				"javax.portlet.security-role-ref=power-user,user"
			},		
		service = Portlet.class
		)
public class SimplePortlet extends MVCPortlet {
	
}
