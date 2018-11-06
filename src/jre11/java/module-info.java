import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularanimatedchange.AngularAnimatedChangeDirective;
import com.jwebmp.plugins.angularanimatedchange.AngularAnimatedChangePageConfigurator;
import com.jwebmp.plugins.angularanimatedchange.implementations.AngularAnimatedChangeExclusionsModule;

module com.jwebmp.plugins.angularanimatedchange {
	exports com.jwebmp.plugins.angularanimatedchange;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with AngularAnimatedChangePageConfigurator;
	provides IAngularDirective with AngularAnimatedChangeDirective;

	provides IGuiceScanJarExclusions with AngularAnimatedChangeExclusionsModule;
	provides IGuiceScanModuleExclusions with AngularAnimatedChangeExclusionsModule;
}
