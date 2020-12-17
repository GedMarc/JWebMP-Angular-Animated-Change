import com.jwebmp.plugins.angularanimatedchange.implementations.AngularAnimatedChangeInclusion;

module com.jwebmp.plugins.angularanimatedchange {
	exports com.jwebmp.plugins.angularanimatedchange;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularanimatedchange.AngularAnimatedChangePageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.angularanimatedchange.AngularAnimatedChangeDirective;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with AngularAnimatedChangeInclusion;
	
	opens com.jwebmp.plugins.angularanimatedchange to com.jwebmp.core;
	
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularanimatedchange.implementations.AngularAnimatedChangeExclusionsModule;
}
