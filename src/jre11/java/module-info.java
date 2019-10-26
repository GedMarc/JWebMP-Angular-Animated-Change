module com.jwebmp.plugins.angularanimatedchange {
	exports com.jwebmp.plugins.angularanimatedchange;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularanimatedchange.AngularAnimatedChangePageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.angularanimatedchange.AngularAnimatedChangeDirective;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularanimatedchange.implementations.AngularAnimatedChangeExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularanimatedchange.implementations.AngularAnimatedChangeExclusionsModule;
}
