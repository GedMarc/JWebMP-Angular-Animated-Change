package com.jwebmp.plugins.angularanimatedchange.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularAnimatedChangeExclusionsModule
		implements IGuiceScanModuleExclusions<AngularAnimatedChangeExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularanimatedchange");
		return strings;
	}
}
