/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularanimatedchange;

import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.base.ComponentHierarchyBase;
import com.jwebmp.base.angular.AngularPageConfigurator;
import com.jwebmp.plugins.ComponentInformation;
import com.jwebmp.plugins.PluginInformation;
import com.jwebmp.plugins.jquery.JQueryPageConfigurator;


@PluginInformation(pluginName = "Angular Animated Change",
		pluginDescription = "Changes values with an animation",
		pluginUniqueName = "jwebswing-angular-animatedchange",
		pluginVersion = "1.0.0",
		pluginCategories = "angular,animation,zoom, ui,web ui, framework",
		pluginSubtitle = "Apply an animation to changing values with this angular directive",
		pluginSourceUrl = "https://www.akveo.com/products.html",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Animated-Change/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Animated-Change",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://www.akveo.com/products.html",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularZoomInAnimation.jar/download") @ComponentInformation(name = "Angular Animated Change",
		description = "Apply an animation to changing values with this angular directive",
		url = "https://www.akveo.com/products.html")
/**
 * Allows for elements to have a zoom in animation by adding a class
 *
 * @author Marc Magon
 * @since 16 Jun 2017
 */ public class AngularAnimatedChangePageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularAnimatedChangePageConfigurator
	 */
	public AngularAnimatedChangePageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Adds the zoom effect to the component
	 *
	 * @param component
	 */
	public static void addZoomEffect(ComponentHierarchyBase component)
	{
		component.addClass("zoomIn");
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
		}
		return page;
	}
}
