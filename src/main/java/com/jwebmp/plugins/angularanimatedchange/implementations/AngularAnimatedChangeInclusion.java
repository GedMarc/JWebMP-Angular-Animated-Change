package com.jwebmp.plugins.angularanimatedchange.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class AngularAnimatedChangeInclusion implements IGuiceScanModuleInclusions<AngularAnimatedChangeInclusion>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.angularanimatedchange");
		return set;
	}
}
