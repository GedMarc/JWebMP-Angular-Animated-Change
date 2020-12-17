/*
 * Copyright (C) 2017 GedMarc
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

import com.jwebmp.core.Page;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

@PluginInformation(pluginName = "Angular Animated Change",
		pluginDescription = "Angular directive for applying an animation class to an element whenever a value changes. Useful for applying attention-calling animation like flashes or shakes.",
		pluginUniqueName = "jwebmp-angular-animatedchange",
		pluginVersion = "1.0.0",
		pluginCategories = "angular,animation,zoom, ui,web ui, framework",
		pluginSubtitle = "Apply an animation to changing values with this angular directive",
		pluginSourceUrl = "https://github.com/bendrucker/angular-animate-change",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Angular-Animated-Change/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Angular-Animated-Change",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://github.com/bendrucker/angular-animate-change",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.angular/jwebmp-angular-animated-change")
@ComponentInformation(name = "Angular Animated Change",
		description = "Apply an animation to changing values with this angular directive",
		url = "https://github.com/bendrucker/angular-animate-change")
/**
 * Allows for elements to have a zoom in animation by adding a class
 *
 * @author GedMarc
 * @since 16 Jun 2017
 */ public class AngularAnimatedChangePageConfigurator
		implements IPageConfigurator<AngularAnimatedChangePageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new AngularAnimatedChangePageConfigurator
	 */
	public AngularAnimatedChangePageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return AngularAnimatedChangePageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		AngularAnimatedChangePageConfigurator.enabled = mustEnable;
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

	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return AngularAnimatedChangePageConfigurator.enabled;
	}
}
