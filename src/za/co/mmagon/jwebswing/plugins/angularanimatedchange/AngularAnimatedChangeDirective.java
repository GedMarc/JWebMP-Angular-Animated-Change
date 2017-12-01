package za.co.mmagon.jwebswing.plugins.angularanimatedchange;

import za.co.mmagon.FileTemplates;
import za.co.mmagon.jwebswing.base.angular.directives.AngularDirectiveBase;

/**
 * @author Marc Magon
 * @since 30 May 2017
 */
public class AngularAnimatedChangeDirective extends AngularDirectiveBase
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularAnimatedChangeDirective
	 */
	public AngularAnimatedChangeDirective()
	{
		super("AngularAnimatedChange");
	}

	@Override
	public String renderFunction()
	{
		return FileTemplates.getFileTemplate(AngularAnimatedChangeDirective.class, "animatedChange", "animatedChange.js").toString();
	}
}
