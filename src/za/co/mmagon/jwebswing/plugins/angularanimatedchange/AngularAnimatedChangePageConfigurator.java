package za.co.mmagon.jwebswing.plugins.angularanimatedchange;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * Allows for elements to have a zoom in animation by adding a class
 *
 * @author Marc Magon
 * @since 16 Jun 2017
 */
@PluginInformation(pluginName = "Angular Animated Change",
		pluginDescription = "Changes values with an animation",
		pluginUniqueName = "jwebswing-angular-animated-change",
		pluginVersion = "1.0.0",
		pluginCategories = "angular,animation,zoom, ui,web ui, framework",
		pluginSubtitle = "Apply an animation to changing values with this angular directive",
		pluginSourceUrl = "https://www.akveo.com/products.html",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Animated-Change/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Animated-Change",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://www.akveo.com/products.html",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularZoomInAnimation.jar/download"
)
@ComponentInformation(name = "Angular Animated Change",
		description = "Apply an animation to changing values with this angular directive",
		url = "https://www.akveo.com/products.html")
public class AngularAnimatedChangePageConfigurator extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularAnimatedChangePageConfigurator
	 */
	public AngularAnimatedChangePageConfigurator()
	{
		//Nothing needed
	}

	public static void addZoomEffect(ComponentHierarchyBase component)
	{
		component.addClass("zoomIn");
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(page.getBody(), true);
			AngularPageConfigurator.setRequired(page.getBody(), true);
			page.getAngular().getAngularDirectives().add(new AngularAnimatedChangeDirective());
		}
		return page;
	}
}
