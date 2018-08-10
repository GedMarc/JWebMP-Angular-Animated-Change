import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularanimatedchange.AngularAnimatedChangeDirective;
import com.jwebmp.plugins.angularanimatedchange.AngularAnimatedChangePageConfigurator;

module com.jwebmp.plugins.angularanimatedchange {
	exports com.jwebmp.plugins.angularanimatedchange;

	requires com.jwebmp.core;
	requires java.validation;

	provides IPageConfigurator with AngularAnimatedChangePageConfigurator;
	provides IAngularDirective with AngularAnimatedChangeDirective;
}
